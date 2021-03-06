package com.simon.boot.word.dao.oa;

import com.simon.boot.word.pojo.oa.OaUser;
import com.simon.boot.word.pojo.oa.OaUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OaUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_user
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    long countByExample(OaUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_user
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    int deleteByExample(OaUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_user
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_user
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    int insert(OaUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_user
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    int insertSelective(OaUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_user
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    List<OaUser> selectByExample(OaUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_user
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    OaUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_user
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    int updateByExampleSelective(@Param("record") OaUser record, @Param("example") OaUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_user
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    int updateByExample(@Param("record") OaUser record, @Param("example") OaUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_user
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    int updateByPrimaryKeySelective(OaUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oa_user
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    int updateByPrimaryKey(OaUser record);
}