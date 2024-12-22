package com.example.shop.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class ItemController {

    @GetMapping("/admin/item/new")
    public String itemForm(){
        return "/item/itemForm";
    }


}
