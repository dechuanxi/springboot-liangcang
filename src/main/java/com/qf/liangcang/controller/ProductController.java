package com.qf.liangcang.controller;

import com.qf.liangcang.pojo.Product;
import com.qf.liangcang.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WDZ
 * @date 2020/9/7
 * @time 12:25
 * @description
 */
@RestController
@RequestMapping("/lc/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getById")
    Product getById(int pid){
        return productService.selectProductByPid(pid);
    }
}
