package com.simon.boot.word.controller.word;

import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.CallContacts;
import com.simon.boot.word.qc.CallContactsQC;
import com.simon.boot.word.service.word.CallContactsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author simon.wei
 */
@Api(tags = "CallContactController", description = "联系人管理")
@RestController
@RequestMapping("call")
public class CallContactController {

    @Autowired
    private CallContactsService service;

    @ApiOperation("添加联系人")
    @PostMapping("add")
    public ReturnValue add(@RequestBody CallContacts record){
        return service.add(record);
    }

    @ApiOperation("修改联系人")
    @PostMapping("edit")
    public ReturnValue edit(@RequestBody CallContacts record){
        return service.edit(record);
    }

    @ApiOperation("分页获取联系人信息")
    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody CallContactsQC qc){
        return service.findByPage(qc);
    }

    @ApiOperation("导入联系人")
    @PostMapping("importContacts")
//    @PreAuthorize("hasAuthority('word:call:import')")
    public ReturnValue importContacts(@RequestParam(value="file", required = false) MultipartFile file) {
        return service.importContacts(file);
    }

    @ApiOperation("导出联系人")
    @PostMapping("exportContacts")
//    @PreAuthorize("hasAuthority('word:call:export')")
    public ReturnValue exportContacts(@RequestBody CallContactsQC qc){
        return service.exportContacts(qc);
    }

    @ApiOperation("导出目标公司客户")
    @PostMapping("exportTargetContacts")
//    @PreAuthorize("hasAuthority('word:call:exportTargetContact')")
    public ReturnValue exportTargetContacts(@RequestParam(value="file", required = false) MultipartFile file) {
        return service.exportTargetContacts(file);
    }

}
