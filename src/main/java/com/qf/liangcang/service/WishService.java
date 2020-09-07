package com.qf.liangcang.service;

import com.qf.liangcang.pojo.Wish;

import java.util.List;

/**
 * @author WDZ
 * @date 2020/9/7
 * @time 8:52
 * @description
 */
public interface WishService {
    Integer addWish(Wish wish);

    List<Wish> getWish();

}
