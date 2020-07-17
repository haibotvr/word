package com.simon.boot.word.service.udp.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.udp.UdpDailyReportMapper;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.udp.UdpDailyReport;
import com.simon.boot.word.pojo.udp.UdpDailyReportExample;
import com.simon.boot.word.pojo.udp.UdpUser;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.service.udp.UdpDailyReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author simon.wei
 */
@Service
public class UdpDailyReportServiceImpl implements UdpDailyReportService {

    @Autowired
    UdpDailyReportMapper mapper;

    @Override
    public ReturnValue add(UdpDailyReport record) {
        mapper.insertSelective(record);
        return ReturnValue.success();
    }

    @Override
    public ReturnValue edit(UdpDailyReport record) {
        //日期不可更新
        record.setReportTime(null);
        //用户不可更新
        record.setUserId(null);
        mapper.updateByPrimaryKeySelective(record);
        return ReturnValue.success();
    }

    @Override
    public ReturnValue del(Long id) {
        mapper.deleteByPrimaryKey(id);
        return ReturnValue.success();
    }

    @Override
    public ReturnValue findByPage(PageQC qc, UdpUser user) {
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());
        UdpDailyReportExample example = new UdpDailyReportExample();
        example.setOrderByClause("create_time desc");
        UdpDailyReportExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(user.getId());
        PageInfo<UdpDailyReport> info = new PageInfo<>(mapper.selectByExample(example));
        return ReturnValue.success().setData(info);
    }
}
