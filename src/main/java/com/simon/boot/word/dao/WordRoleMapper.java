package com.simon.boot.word.dao;

import com.simon.boot.word.pojo.WordRole;
import com.simon.boot.word.pojo.WordRoleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface WordRoleMapper {
    long countByExample(WordRoleExample example);

    int deleteByExample(WordRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WordRole record);

    int insertSelective(WordRole record);

    List<WordRole> selectByExample(WordRoleExample example);

    WordRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WordRole record, @Param("example") WordRoleExample example);

    int updateByExample(@Param("record") WordRole record, @Param("example") WordRoleExample example);

    int updateByPrimaryKeySelective(WordRole record);

    int updateByPrimaryKey(WordRole record);
}