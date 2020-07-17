package com.simon.boot.word.dao.udp;

import com.simon.boot.word.pojo.udp.UdpUser;
import com.simon.boot.word.pojo.udp.UdpUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UdpUserMapper {

    long countByExample(UdpUserExample example);

    int deleteByExample(UdpUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UdpUser record);

    int insertSelective(UdpUser record);

    List<UdpUser> selectByExample(UdpUserExample example);

    UdpUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UdpUser record, @Param("example") UdpUserExample example);

    int updateByExample(@Param("record") UdpUser record, @Param("example") UdpUserExample example);

    int updateByPrimaryKeySelective(UdpUser record);

    int updateByPrimaryKey(UdpUser record);
}