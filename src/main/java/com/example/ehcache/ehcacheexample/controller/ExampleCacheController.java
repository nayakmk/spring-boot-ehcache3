package com.example.ehcache.ehcacheexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ehcache.ehcacheexample.service.ExampleCacheService;

@RestController
@RequestMapping
public class ExampleCacheController {

    @Autowired
    ExampleCacheService exampleCacheService;

    @GetMapping(path = "/cache")
    public String checkCache(){
        return exampleCacheService.checkCaches();
    }

}
