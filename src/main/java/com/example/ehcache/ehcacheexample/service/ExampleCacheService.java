package com.example.ehcache.ehcacheexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ehcache.ehcacheexample.caching.ExampleCacheDao;

@Service
public class ExampleCacheService {

    @Autowired
    ExampleCacheDao exampleCache;

    public String checkCaches(){
        return exampleCache.getCachedData("TEST");
    }

}
