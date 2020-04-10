package com.stonewu.colorstone.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping
@Controller
public class MainController {

    @RequestMapping("/echo/{str}")
    @ResponseBody
    public Object echo(@PathVariable("str") String str) {
        return str;
    }
}
