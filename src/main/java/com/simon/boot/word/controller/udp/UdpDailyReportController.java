package com.simon.boot.word.controller.udp;

import com.simon.boot.word.framework.abstracts.BaseController;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.udp.UdpDailyReport;
import com.simon.boot.word.pojo.udp.UdpUser;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.service.udp.UdpDailyReportService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@Api(tags = "[统一开发管理平台]-日报", description = "日报相关接口")
@RestController
@RequestMapping("/udp/daily/report")
public class UdpDailyReportController extends BaseController {

    @Autowired
    private UdpDailyReportService service;

    @ApiOperation("添加日报")
    @PostMapping("add")
    public ReturnValue add(@RequestBody UdpDailyReport record){
        record.setId(null);
        record.setUserId(getUdpUser().getId());
        return service.add(record);
    }

    @ApiOperation("修改日报")
    @PostMapping("edit")
    public ReturnValue edit(@RequestBody UdpDailyReport record){
        return service.edit(record);
    }

    @ApiOperation("删除日报")
    @GetMapping("del/{id}")
    public ReturnValue del(@PathVariable Long id){
        return service.del(id);
    }

    @ApiOperation("分页获取日报信息")
    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody PageQC qc){
        UdpUser user = getUdpUser();
        return service.findByPage(qc, user);
    }

}
