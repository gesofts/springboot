package com.jarvis.admin.service;

import java.util.Map;

/**
 * Created by jarvis on 2017/7/23.
 */
public interface ProductService {
    Map<String,Object>getTableData(int pageNum,int pageSize,String name);

}
