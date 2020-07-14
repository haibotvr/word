package com.simon.boot.word.controller.udp;

import com.simon.boot.word.service.udp.UdpDailyReportService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simon.wei
 */
@Api(tags = "UdpDailyReportController", description = "日报相关")
@RestController
@RequestMapping("dailyReport")
public class UdpDailyReportController {

    @Autowired
    private UdpDailyReportService dailyReportService;

}
