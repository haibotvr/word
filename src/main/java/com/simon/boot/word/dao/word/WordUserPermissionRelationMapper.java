package com.simon.boot.word.dao.word;

import com.simon.boot.word.pojo.word.WordUserPermissionRelation;
import com.simon.boot.word.pojo.word.WordUserPermissionRelationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface WordUserPermissionRelationMapper {
    long countByExample(WordUserPermissionRelationExample example);

    int deleteByExample(WordUserPermissionRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WordUserPermissionRelation record);

    int insertSelective(WordUserPermissionRelation record);

    List<WordUserPermissionRelation> selectByExample(WordUserPermissionRelationExample example);

    WordUserPermissionRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WordUserPermissionRelation record, @Param("example") WordUserPermissionRelationExample example);

    int updateByExample(@Param("record") WordUserPermissionRelation record, @Param("example") WordUserPermissionRelationExample example);

    int updateByPrimaryKeySelective(WordUserPermissionRelation record);

    int updateByPrimaryKey(WordUserPermissionRelation record);
}