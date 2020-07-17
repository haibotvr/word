package com.simon.boot.word.dao.udp;

import com.simon.boot.word.pojo.udp.UdpDailyReport;
import com.simon.boot.word.pojo.udp.UdpDailyReportExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UdpDailyReportMapper {

    long countByExample(UdpDailyReportExample example);

    int deleteByExample(UdpDailyReportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UdpDailyReport record);

    int insertSelective(UdpDailyReport record);

    List<UdpDailyReport> selectByExample(UdpDailyReportExample example);

    UdpDailyReport selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UdpDailyReport record, @Param("example") UdpDailyReportExample example);

    int updateByExample(@Param("record") UdpDailyReport record, @Param("example") UdpDailyReportExample example);

    int updateByPrimaryKeySelective(UdpDailyReport record);

    int updateByPrimaryKey(UdpDailyReport record);
}