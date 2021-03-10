package com.codertq.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class LoginController {
    @RequestMapping("/testInterceptor")
    public String login()
    {
        return "hello";
    }
}
