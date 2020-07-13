package com.simon.boot.word.service.word;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.WordDetail;
import com.simon.boot.word.qc.DetailQC;
import com.simon.boot.word.vo.TmExcelVO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author simon.wei
 */
public interface WordDetailService {

    ReturnValue add(WordDetail record) throws BusinessException;

    ReturnValue edit(WordDetail record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue findByPage(DetailQC qc) throws BusinessException;

    ReturnValue readExcel(MultipartFile file, Long chapterId) throws BusinessException;

    void dealWithExcel(Long t2, List<TmExcelVO> tmExcelVOS) throws BusinessException;

}
