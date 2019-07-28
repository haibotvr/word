package com.simon.boot.word.service;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.OaCommunityComment;
import com.simon.boot.word.qc.PageQC;

/**
 * @author simon.wei
 */
public interface OaCommunityCommentService {

    ReturnValue add(OaCommunityComment record) throws BusinessException;

    ReturnValue edit(OaCommunityComment record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue findByPage(PageQC qc) throws BusinessException;

}
