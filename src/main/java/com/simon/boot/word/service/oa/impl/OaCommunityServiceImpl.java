package com.simon.boot.word.service.oa.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.oa.OaCommunityCommentMapper;
import com.simon.boot.word.dao.oa.OaCommunityMapper;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.oa.OaCommunity;
import com.simon.boot.word.pojo.oa.OaCommunityCommentExample;
import com.simon.boot.word.pojo.oa.OaCommunityExample;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.service.oa.OaCommunityService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author simon.wei
 */
@Service
public class OaCommunityServiceImpl implements OaCommunityService {

    @Autowired
    OaCommunityMapper mapper;

    @Autowired
    OaCommunityCommentMapper commentMapper;

    @Override
    public ReturnValue add(OaCommunity record) throws BusinessException {
        record.setCreateTime(new Date());
        return ReturnValue.success(mapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(OaCommunity record) throws BusinessException {
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
        OaCommunityExample example = new OaCommunityExample();
        example.setOrderByClause("create_time desc");
        PageInfo<OaCommunity> info = new PageInfo<>(mapper.selectByExampleWithBLOBs(example));
        List<OaCommunity> list = info.getList();
        if(CollectionUtils.isNotEmpty(list)){
            for (OaCommunity oaCommunity : list) {
                Long communityId = oaCommunity.getId();
                OaCommunityCommentExample exampleComment = new OaCommunityCommentExample();
                exampleComment.setOrderByClause("create_time desc");
                OaCommunityCommentExample.Criteria criteria = exampleComment.createCriteria();
                criteria.andCommunityIdEqualTo(communityId);
                oaCommunity.setComments(commentMapper.selectByExampleWithBLOBs(exampleComment));
            }
        }
        return ReturnValue.success().setData(info);
    }
}
