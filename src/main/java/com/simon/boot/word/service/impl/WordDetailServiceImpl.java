package com.simon.boot.word.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.simon.boot.word.dao.WordChapterMapper;
import com.simon.boot.word.dao.WordDetailMapper;
import com.simon.boot.word.dao.WordLibraryMapper;
import com.simon.boot.word.dao.WordTeachMaterialMapper;
import com.simon.boot.word.eumn.DetailStatus;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.kits.ExcelUtils;
import com.simon.boot.word.framework.kits.JsonUtil;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.*;
import com.simon.boot.word.qc.DetailQC;
import com.simon.boot.word.service.WordDetailService;
import com.simon.boot.word.vo.TmChapterExcelVO;
import com.simon.boot.word.vo.WordDetailChVO;
import io.micrometer.core.instrument.util.StringUtils;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

/**
 * @author simon.wei
 */
@Service
public class WordDetailServiceImpl implements WordDetailService {

    private static Logger log = LoggerFactory.getLogger(WordDetailServiceImpl.class);

    @Autowired
    WordDetailMapper mapper;

    @Autowired
    WordChapterMapper chapterMapper;

    @Autowired
    WordLibraryMapper libraryMapper;

    @Override
    public ReturnValue add(WordDetail record) throws BusinessException {
        record.setCreateTime(new Date());
        record.setEwStatus(DetailStatus.AVAILABLE.getValue());
        if(record.getChapterId() != null){
            WordChapter chapter = chapterMapper.selectByPrimaryKey(record.getChapterId());
            if(chapter != null){
                record.setTmId(chapter.getTmId());
            }
        }
        return ReturnValue.success(mapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(WordDetail record) throws BusinessException {
        record.setUpdateTime(new Date());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        WordDetail record = new WordDetail();
        record.setId(id);
        record.setEwStatus(DetailStatus.UNAVAILABLE.getValue());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue findByPage(DetailQC qc) throws BusinessException {
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());
        WordDetailExample example = new WordDetailExample();
        WordDetailExample.Criteria criteria = example.createCriteria();
        criteria.andChapterIdEqualTo(qc.getChapterId());
        criteria.andEwStatusEqualTo(DetailStatus.AVAILABLE.getValue());
        if(StringUtils.isNotBlank(qc.getWordEn())){
            criteria.andWordEnLike("%" + qc.getWordEn() + "%");
        }
        PageInfo<WordDetail> info = new PageInfo<>(mapper.selectByExample(example));
        return ReturnValue.success().setData(info);
    }

    @Override
    public ReturnValue readExcel(MultipartFile file, Long chapterId) throws BusinessException {
        long t1 = System.currentTimeMillis();
        List<TmChapterExcelVO> list = ExcelUtils.readExcel("", TmChapterExcelVO.class, file);
        long t2 = System.currentTimeMillis();
        System.out.println(String.format("read over! cost:%sms", (t2 - t1)));
        long t3 = 1L;
        for (TmChapterExcelVO tmChapterExcelVO : list) {
            String wordEn = tmChapterExcelVO.getWordEn();
            if(StringUtils.isBlank(wordEn)){
                log.info("Excel中存在空的单词,message:{}", JsonUtil.toString(tmChapterExcelVO));
                continue;
            }
            WordLibraryExample example = new WordLibraryExample();
            WordLibraryExample.Criteria criteria = example.createCriteria();
            criteria.andNameEnglishEqualTo(wordEn.trim());
            List<WordLibrary> libraries = libraryMapper.selectByExample(example);
            if(CollectionUtils.isNotEmpty(libraries)){
                WordDetail detail = new WordDetail();
                detail.setWordEn(wordEn.trim());
                detail.setChapterId(chapterId);
                WordLibrary library = libraries.get(0);
                detail.setWordPhoneticSymbol("[" + library.getVoiceUk().trim() + "]");
                String nameCh = library.getNameCh();
                nameCh = nameCh.replaceAll("\r|\n", "");
                String[] nameChV1 = nameCh.split("<br>");
                List<WordDetailChVO> detailChVOS = Lists.newArrayList();
                t3++;
                try {
                    for (String str : nameChV1) {
                        WordDetailChVO detailChVO = new WordDetailChVO();
                        if(str.indexOf(". ") != -1){
                            String[] nameChV2 = str.split(". ");
                            detailChVO.setPos(nameChV2[0].trim());
                            detailChVO.setMeaning(str.substring(str.indexOf(". ") + 1).trim());
                        }else {
                            detailChVO.setPos("unknown");
                            detailChVO.setMeaning(str.trim());
                        }
                        detailChVO.setKey(t2 + t3);
                        detailChVOS.add(detailChVO);
                    }
                } catch (Exception e) {
                    log.error("导入单词错误,word:{},message:{}", wordEn, e);
                    continue;
                }
                detail.setWordCh(JsonUtil.toString(detailChVOS));
                this.add(detail);
                log.info("导入单词,word:{},message:{}", wordEn, JsonUtil.toString(detail));
            }else{
                log.info("Excel中的单词在单词库中不存在,word:{},message:{}", wordEn, JsonUtil.toString(tmChapterExcelVO));
            }
        }
        return ReturnValue.success().setMessage("导入完成");
    }

}
