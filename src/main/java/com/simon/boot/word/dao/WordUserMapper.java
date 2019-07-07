package com.simon.boot.word.dao;

import com.simon.boot.word.pojo.WordUser;
import com.simon.boot.word.pojo.WordUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface WordUserMapper {
    long countByExample(WordUserExample example);

    int deleteByExample(WordUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WordUser record);

    int insertSelective(WordUser record);

    List<WordUser> selectByExample(WordUserExample example);

    WordUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WordUser record, @Param("example") WordUserExample example);

    int updateByExample(@Param("record") WordUser record, @Param("example") WordUserExample example);

    int updateByPrimaryKeySelective(WordUser record);

    int updateByPrimaryKey(WordUser record);
}