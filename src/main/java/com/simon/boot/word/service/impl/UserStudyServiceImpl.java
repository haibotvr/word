package com.simon.boot.word.service.impl;

import com.simon.boot.word.dao.UserStudyLogMapper;
import com.simon.boot.word.dao.WordChapterMapper;
import com.simon.boot.word.dao.WordDetailMapper;
import com.simon.boot.word.eumn.ChapterStatus;
import com.simon.boot.word.eumn.StudyLogStatus;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.*;
import com.simon.boot.word.service.UserStudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

/**
 * @author simon.wei
 */
@Service
public class UserStudyServiceImpl implements UserStudyService {

    @Autowired
    UserStudyLogMapper userStudyLogMapper;

    @Autowired
    WordChapterMapper wordChapterMapper;

    @Autowired
    WordDetailMapper wordDetailMapper;

    @Override
    public ReturnValue reStudy(Long id, Long userId) throws BusinessException {
        UserStudyLogExample example = new UserStudyLogExample();
        UserStudyLogExample.Criteria criteria = example.createCriteria();
        criteria.andTmIdEqualTo(id);
        criteria.andUserIdEqualTo(userId);
        return ReturnValue.success(userStudyLogMapper.deleteByExample(example)).setMessage("删除成功");
    }

    @Override
    public ReturnValue add(UserStudyLog record) throws BusinessException {
        record.setCreateTime(new Date());
        record.setEwStatus(StudyLogStatus.AVAILABLE.getValue());
        return ReturnValue.success(userStudyLogMapper.insertSelective(record));
    }

    @Override
    public ReturnValue findWords(Long id, Long userId) throws BusinessException {
        //id 为教材ID，userId为用户ID，chapterId为章节ID
        //查询本教材已学习的最大章节ID，如果是空，说明还未学习
        UserStudyLogExample logExample = new UserStudyLogExample();
        logExample.setOrderByClause("chapter_id desc");
        UserStudyLogExample.Criteria logCriteria = logExample.createCriteria();
        logCriteria.andUserIdEqualTo(userId);
        logCriteria.andTmIdEqualTo(id);
        List<UserStudyLog> logs = userStudyLogMapper.selectByExample(logExample);
        Long chapterId = null;
        if(CollectionUtils.isEmpty(logs)){
            //查询最开始一章
            List<WordChapter> wordChapters = selectWordChapter(id, "ASC");
            chapterId = wordChapters.get(0).getId();
        }else{
            //查询本教材章节最大的ID，如果相等说明教材已学完，返回空值，如果不等，说明还有章节未学习
            Long logChapterId = logs.get(0).getChapterId();
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
        return  ReturnValue.success().setData(selectWordDetail(chapterId));
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
        criteria.andEwStatusEqualTo(ChapterStatus.AVAILABLE.getValue());
        return wordDetailMapper.selectByExample(example);
    }

}
