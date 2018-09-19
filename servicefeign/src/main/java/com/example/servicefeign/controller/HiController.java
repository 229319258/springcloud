package com.example.servicefeign.controller;

import com.example.servicefeign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ffq
 * @Description:
 * @Date: Create in 11:10 2018/6/9
 */
@RestController
@RequestMapping("/hi")
public class HiController {
    @Autowired
    private HiService hiService;

    @GetMapping
    public String hi(String name) {
        return hiService.sayHiFromClientOne(name);
    }
}
