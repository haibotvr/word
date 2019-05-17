package com.simon.boot.word.controller;

import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordUser;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.service.WordUserService;
import com.simon.boot.word.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@RestController
@RequestMapping("user")
public class WordUserController {

    @Autowired
    private WordUserService service;

    @PostMapping("add")
    public ReturnValue add(@RequestBody WordUser record){
        return service.add(record);
    }

    @PostMapping("edit")
    public ReturnValue edit(@RequestBody WordUser record){
        return service.edit(record);
    }

    @GetMapping("del/{id}")
    public ReturnValue del(@PathVariable Long id){
        return service.del(id);
    }

    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody PageQC qc){
        return service.findByPage(qc);
    }

    @PostMapping("login")
    public ReturnValue login(@RequestBody LoginVO vo) {
        return service.login(vo);
    }

    @GetMapping("info/{token}")
    public ReturnValue info(@PathVariable String token){
        return service.info(token);
    }

}
