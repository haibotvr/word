package com.simon.boot.word.dao;

import com.simon.boot.word.pojo.WordUserRoleRelation;
import com.simon.boot.word.pojo.WordUserRoleRelationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface WordUserRoleRelationMapper {
    long countByExample(WordUserRoleRelationExample example);

    int deleteByExample(WordUserRoleRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WordUserRoleRelation record);

    int insertSelective(WordUserRoleRelation record);

    List<WordUserRoleRelation> selectByExample(WordUserRoleRelationExample example);

    WordUserRoleRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WordUserRoleRelation record, @Param("example") WordUserRoleRelationExample example);

    int updateByExample(@Param("record") WordUserRoleRelation record, @Param("example") WordUserRoleRelationExample example);

    int updateByPrimaryKeySelective(WordUserRoleRelation record);

    int updateByPrimaryKey(WordUserRoleRelation record);
}