package com.simon.boot.word.service.udp;

import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.udp.UdpDailyReport;
import com.simon.boot.word.pojo.udp.UdpUser;
import com.simon.boot.word.qc.PageQC;

/**
 * @author simon.wei
 */
public interface UdpDailyReportService {

    ReturnValue add(UdpDailyReport record);


    ReturnValue edit(UdpDailyReport record);

    ReturnValue del(Long id);

    ReturnValue findByPage(PageQC qc, UdpUser user);
}
