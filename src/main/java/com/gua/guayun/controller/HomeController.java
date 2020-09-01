package com.gua.guayun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HomeController
 * @Description: TODO
 * @Author xionghao5
 * @Date 2020/8/27 
 * @Version V1.0
 **/
@RestController
public class HomeController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
