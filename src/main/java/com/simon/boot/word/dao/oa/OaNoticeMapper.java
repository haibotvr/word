package com.simon.boot.word.dao.oa;

import com.simon.boot.word.pojo.oa.OaNotice;
import com.simon.boot.word.pojo.oa.OaNoticeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OaNoticeMapper {
    long countByExample(OaNoticeExample example);

    int deleteByExample(OaNoticeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OaNotice record);

    int insertSelective(OaNotice record);

    List<OaNotice> selectByExampleWithBLOBs(OaNoticeExample example);

    List<OaNotice> selectByExample(OaNoticeExample example);

    OaNotice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OaNotice record, @Param("example") OaNoticeExample example);

    int updateByExampleWithBLOBs(@Param("record") OaNotice record, @Param("example") OaNoticeExample example);

    int updateByExample(@Param("record") OaNotice record, @Param("example") OaNoticeExample example);

    int updateByPrimaryKeySelective(OaNotice record);

    int updateByPrimaryKeyWithBLOBs(OaNotice record);

    int updateByPrimaryKey(OaNotice record);
}