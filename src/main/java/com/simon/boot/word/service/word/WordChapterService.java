package com.simon.boot.word.service.word;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.WordChapter;
import com.simon.boot.word.qc.ChapterQC;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author simon.wei
 */
public interface WordChapterService {

    ReturnValue add(WordChapter record) throws BusinessException;

    ReturnValue edit(WordChapter record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue findByPage(ChapterQC qc) throws BusinessException;

    ReturnValue readExcel(MultipartFile file) throws BusinessException;
}
