package com.spring.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class SecurityController {

    private Logger log= LoggerFactory.getLogger(SecurityController.class);
    @GetMapping("/check")
    public String test(){
        log.info("check end point hits...");
        return "It's working..";
    }
}
