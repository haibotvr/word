package com.simon.boot.word.controller.udp;

import com.simon.boot.word.framework.abstracts.BaseController;
import com.simon.boot.word.framework.kits.JsonUtil;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.udp.UdpUser;
import com.simon.boot.word.service.udp.UdpUserService;
import com.simon.boot.word.vo.LoginVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@Api(tags = "UdpUserController", description = "用户相关")
@RestController
@RequestMapping("/udp/user")
public class UdpUserController extends BaseController {

    @Autowired
    private UdpUserService service;

    @ApiOperation("登录")
    @PostMapping("login")
    public ReturnValue login(@RequestBody LoginVO vo) {
        return service.login(vo);
    }

    @ApiOperation("个人信息")
    @PostMapping("info")
    public ReturnValue info() {
        return ReturnValue.success().setData(getUdpUser());
    }

    @ApiOperation("添加用户")
    @PostMapping("add")
    public ReturnValue add(@RequestBody UdpUser record){
        return service.add(record);
    }

    @ApiOperation("修改用户")
    @PostMapping("edit")
    public ReturnValue edit(@RequestBody UdpUser record){
        return service.edit(record);
    }

    @ApiOperation("删除用户")
    @GetMapping("del/{id}")
    public ReturnValue del(@PathVariable Long id){
        return service.del(id);
    }

}
