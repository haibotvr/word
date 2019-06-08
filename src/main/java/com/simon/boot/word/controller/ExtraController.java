package com.simon.boot.word.controller;

import com.simon.boot.word.framework.abstracts.BaseController;
import com.simon.boot.word.framework.kits.JsonUtil;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.OaEmail;
import com.simon.boot.word.qc.EmailQC;
import com.simon.boot.word.service.ExtraService;
import com.simon.boot.word.service.impl.ExtraServiceImpl;
import com.simon.boot.word.vo.EmailVO;
import com.simon.boot.word.vo.LoginVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        log.info("extra-info-获取个人信息:{}", JsonUtil.toString(map));
        return ReturnValue.success().setData(map);
    }

    @GetMapping("findUsers")
    public ReturnValue findUsers() {
        return service.findUsers(getOaUser());
    }

    @PostMapping("sendEmail")
    public ReturnValue sendEmail(@RequestBody EmailVO vo){
        log.info("extra-send-email-发送邮件:{}", JsonUtil.toString(vo));
        return service.sendEmail(getOaUser(), vo);
    }

    @PostMapping("saveDraft")
    public ReturnValue saveDraft(@RequestBody EmailVO vo){
        log.info("extra-save-draft-保存草稿:{}", JsonUtil.toString(vo));
        return service.saveDraft(getOaUser(), vo);
    }

    @PostMapping("delEmail")
    public ReturnValue delEmail(@RequestBody EmailVO vo){
        log.info("extra-del-email-删除邮件:{}", JsonUtil.toString(vo));
        return service.delEmail(getOaUser(), vo);
    }

    @PostMapping("findEmail")
    public ReturnValue findEmail(@RequestBody OaEmail record){
        log.info("extra-find-email-查找邮件:{}", JsonUtil.toString(record));
        return service.findEmail(getOaUser(), record);
    }

    @PostMapping("findEmailByPage")
    public ReturnValue findEmailByPage(@RequestBody EmailQC qc){
        log.info("extra-find-email-by-page-查找邮件:{}", JsonUtil.toString(qc));
        return service.findEmailByPage(getOaUser(), qc);
    }

}
