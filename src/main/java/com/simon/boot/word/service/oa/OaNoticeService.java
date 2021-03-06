package com.simon.boot.word.service.oa;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.oa.OaNotice;
import com.simon.boot.word.qc.PageQC;

/**
 * @author simon.wei
 */
public interface OaNoticeService {

    ReturnValue add(OaNotice record) throws BusinessException;

    ReturnValue edit(OaNotice record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue findByPage(PageQC qc) throws BusinessException;

}
