package com.simon.boot.word.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.WordRoleMapper;
import com.simon.boot.word.eumn.RoleStatus;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordRole;
import com.simon.boot.word.pojo.WordRoleExample;
import com.simon.boot.word.pojo.WordUser;
import com.simon.boot.word.qc.RoleQC;
import com.simon.boot.word.service.WordRoleService;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author simon.wei
 */
@Service
public class WordRoleServiceImpl implements WordRoleService {

    @Autowired
    WordRoleMapper mapper;

    @Override
    public ReturnValue add(WordRole record) throws BusinessException {
        record.setCreateTime(new Date());
        record.setEwStatus(RoleStatus.AVAILABLE.getValue());
        return ReturnValue.success(mapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(WordRole record) throws BusinessException {
        record.setUpdateTime(new Date());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        WordRole record = new WordRole();
        record.setId(id);
        record.setEwStatus(RoleStatus.UNAVAILABLE.getValue());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue findByPage(RoleQC qc) throws BusinessException {
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());
        WordRoleExample example = new WordRoleExample();
        WordRoleExample.Criteria criteria = example.createCriteria();
        criteria.andEwStatusEqualTo(RoleStatus.AVAILABLE.getValue());
        example.setOrderByClause("create_time desc");
        if(StringUtils.isNotBlank(qc.getRoleName())){
            criteria.andRoleNameLike("%" + qc.getRoleName() + "%");
        }
        PageInfo<WordRole> info = new PageInfo<>(mapper.selectByExample(example));
        return ReturnValue.success().setData(info);
    }

    @Override
    public ReturnValue findRoles(WordUser user) throws BusinessException {
        WordRoleExample example = new WordRoleExample();
        WordRoleExample.Criteria criteria = example.createCriteria();
        criteria.andEwStatusEqualTo(RoleStatus.AVAILABLE.getValue());
        example.setOrderByClause("create_time desc");
        return ReturnValue.success().setData(mapper.selectByExample(example));
    }
}
