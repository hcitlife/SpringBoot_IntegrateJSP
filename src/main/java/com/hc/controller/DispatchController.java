package com.hc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HC on 2018/4/19.
 */
@Controller
public class DispatchController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
