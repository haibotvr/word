package com.simon.boot.word.dao;

import com.simon.boot.word.pojo.OaCommunityComment;
import com.simon.boot.word.pojo.OaCommunityCommentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OaCommunityCommentMapper {
    long countByExample(OaCommunityCommentExample example);

    int deleteByExample(OaCommunityCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OaCommunityComment record);

    int insertSelective(OaCommunityComment record);

    List<OaCommunityComment> selectByExampleWithBLOBs(OaCommunityCommentExample example);

    List<OaCommunityComment> selectByExample(OaCommunityCommentExample example);

    OaCommunityComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OaCommunityComment record, @Param("example") OaCommunityCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") OaCommunityComment record, @Param("example") OaCommunityCommentExample example);

    int updateByExample(@Param("record") OaCommunityComment record, @Param("example") OaCommunityCommentExample example);

    int updateByPrimaryKeySelective(OaCommunityComment record);

    int updateByPrimaryKeyWithBLOBs(OaCommunityComment record);

    int updateByPrimaryKey(OaCommunityComment record);
}