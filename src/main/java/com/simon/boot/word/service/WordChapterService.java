package com.simon.boot.word.service;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordChapter;
import com.simon.boot.word.qc.ChapterQC;

/**
 * @author simon.wei
 */
public interface WordChapterService {

    ReturnValue add(WordChapter record) throws BusinessException;

    ReturnValue edit(WordChapter record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue findByPage(ChapterQC qc) throws BusinessException;

}
