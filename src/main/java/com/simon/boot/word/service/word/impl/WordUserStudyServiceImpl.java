package com.simon.boot.word.service.word.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.simon.boot.word.dao.word.*;
import com.simon.boot.word.eumn.ChapterStatus;
import com.simon.boot.word.eumn.DetailStatus;
import com.simon.boot.word.eumn.StudyLogStatus;
import com.simon.boot.word.eumn.StudyStatus;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.*;
import com.simon.boot.word.qc.StudyQC;
import com.simon.boot.word.service.word.WordUserStudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author simon.wei
 */
@Service
public class WordUserStudyServiceImpl implements WordUserStudyService {

    @Autowired
    WordUserStudyMapper wordUserStudyMapper;

    @Autowired
    WordUserStudyLogMapper wordUserStudyLogMapper;

    @Autowired
    WordChapterMapper wordChapterMapper;

    @Autowired
    WordTeachMaterialMapper wordTeachMaterialMapper;

    @Autowired
    WordDetailMapper wordDetailMapper;

    @Override
    public ReturnValue reStudy(Long id, Long userId) throws BusinessException {
        WordUserStudyExample example = new WordUserStudyExample();
        WordUserStudyExample.Criteria criteria = example.createCriteria();
        criteria.andTmIdEqualTo(id);
        criteria.andUserIdEqualTo(userId);
        return ReturnValue.success(wordUserStudyMapper.deleteByExample(example)).setMessage("删除成功");
    }

    @Override
    public ReturnValue add(WordUserStudy record) throws BusinessException {
        record.setCreateTime(new Date());
        record.setEwStatus(StudyStatus.AVAILABLE.getValue());
        if(record.getTmId() != null){
            WordTeachMaterial teachMaterial = wordTeachMaterialMapper.selectByPrimaryKey(record.getTmId());
            if(teachMaterial != null){
                record.setTmName(teachMaterial.getTmName());
            }
        }
        if(record.getChapterId() != null){
            WordChapter chapter = wordChapterMapper.selectByPrimaryKey(record.getChapterId());
            if(chapter != null){
                record.setChapterName(chapter.getChapterName());
            }
        }
        return ReturnValue.success(wordUserStudyMapper.insertSelective(record));
    }

    @Override
    public ReturnValue addLog(WordUserStudyLog record) throws BusinessException {
        record.setCreateTime(new Date());
        record.setEwStatus(StudyLogStatus.AVAILABLE.getValue());
        if(record.getTmId() != null){
            WordTeachMaterial teachMaterial = this.selectWordTeachMaterial(record.getTmId());
            if(teachMaterial != null){
                record.setTmName(teachMaterial.getTmName());
            }
        }
        if(record.getChapterId() != null){
            WordChapter chapter = this.selectWordChapter(record.getChapterId());
            if(chapter != null){
                record.setChapterName(chapter.getChapterName());
            }
        }
        return ReturnValue.success(wordUserStudyLogMapper.insertSelective(record));
    }

    @Override
    public ReturnValue findWords(Long id, Long userId) throws BusinessException {
        //id 为教材ID，userId为用户ID，chapterId为章节ID
        //查询本教材已学习的最大章节ID，如果是空，说明还未学习
        WordUserStudyExample example = new WordUserStudyExample();
        example.setOrderByClause("chapter_id desc");
        WordUserStudyExample.Criteria logCriteria = example.createCriteria();
        logCriteria.andUserIdEqualTo(userId);
        logCriteria.andTmIdEqualTo(id);
        List<WordUserStudy> studies = wordUserStudyMapper.selectByExample(example);
        Long chapterId = null;
        if(CollectionUtils.isEmpty(studies)){
            //查询最开始一章
            List<WordChapter> wordChapters = selectWordChapter(id, "ASC");
            if(CollectionUtils.isEmpty(wordChapters)){
                return ReturnValue.error().setMessage("没有章节信息");
            }
            chapterId = wordChapters.get(0).getId();
        }else{
            //查询本教材章节最大的ID，如果相等说明教材已学完，返回空值，如果不等，说明还有章节未学习
            Long logChapterId = studies.get(0).getChapterId();
            List<WordChapter> wordChapters = selectWordChapter(id, "DESC");
            //相等
            if(wordChapters.get(0).getId().equals(logChapterId)){
                //已经学了最后一章
                return ReturnValue.success().setMessage("已经学完最后一章");
            }
            //不相等
            else{
                for (int i = 0; i < wordChapters.size(); i++) {
                    if(wordChapters.get(i).getId().equals(logChapterId)){
                        chapterId = wordChapters.get(i - 1).getId();
                        break;
                    }
                }
            }
        }
        //查询章节单词
        List<WordDetail> details = selectWordDetail(chapterId);
        //复制三份并乱序
        List<WordDetail> result = Lists.newArrayList();
        for(int i = 0; i < 3; i++){
            result.addAll(details);
        }
        Collections.shuffle(result);
        return ReturnValue.success().setData(result);
    }

    @Override
    public ReturnValue findWordDetail(Long id) throws BusinessException {
        return ReturnValue.success(this.selectWordDetail(id));
    }

    @Override
    public ReturnValue findByPage(StudyQC qc, WordUser user) throws BusinessException {
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());
        WordUserStudyExample example = new WordUserStudyExample();
        WordUserStudyExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(user.getId());
        example.setOrderByClause("create_time desc");
        PageInfo<WordUserStudy> info = new PageInfo<>(wordUserStudyMapper.selectByExample(example));
        return ReturnValue.success().setData(info);
    }

    private List<WordChapter> selectWordChapter(Long tmId, String orderBy){
        WordChapterExample example = new WordChapterExample();
        example.setOrderByClause("id " + orderBy);
        WordChapterExample.Criteria criteria = example.createCriteria();
        criteria.andTmIdEqualTo(tmId);
        criteria.andEwStatusEqualTo(ChapterStatus.AVAILABLE.getValue());
        return wordChapterMapper.selectByExample(example);
    }

    private List<WordDetail> selectWordDetail(Long chapterId){
        WordDetailExample example = new WordDetailExample();
        example.setOrderByClause("id asc");
        WordDetailExample.Criteria criteria = example.createCriteria();
        criteria.andChapterIdEqualTo(chapterId);
        criteria.andEwStatusEqualTo(DetailStatus.AVAILABLE.getValue());
        return wordDetailMapper.selectByExample(example);
    }

    private WordTeachMaterial selectWordTeachMaterial(Long tmId){
        return wordTeachMaterialMapper.selectByPrimaryKey(tmId);
    }

    private WordChapter selectWordChapter(Long chapterId){
        return wordChapterMapper.selectByPrimaryKey(chapterId);
    }

}
