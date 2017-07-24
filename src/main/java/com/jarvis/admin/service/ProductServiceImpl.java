package com.jarvis.admin.service;

import com.github.pagehelper.PageHelper;
import com.jarvis.admin.dao.domain.Product;
import com.jarvis.admin.dao.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jarvis on 2017/7/23.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public Map<String, Object> getTableData(int pageNum, int pageSize, String name) {
        PageHelper.startPage(pageNum,pageSize);//分页助手

        List<Product> productList=productMapper.getProductByName(name);
        int count=productMapper.getCounts();
        Map<String,Object> tableData=new HashMap<String,Object>();
        tableData.put("list",productList);
        tableData.put("count",count);
        return tableData;
    }

}

