package com.simon.boot.word.controller;

import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.service.ExtraService;
import com.simon.boot.word.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simon.wei
 */
@RestController
@RequestMapping("extra")
public class ExtraController {

    @Autowired
    private ExtraService service;

    @PostMapping("login")
    public ReturnValue login(LoginVO vo) {
        return service.login(vo);
    }
}
