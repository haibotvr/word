package com.simon.boot.word.controller.udp;

import com.simon.boot.word.service.udp.UdpUserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simon.wei
 */
@Api(tags = "UdpUserController", description = "用户相关")
@RestController
@RequestMapping("user")
public class UdpUserController {

    @Autowired
    private UdpUserService userService;



}
