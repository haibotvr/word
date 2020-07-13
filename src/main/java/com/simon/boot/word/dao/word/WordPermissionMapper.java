package com.simon.boot.word.dao.word;

import com.simon.boot.word.pojo.word.WordPermission;
import com.simon.boot.word.pojo.word.WordPermissionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface WordPermissionMapper {
    long countByExample(WordPermissionExample example);

    int deleteByExample(WordPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WordPermission record);

    int insertSelective(WordPermission record);

    List<WordPermission> selectByExample(WordPermissionExample example);

    WordPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WordPermission record, @Param("example") WordPermissionExample example);

    int updateByExample(@Param("record") WordPermission record, @Param("example") WordPermissionExample example);

    int updateByPrimaryKeySelective(WordPermission record);

    int updateByPrimaryKey(WordPermission record);
}