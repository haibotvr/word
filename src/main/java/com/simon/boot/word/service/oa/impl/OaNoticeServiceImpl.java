package com.simon.boot.word.service.oa.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.oa.OaNoticeMapper;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.oa.OaNotice;
import com.simon.boot.word.pojo.oa.OaNoticeExample;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.service.oa.OaNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author simon.wei
 */
@Service
public class OaNoticeServiceImpl implements OaNoticeService {

    @Autowired
    OaNoticeMapper mapper;

    @Override
    public ReturnValue add(OaNotice record) throws BusinessException {
        record.setCreateTime(new Date());
        return ReturnValue.success(mapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(OaNotice record) throws BusinessException {
        record.setUpdateTime(new Date());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        return ReturnValue.success(mapper.deleteByPrimaryKey(id));
    }

    @Override
    public ReturnValue findByPage(PageQC qc) throws BusinessException {
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());
        OaNoticeExample example = new OaNoticeExample();
        example.setOrderByClause("create_time desc");
        PageInfo<OaNotice> info = new PageInfo<>(mapper.selectByExampleWithBLOBs(example));
        return ReturnValue.success().setData(info);
    }
}
