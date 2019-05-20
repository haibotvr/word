package com.simon.boot.word.dao;

import com.simon.boot.word.pojo.WordTeachMaterial;
import com.simon.boot.word.pojo.WordTeachMaterialExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface WordTeachMaterialMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_teach_material
     *
     * @mbg.generated Mon May 20 11:52:20 CST 2019
     */
    long countByExample(WordTeachMaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_teach_material
     *
     * @mbg.generated Mon May 20 11:52:20 CST 2019
     */
    int deleteByExample(WordTeachMaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_teach_material
     *
     * @mbg.generated Mon May 20 11:52:20 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_teach_material
     *
     * @mbg.generated Mon May 20 11:52:20 CST 2019
     */
    int insert(WordTeachMaterial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_teach_material
     *
     * @mbg.generated Mon May 20 11:52:20 CST 2019
     */
    int insertSelective(WordTeachMaterial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_teach_material
     *
     * @mbg.generated Mon May 20 11:52:20 CST 2019
     */
    List<WordTeachMaterial> selectByExample(WordTeachMaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_teach_material
     *
     * @mbg.generated Mon May 20 11:52:20 CST 2019
     */
    WordTeachMaterial selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_teach_material
     *
     * @mbg.generated Mon May 20 11:52:20 CST 2019
     */
    int updateByExampleSelective(@Param("record") WordTeachMaterial record, @Param("example") WordTeachMaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_teach_material
     *
     * @mbg.generated Mon May 20 11:52:20 CST 2019
     */
    int updateByExample(@Param("record") WordTeachMaterial record, @Param("example") WordTeachMaterialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_teach_material
     *
     * @mbg.generated Mon May 20 11:52:20 CST 2019
     */
    int updateByPrimaryKeySelective(WordTeachMaterial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table word_teach_material
     *
     * @mbg.generated Mon May 20 11:52:20 CST 2019
     */
    int updateByPrimaryKey(WordTeachMaterial record);
}