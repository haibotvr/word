package com.simon.boot.word.dao;

import com.simon.boot.word.entity.WordDetail;
import com.simon.boot.word.entity.WordDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface WordDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_detail
     *
     * @mbg.generated Wed May 15 10:50:44 CST 2019
     */
    long countByExample(WordDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_detail
     *
     * @mbg.generated Wed May 15 10:50:44 CST 2019
     */
    int deleteByExample(WordDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_detail
     *
     * @mbg.generated Wed May 15 10:50:44 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_detail
     *
     * @mbg.generated Wed May 15 10:50:44 CST 2019
     */
    int insert(WordDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_detail
     *
     * @mbg.generated Wed May 15 10:50:44 CST 2019
     */
    int insertSelective(WordDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_detail
     *
     * @mbg.generated Wed May 15 10:50:44 CST 2019
     */
    List<WordDetail> selectByExample(WordDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_detail
     *
     * @mbg.generated Wed May 15 10:50:44 CST 2019
     */
    WordDetail selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_detail
     *
     * @mbg.generated Wed May 15 10:50:44 CST 2019
     */
    int updateByExampleSelective(@Param("record") WordDetail record, @Param("example") WordDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_detail
     *
     * @mbg.generated Wed May 15 10:50:44 CST 2019
     */
    int updateByExample(@Param("record") WordDetail record, @Param("example") WordDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_detail
     *
     * @mbg.generated Wed May 15 10:50:44 CST 2019
     */
    int updateByPrimaryKeySelective(WordDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_detail
     *
     * @mbg.generated Wed May 15 10:50:44 CST 2019
     */
    int updateByPrimaryKey(WordDetail record);
}