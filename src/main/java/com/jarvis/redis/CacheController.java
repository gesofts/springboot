package com.jarvis.redis;

import com.jarvis.admin.dao.domain.Product;
import com.jarvis.admin.dao.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by duany on 2017/6/8.
 */
@RestController
@RequestMapping("/redisTest")
public class CacheController {
    @Autowired
    private ProductMapper productMapper;
    @RequestMapping("/getProduct")
    @Cacheable(value = "p-key")
    public Product getProduct(){
        Product p=productMapper.select(1);
        System.out.printf("如果调用缓存，应该不出现");
        return p;
    }
}
