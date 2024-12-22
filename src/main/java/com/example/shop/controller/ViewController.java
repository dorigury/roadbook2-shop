package com.example.shop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class ViewController {

    @GetMapping("/view")
    public String view(){
        log.info("view 요청");
        return "views/view";
    }
}
