package com.simon.boot.word.service.word;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.WordRole;
import com.simon.boot.word.pojo.word.WordUser;
import com.simon.boot.word.qc.RoleQC;

/**
 * @author simon.wei
 */
public interface WordRoleService {

    ReturnValue add(WordRole record) throws BusinessException;

    ReturnValue edit(WordRole record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue findByPage(RoleQC qc) throws BusinessException;

    ReturnValue findRoles(WordUser wordUser) throws BusinessException;
}
