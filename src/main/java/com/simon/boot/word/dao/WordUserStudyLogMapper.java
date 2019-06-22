package com.simon.boot.word.dao;

import com.simon.boot.word.pojo.WordUserStudyLog;
import com.simon.boot.word.pojo.WordUserStudyLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface WordUserStudyLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_user_study_log
     *
     * @mbg.generated Sat Jun 22 16:13:04 CST 2019
     */
    long countByExample(WordUserStudyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_user_study_log
     *
     * @mbg.generated Sat Jun 22 16:13:04 CST 2019
     */
    int deleteByExample(WordUserStudyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_user_study_log
     *
     * @mbg.generated Sat Jun 22 16:13:04 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_user_study_log
     *
     * @mbg.generated Sat Jun 22 16:13:04 CST 2019
     */
    int insert(WordUserStudyLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_user_study_log
     *
     * @mbg.generated Sat Jun 22 16:13:04 CST 2019
     */
    int insertSelective(WordUserStudyLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_user_study_log
     *
     * @mbg.generated Sat Jun 22 16:13:04 CST 2019
     */
    List<WordUserStudyLog> selectByExampleWithBLOBs(WordUserStudyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_user_study_log
     *
     * @mbg.generated Sat Jun 22 16:13:04 CST 2019
     */
    List<WordUserStudyLog> selectByExample(WordUserStudyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_user_study_log
     *
     * @mbg.generated Sat Jun 22 16:13:04 CST 2019
     */
    WordUserStudyLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_user_study_log
     *
     * @mbg.generated Sat Jun 22 16:13:04 CST 2019
     */
    int updateByExampleSelective(@Param("record") WordUserStudyLog record, @Param("example") WordUserStudyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_user_study_log
     *
     * @mbg.generated Sat Jun 22 16:13:04 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") WordUserStudyLog record, @Param("example") WordUserStudyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_user_study_log
     *
     * @mbg.generated Sat Jun 22 16:13:04 CST 2019
     */
    int updateByExample(@Param("record") WordUserStudyLog record, @Param("example") WordUserStudyLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_user_study_log
     *
     * @mbg.generated Sat Jun 22 16:13:04 CST 2019
     */
    int updateByPrimaryKeySelective(WordUserStudyLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_user_study_log
     *
     * @mbg.generated Sat Jun 22 16:13:04 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(WordUserStudyLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_user_study_log
     *
     * @mbg.generated Sat Jun 22 16:13:04 CST 2019
     */
    int updateByPrimaryKey(WordUserStudyLog record);
}