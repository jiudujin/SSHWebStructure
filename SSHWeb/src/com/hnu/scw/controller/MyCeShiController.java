package com.hnu.scw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用于对controller层的代码进行测试
 */
@Controller
public class MyCeShiController {

    @RequestMapping(value = "/pagejump")
    public String jump(){
        return "hello";
    }
}
