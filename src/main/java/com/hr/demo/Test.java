package com.hr.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index")
public class Test {
    @RequestMapping("/query")
    @ResponseBody
    public String query(){
        return "123";
    }
}
