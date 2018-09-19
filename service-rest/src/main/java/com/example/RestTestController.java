package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ffq
 * @create 2018-09-19 23:53
 **/
@RestController
public class RestTestController {

    @GetMapping("test")
    public String test() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://www.baidu.com";
        return restTemplate.getForObject(url, String.class);
    }
}
