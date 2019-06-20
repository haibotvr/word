package com.simon.boot.word.controller.word;

import com.simon.boot.word.framework.abstracts.BaseController;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordUser;
import com.simon.boot.word.qc.UserQC;
import com.simon.boot.word.service.WordUserService;
import com.simon.boot.word.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@RestController
@RequestMapping("user")
public class WordUserController extends BaseController {

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
    public ReturnValue findByPage(@RequestBody UserQC qc){
        return service.findByPage(qc, getWordUser());
    }

    @PostMapping("login")
    public ReturnValue login(@RequestBody LoginVO vo) {
        return service.login(vo);
    }

    @PostMapping("info")
    public ReturnValue info(String token){
        return service.info(token);
    }

    @PostMapping("logout")
    public ReturnValue logout(){
        return service.logout();
    }

}
