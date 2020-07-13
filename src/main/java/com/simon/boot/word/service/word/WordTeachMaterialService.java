package com.simon.boot.word.service.word;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.WordTeachMaterial;
import com.simon.boot.word.qc.TeachMaterialQC;

/**
 * @author simon.wei
 */
public interface WordTeachMaterialService {

    ReturnValue add(WordTeachMaterial record) throws BusinessException;

    ReturnValue edit(WordTeachMaterial record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue findByPage(TeachMaterialQC qc) throws BusinessException;

}
