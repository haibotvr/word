package com.simon.boot.word.dao.word;

import com.simon.boot.word.pojo.word.WordSchool;
import com.simon.boot.word.pojo.word.WordSchoolExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface WordSchoolMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_school
     *
     * @mbg.generated Mon May 20 11:45:01 CST 2019
     */
    long countByExample(WordSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_school
     *
     * @mbg.generated Mon May 20 11:45:01 CST 2019
     */
    int deleteByExample(WordSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_school
     *
     * @mbg.generated Mon May 20 11:45:01 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_school
     *
     * @mbg.generated Mon May 20 11:45:01 CST 2019
     */
    int insert(WordSchool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_school
     *
     * @mbg.generated Mon May 20 11:45:01 CST 2019
     */
    int insertSelective(WordSchool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_school
     *
     * @mbg.generated Mon May 20 11:45:01 CST 2019
     */
    List<WordSchool> selectByExample(WordSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_school
     *
     * @mbg.generated Mon May 20 11:45:01 CST 2019
     */
    WordSchool selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_school
     *
     * @mbg.generated Mon May 20 11:45:01 CST 2019
     */
    int updateByExampleSelective(@Param("record") WordSchool record, @Param("example") WordSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_school
     *
     * @mbg.generated Mon May 20 11:45:01 CST 2019
     */
    int updateByExample(@Param("record") WordSchool record, @Param("example") WordSchoolExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_school
     *
     * @mbg.generated Mon May 20 11:45:01 CST 2019
     */
    int updateByPrimaryKeySelective(WordSchool record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_school
     *
     * @mbg.generated Mon May 20 11:45:01 CST 2019
     */
    int updateByPrimaryKey(WordSchool record);
}