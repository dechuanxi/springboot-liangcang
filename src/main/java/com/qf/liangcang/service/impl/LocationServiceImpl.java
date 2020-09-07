package com.qf.liangcang.service.impl;

import com.qf.liangcang.mapper.LocationMapper;
import com.qf.liangcang.pojo.Location;
import com.qf.liangcang.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author WDZ
 * @date 2020/9/7
 * @time 18:08
 * @description
 */
@Service
public class LocationServiceImpl implements LocationService {

    @Autowired(required = false)
    private LocationMapper locationMapper;

    @Override
    public Integer addLocation(Location location) {

        return locationMapper.insertLocation(location);
    }

    @Override
    public List<Location> getLocationList() {
        return locationMapper.selectLocationList();
    }

    @Override
    public Integer updateLocation(Location location) {

        return locationMapper.updateLocation(location);
    }

    @Override
    public Integer deleteLocation(int lid) {

        return locationMapper.deleteLocation(lid);
    }
}
