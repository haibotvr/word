package com.simon.boot.word.controller.oa;

import com.simon.boot.word.framework.abstracts.BaseController;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.oa.OaCommunityComment;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.service.oa.OaCommunityCommentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author simon.wei
 */
@RestController
@RequestMapping("/oa/communityComment")
public class OaCommunityCommentController extends BaseController{

    private static Logger log = LoggerFactory.getLogger(OaCommunityCommentController.class);

    @Autowired
    OaCommunityCommentService service;

    @PostMapping("add")
    public ReturnValue add(@RequestBody OaCommunityComment record){
        return service.add(record);
    }

    @PostMapping("edit")
    public ReturnValue edit(@RequestBody OaCommunityComment record){
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
