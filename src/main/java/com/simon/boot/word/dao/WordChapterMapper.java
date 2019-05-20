package com.simon.boot.word.dao;

import com.simon.boot.word.pojo.WordChapter;
import com.simon.boot.word.pojo.WordChapterExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface WordChapterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_chapter
     *
     * @mbg.generated Mon May 20 11:38:14 CST 2019
     */
    long countByExample(WordChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_chapter
     *
     * @mbg.generated Mon May 20 11:38:14 CST 2019
     */
    int deleteByExample(WordChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_chapter
     *
     * @mbg.generated Mon May 20 11:38:14 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_chapter
     *
     * @mbg.generated Mon May 20 11:38:14 CST 2019
     */
    int insert(WordChapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_chapter
     *
     * @mbg.generated Mon May 20 11:38:14 CST 2019
     */
    int insertSelective(WordChapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_chapter
     *
     * @mbg.generated Mon May 20 11:38:14 CST 2019
     */
    List<WordChapter> selectByExample(WordChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_chapter
     *
     * @mbg.generated Mon May 20 11:38:14 CST 2019
     */
    WordChapter selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_chapter
     *
     * @mbg.generated Mon May 20 11:38:14 CST 2019
     */
    int updateByExampleSelective(@Param("record") WordChapter record, @Param("example") WordChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_chapter
     *
     * @mbg.generated Mon May 20 11:38:14 CST 2019
     */
    int updateByExample(@Param("record") WordChapter record, @Param("example") WordChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_chapter
     *
     * @mbg.generated Mon May 20 11:38:14 CST 2019
     */
    int updateByPrimaryKeySelective(WordChapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_chapter
     *
     * @mbg.generated Mon May 20 11:38:14 CST 2019
     */
    int updateByPrimaryKey(WordChapter record);
}