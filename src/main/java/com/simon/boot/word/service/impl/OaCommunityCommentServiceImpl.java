package com.simon.boot.word.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.OaCommunityCommentMapper;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.OaCommunityComment;
import com.simon.boot.word.pojo.OaCommunityCommentExample;
import com.simon.boot.word.pojo.OaNotice;
import com.simon.boot.word.pojo.OaNoticeExample;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.service.OaCommunityCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author simon.wei
 */
@Service
public class OaCommunityCommentServiceImpl implements OaCommunityCommentService {

    @Autowired
    OaCommunityCommentMapper mapper;

    @Override
    public ReturnValue add(OaCommunityComment record) throws BusinessException {
        record.setCreateTime(new Date());
        return ReturnValue.success(mapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(OaCommunityComment record) throws BusinessException {
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
        OaCommunityCommentExample example = new OaCommunityCommentExample();
        example.setOrderByClause("create_time desc");
        PageInfo<OaCommunityComment> info = new PageInfo<>(mapper.selectByExampleWithBLOBs(example));
        return ReturnValue.success().setData(info);
    }
}
