package com.simon.boot.word.service.word.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.word.WordChapterMapper;
import com.simon.boot.word.eumn.ChapterStatus;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.kits.ExcelUtils;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.WordChapter;
import com.simon.boot.word.pojo.word.WordChapterExample;
import com.simon.boot.word.qc.ChapterQC;
import com.simon.boot.word.service.word.WordChapterService;
import com.simon.boot.word.service.word.WordDetailService;
import com.simon.boot.word.vo.TmExcelVO;
import io.micrometer.core.instrument.util.StringUtils;
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
public class WordChapterServiceImpl implements WordChapterService {

    private static Logger log = LoggerFactory.getLogger(WordChapterServiceImpl.class);

    @Autowired
    WordChapterMapper mapper;

    @Autowired
    WordDetailService detailService;

    @Override
    public ReturnValue add(WordChapter record) throws BusinessException {
        record.setCreateTime(new Date());
        record.setEwStatus(ChapterStatus.AVAILABLE.getValue());
        return ReturnValue.success(mapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(WordChapter record) throws BusinessException {
        record.setUpdateTime(new Date());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        WordChapter record = new WordChapter();
        record.setId(id);
        record.setEwStatus(ChapterStatus.UNAVAILABLE.getValue());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue findByPage(ChapterQC qc) throws BusinessException {
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());
        WordChapterExample example = new WordChapterExample();
        example.setOrderByClause("create_time desc");
        WordChapterExample.Criteria criteria = example.createCriteria();
        criteria.andEwStatusEqualTo(ChapterStatus.AVAILABLE.getValue());
        criteria.andTmIdEqualTo(qc.getTmId());
        if(StringUtils.isNotBlank(qc.getChapterName())){
            criteria.andChapterNameLike("%" + qc.getChapterName() + "%");
        }
        PageInfo<WordChapter> info = new PageInfo<>(mapper.selectByExample(example));
        return ReturnValue.success().setData(info);
    }

    @Override
    public ReturnValue readExcel(MultipartFile file) throws BusinessException {
        long t1 = System.currentTimeMillis();
        List<TmExcelVO> tmExcelVOS = ExcelUtils.readExcel("", TmExcelVO.class, file);
        long t2 = System.currentTimeMillis();
        log.info(String.format("read over! cost:%sms", (t2 - t1)));
        detailService.dealWithExcel(t2, tmExcelVOS);
        return ReturnValue.success().setMessage("导入完成");
    }
}
