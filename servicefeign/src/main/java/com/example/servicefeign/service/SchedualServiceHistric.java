package com.example.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @Author: ffq
 * @Description:断路器
 * @Date: Create in 11:16 2018/6/9
 */
@Component
public class SchedualServiceHistric implements HiService {
    public String sayHiFromClientOne(String name) {
        return "我是断路器：" + name;
    }
}
