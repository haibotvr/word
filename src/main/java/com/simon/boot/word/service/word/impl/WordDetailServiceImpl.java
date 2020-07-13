package com.simon.boot.word.service.word.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.simon.boot.word.dao.word.WordChapterMapper;
import com.simon.boot.word.dao.word.WordDetailMapper;
import com.simon.boot.word.dao.word.WordLibraryMapper;
import com.simon.boot.word.eumn.BusinessExceptionMessage;
import com.simon.boot.word.eumn.DetailStatus;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.kits.ExcelUtils;
import com.simon.boot.word.framework.kits.JsonUtil;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.*;
import com.simon.boot.word.qc.DetailQC;
import com.simon.boot.word.service.word.WordDetailService;
import com.simon.boot.word.vo.TmChapterExcelVO;
import com.simon.boot.word.vo.TmExcelVO;
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
import java.util.Objects;

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
        List<TmExcelVO> tmExcelVOS = Lists.newArrayList();
        long t2 = System.currentTimeMillis();
        log.info(String.format("read over! cost:%sms", (t2 - t1)));
        if(Objects.isNull(chapterId)){
            throw new BusinessException(BusinessExceptionMessage.VALIDATION_FAIL.getValue(), "空的章节ID");
        }
        for (TmChapterExcelVO tmChapterExcelVO : list) {
            TmExcelVO vo = new TmExcelVO();
            vo.setWordCh(tmChapterExcelVO.getWordCh());
            vo.setWordEn(tmChapterExcelVO.getWordEn());
            vo.setChapterId(chapterId);
            vo.setWordPhoneticSymbol(tmChapterExcelVO.getWordPhoneticSymbol());
            tmExcelVOS.add(vo);
        }
        this.dealWithExcel(t2, tmExcelVOS);
        return ReturnValue.success().setMessage("导入完成");
    }

    @Override
    public void dealWithExcel(Long t2, List<TmExcelVO> tmExcelVOS) throws BusinessException {
        //统一校验
        if(CollectionUtils.isEmpty(tmExcelVOS)){
            throw new BusinessException(BusinessExceptionMessage.EXCEL_IS_NULL.getValue(), BusinessExceptionMessage.EXCEL_IS_NULL.getName());
        }
        for (TmExcelVO tmExcelVO : tmExcelVOS) {
            if(Objects.isNull(tmExcelVO.getChapterId())){
                throw new BusinessException(BusinessExceptionMessage.VALIDATION_FAIL.getValue(), "空的章节ID");
            }
            if(StringUtils.isBlank(tmExcelVO.getWordEn())){
                throw new BusinessException(BusinessExceptionMessage.VALIDATION_FAIL.getValue(), "空的英文单词");
            }
            if(StringUtils.isBlank(tmExcelVO.getWordCh())){
                throw new BusinessException(BusinessExceptionMessage.VALIDATION_FAIL.getValue(), "空的中文解释");
            }
        }
        long t3 = 1L;
        for (TmExcelVO tmExcelVO : tmExcelVOS) {
            String wordEn = tmExcelVO.getWordEn();
            WordLibraryExample example = new WordLibraryExample();
            WordLibraryExample.Criteria criteria = example.createCriteria();
            criteria.andNameEnglishEqualTo(wordEn.trim());
            List<WordLibrary> libraries = libraryMapper.selectByExample(example);
            WordDetail detail = new WordDetail();
            detail.setWordEn(wordEn.trim());
            detail.setChapterId(tmExcelVO.getChapterId());
            List<WordDetailChVO> detailChVOS = Lists.newArrayList();
            t3++;
            if(CollectionUtils.isNotEmpty(libraries)){
                WordLibrary library = libraries.get(0);
                detail.setWordPhoneticSymbol("[" + library.getVoiceUk().trim() + "]");
                String nameCh = library.getNameCh();
                nameCh = nameCh.replaceAll("\r|\n", "");
                String[] nameChV1 = nameCh.split("<br>");
                try {
                    for (String str : nameChV1) {
                        t3++;
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
            }else{
                detail.setWordPhoneticSymbol("[unknown]");
                WordDetailChVO detailChVO = new WordDetailChVO();
                detailChVO.setPos("unknown");
                detailChVO.setMeaning(tmExcelVO.getWordCh().trim());
                detailChVO.setKey(t2 + t3);
                detailChVOS.add(detailChVO);
                log.info("Excel中的单词在单词库中不存在,word:{},message:{}", wordEn, JsonUtil.toString(tmExcelVO));
            }
            detail.setWordCh(JsonUtil.toString(detailChVOS));
            this.add(detail);
            log.info("导入单词,word:{},message:{}", wordEn, JsonUtil.toString(detail));
        }
    }

}
