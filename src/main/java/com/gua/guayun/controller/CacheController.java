package com.gua.guayun.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/cache")
@EnableCaching
public class CacheController {

    @GetMapping("/get")
    @ResponseBody
    @Cacheable(cacheNames = "cache-get-name")
    public String get() {
        Random random = new Random();
        int i = random.nextInt(10);
        return i + "";
    }

}
