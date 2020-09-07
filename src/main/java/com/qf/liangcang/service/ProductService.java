package com.qf.liangcang.service;

import com.qf.liangcang.pojo.Product;

/**
 * @author WDZ
 * @date 2020/9/7
 * @time 9:53
 * @description
 */
public interface ProductService {
    Product selectProductByPid(int pid);

    Integer changePstatus(Product product);
}
