package com.simon.boot.word.controller;

import com.simon.boot.word.framework.web.ReturnValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simon.wei
 */
@RestController
@RequestMapping("extra")
public class ExtraController {

    @PostMapping("login")
    public ReturnValue login(String username, String password) {
        if("admin".equals(username) && "123456".equals(password)){
            return ReturnValue.success().setMessage("登录成功");
        }
        if("liwenxin".equals(username) && "123456".equals(password)){
            return ReturnValue.success().setMessage("登录成功");
        }
        return ReturnValue.error().setMessage("用户名或密码错误");
    }
}
