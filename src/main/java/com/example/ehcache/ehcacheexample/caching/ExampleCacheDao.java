package com.example.ehcache.ehcacheexample.caching;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class ExampleCacheDao {

    @Cacheable(value = "exampleCache", key = "#key", cacheManager = "cacheManager")
    public String getCachedData(String key) {
        // Logic to fetch data from a data source
        return "Cached data for key: " + key;
    }

    @CacheEvict(value = "exampleCache", allEntries = true)
    public void clearCache() {
        // Logic to clear the cache
    }
    
}
