package com.simon.boot.word.controller;

import com.simon.boot.word.framework.abstracts.BaseController;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.UserStudyLog;
import com.simon.boot.word.pojo.WordSchool;
import com.simon.boot.word.pojo.WordUser;
import com.simon.boot.word.qc.SchoolQC;
import com.simon.boot.word.service.UserStudyService;
import com.simon.boot.word.service.WordSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author simon.wei
 */
@RestController
@RequestMapping("study")
public class UserStudyController extends BaseController {

    @Autowired
    private UserStudyService service;

    @PostMapping("add")
    public ReturnValue add(@RequestBody UserStudyLog record) {
        record.setUserId(getSessionUser().getId());
        return service.add(record);
    }

    @GetMapping("findWords/{id}")
    public ReturnValue findWords(@PathVariable Long id) {
        return service.findWords(id, getSessionUser().getId());
    }

    @GetMapping("reStudy/{id}")
    public ReturnValue reStudy(@PathVariable Long id) {
        return service.reStudy(id, getSessionUser().getId());
    }

}
