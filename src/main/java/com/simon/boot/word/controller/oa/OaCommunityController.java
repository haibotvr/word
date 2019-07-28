package com.simon.boot.word.controller.oa;

import com.simon.boot.word.framework.abstracts.BaseController;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.OaCommunity;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.service.OaCommunityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@RestController
@RequestMapping("community")
public class OaCommunityController extends BaseController{

    private static Logger log = LoggerFactory.getLogger(OaCommunityController.class);

    @Autowired
    OaCommunityService service;

    @PostMapping("add")
    public ReturnValue add(@RequestBody OaCommunity record){
        return service.add(record);
    }

    @PostMapping("edit")
    public ReturnValue edit(@RequestBody OaCommunity record){
        return service.edit(record);
    }

    @PostMapping("del/{id}")
    public ReturnValue del(@PathVariable Long id){
        return service.del(id);
    }

    @PostMapping("findByPage")
    public ReturnValue findByPage(@RequestBody PageQC qc){
        return service.findByPage(qc);
    }

}
