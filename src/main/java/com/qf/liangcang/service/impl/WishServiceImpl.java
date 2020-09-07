package com.qf.liangcang.service.impl;

import com.qf.liangcang.mapper.WishMapper;
import com.qf.liangcang.pojo.Wish;
import com.qf.liangcang.service.WishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WDZ
 * @date 2020/9/7
 * @time 8:52
 * @description
 */
@Service
public class WishServiceImpl implements WishService {

    @Autowired(required = false)
    private WishMapper wishMapper;

    @Override
    public Integer addWish(Wish wish) {
        return wishMapper.insertWish(wish);
    }

    @Override
    public List<Wish> getWish() {
        return wishMapper.selectWishes();
    }
}
