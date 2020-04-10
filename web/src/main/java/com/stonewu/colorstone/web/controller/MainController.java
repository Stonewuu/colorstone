package com.stonewu.colorstone.web.controller;

import com.stonewu.colorstone.web.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping
@Controller
public class MainController {
    @Autowired
    private EchoService echoService;

    @RequestMapping("/main")
    @ResponseBody
    public Object echo(String str) {
        return echoService.echo(str);
    }
}
