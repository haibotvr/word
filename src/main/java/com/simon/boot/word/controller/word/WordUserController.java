package com.simon.boot.word.controller.word;

import com.simon.boot.word.framework.abstracts.BaseController;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordUser;
import com.simon.boot.word.qc.UserQC;
import com.simon.boot.word.service.WordUserService;
import com.simon.boot.word.vo.LoginVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@Api(tags = "WordUserController", description = "用户管理")
@RestController
@RequestMapping("user")
public class WordUserController extends BaseController {

    @Autowired
    private WordUserService service;

    @ApiOperation("添加用户")
    @PostMapping("add")
    public ReturnValue add(@RequestBody WordUser record){
        return service.add(record);
    }

    @ApiOperation("修改用户")
    @PostMapping("edit")
    public ReturnValue edit(@RequestBody WordUser record){
        return service.edit(record);
    }

    @ApiOperation("删除用户")
    @GetMapping("del/{id}")
    public ReturnValue del(@PathVariable Long id){
        return service.del(id);
    }

    @ApiOperation("分页获取用户信息")
    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody UserQC qc){
        return service.findByPage(qc, getWordUser());
    }

    @ApiOperation("登录")
    @PostMapping("login")
    public ReturnValue login(@RequestBody LoginVO vo) {
        return service.login(vo);
    }

    @ApiOperation("获取个人信息")
    @PostMapping("info")
    public ReturnValue info(String token){
        return service.info(token);
    }

    @ApiOperation("登出")
    @PostMapping("logout")
    public ReturnValue logout(){
        return service.logout();
    }

    @ApiOperation("获取用户所有权限（包括+-权限）")
    @GetMapping("/permission/{id}")
    public ReturnValue getPermissions(@PathVariable Long id ){
        return service.getPermissions(id);
    }

}
