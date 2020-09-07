package com.qf.liangcang.mapper;

import com.qf.liangcang.pojo.Wish;

import java.util.List;

/**
 * @author WDZ
 * @date 2020/9/7
 * @time 8:52
 * @description
 */
public interface WishMapper {
    Integer insertWish(Wish wish);

    List<Wish> selectWishes();
}
