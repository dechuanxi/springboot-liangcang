package com.qf.liangcang.service.impl;

import com.qf.liangcang.mapper.ProductMapper;
import com.qf.liangcang.pojo.Product;
import com.qf.liangcang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WDZ
 * @date 2020/9/7
 * @time 10:14
 * @description
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired(required = false)
    private ProductMapper productMapper;

    @Override
    public Product selectProductByPid(int pid) {

        return productMapper.selectProductByPid(pid);
    }

    @Override
    public Integer changePstatus(Product product) {
        return productMapper.changePstatus(product);
    }
}
