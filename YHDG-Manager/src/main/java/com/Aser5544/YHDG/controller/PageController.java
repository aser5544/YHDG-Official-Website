package com.Aser5544.YHDG.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String main(String page){
        System.out.println("页面-->"+page);
        return "views/"+page;
    }
}
