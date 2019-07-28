package com.simon.boot.word.dao;

import com.simon.boot.word.pojo.OaCommunity;
import com.simon.boot.word.pojo.OaCommunityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OaCommunityMapper {
    long countByExample(OaCommunityExample example);

    int deleteByExample(OaCommunityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OaCommunity record);

    int insertSelective(OaCommunity record);

    List<OaCommunity> selectByExampleWithBLOBs(OaCommunityExample example);

    List<OaCommunity> selectByExample(OaCommunityExample example);

    OaCommunity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OaCommunity record, @Param("example") OaCommunityExample example);

    int updateByExampleWithBLOBs(@Param("record") OaCommunity record, @Param("example") OaCommunityExample example);

    int updateByExample(@Param("record") OaCommunity record, @Param("example") OaCommunityExample example);

    int updateByPrimaryKeySelective(OaCommunity record);

    int updateByPrimaryKeyWithBLOBs(OaCommunity record);

    int updateByPrimaryKey(OaCommunity record);
}