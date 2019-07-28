package com.simon.boot.word.dao;

import com.simon.boot.word.pojo.WordLibrary;
import com.simon.boot.word.pojo.WordLibraryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WordLibraryMapper {
    long countByExample(WordLibraryExample example);

    int deleteByExample(WordLibraryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WordLibrary record);

    int insertSelective(WordLibrary record);

    List<WordLibrary> selectByExample(WordLibraryExample example);

    WordLibrary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WordLibrary record, @Param("example") WordLibraryExample example);

    int updateByExample(@Param("record") WordLibrary record, @Param("example") WordLibraryExample example);

    int updateByPrimaryKeySelective(WordLibrary record);

    int updateByPrimaryKey(WordLibrary record);
}