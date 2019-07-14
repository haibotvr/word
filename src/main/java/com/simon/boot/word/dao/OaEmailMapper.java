package com.simon.boot.word.dao;

import com.simon.boot.word.pojo.OaEmail;
import com.simon.boot.word.pojo.OaEmailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OaEmailMapper {
    long countByExample(OaEmailExample example);

    int deleteByExample(OaEmailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OaEmail record);

    int insertSelective(OaEmail record);

    List<OaEmail> selectByExampleWithBLOBs(OaEmailExample example);

    List<OaEmail> selectByExample(OaEmailExample example);

    OaEmail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OaEmail record, @Param("example") OaEmailExample example);

    int updateByExampleWithBLOBs(@Param("record") OaEmail record, @Param("example") OaEmailExample example);

    int updateByExample(@Param("record") OaEmail record, @Param("example") OaEmailExample example);

    int updateByPrimaryKeySelective(OaEmail record);

    int updateByPrimaryKeyWithBLOBs(OaEmail record);

    int updateByPrimaryKey(OaEmail record);
}