package com.simon.boot.word.controller;

import com.simon.boot.word.framework.abstracts.BaseController;
import com.simon.boot.word.framework.kits.JsonUtil;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.service.ExtraService;
import com.simon.boot.word.service.impl.ExtraServiceImpl;
import com.simon.boot.word.vo.LoginVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author simon.wei
 */
@RestController
@RequestMapping("extra")
public class ExtraController extends BaseController{

    private static Logger log = LoggerFactory.getLogger(ExtraController.class);

    @Autowired
    private ExtraService service;

    @PostMapping("login")
    public ReturnValue login(LoginVO vo) {
        return service.login(vo);
    }

    @GetMapping("info")
    public ReturnValue info() {
        Map<String, Object> map = new HashMap<>();
        map.put("员工号", "A071");
        map.put("部门", "开发部");
        map.put("职位", "开发工程师");
        map.put("级别", "高级");
        log.info("获取个人信息:{}", JsonUtil.toString(map));
        return ReturnValue.success().setData(map);
    }
}
