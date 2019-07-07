package com.simon.boot.word.dao;

import com.simon.boot.word.pojo.WordRolePermissionRelation;
import com.simon.boot.word.pojo.WordRolePermissionRelationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface WordRolePermissionRelationMapper {
    long countByExample(WordRolePermissionRelationExample example);

    int deleteByExample(WordRolePermissionRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WordRolePermissionRelation record);

    int insertSelective(WordRolePermissionRelation record);

    List<WordRolePermissionRelation> selectByExample(WordRolePermissionRelationExample example);

    WordRolePermissionRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WordRolePermissionRelation record, @Param("example") WordRolePermissionRelationExample example);

    int updateByExample(@Param("record") WordRolePermissionRelation record, @Param("example") WordRolePermissionRelationExample example);

    int updateByPrimaryKeySelective(WordRolePermissionRelation record);

    int updateByPrimaryKey(WordRolePermissionRelation record);
}