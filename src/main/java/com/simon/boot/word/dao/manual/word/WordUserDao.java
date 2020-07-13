package com.simon.boot.word.dao.manual.word;

import com.simon.boot.word.qc.UserQC;
import com.simon.boot.word.vo.WordUserCopyVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author simon.wei
 */
@Mapper
@Repository
public interface WordUserDao {

    List<WordUserCopyVO> getWordUsers(UserQC qc);

}
