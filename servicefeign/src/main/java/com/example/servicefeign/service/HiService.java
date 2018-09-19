package com.example.servicefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: ffq
 * @Description:
 * @Date: Create in 11:04 2018/6/9
 */
@FeignClient(value = "service-hi", fallback = SchedualServiceHistric.class)//指定调用的是哪个服务
public interface HiService {
    //和平常开发一样,不过只是接口
    @GetMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
