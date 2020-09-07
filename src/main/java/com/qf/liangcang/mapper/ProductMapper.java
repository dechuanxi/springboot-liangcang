package com.qf.liangcang.mapper;

import com.qf.liangcang.pojo.Product;

/**
 * @author WDZ
 * @date 2020/9/7
 * @time 10:13
 * @description
 */
public interface ProductMapper {
    Product selectProductByPid(int pid);

    Integer changePstatus(Product product);
}
