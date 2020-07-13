package com.simon.boot.word.dao.word;

import com.simon.boot.word.pojo.word.WordLibrary;
import com.simon.boot.word.pojo.word.WordLibraryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
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