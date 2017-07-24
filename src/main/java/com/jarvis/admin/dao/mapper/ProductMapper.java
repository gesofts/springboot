package com.jarvis.admin.dao.mapper;

import com.jarvis.admin.dao.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by duany on 2017/6/4.
 */
@Mapper
public interface ProductMapper {
    Product select(
            @Param("id")
                    long id);
    void update(Product product);

    List<Product> getProductByName(@Param("name") String name);

    int getCounts();
}
