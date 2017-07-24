package com.jarvis.admin.controller;

import com.jarvis.admin.dao.mapper.ProductMapper;
import com.jarvis.admin.dao.domain.Product;
import com.jarvis.admin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by duany on 2017/6/1.
 */
@RestController //返回json格式的controller 相当于controller和responsbody
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductService productService;

    @RequestMapping("/protest")
    public Product protest(@RequestParam long productId) {
        return productMapper.select(1);
    }
    @GetMapping("/getTableData")
    public Map<String,Object>getTableData(int pageNum,int pageSize,String name){
        return productService.getTableData(pageNum,pageSize,name);
    }

}
