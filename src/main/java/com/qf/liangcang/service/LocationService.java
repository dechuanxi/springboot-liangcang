package com.qf.liangcang.service;

import com.qf.liangcang.pojo.Location;

import java.util.List;

/**
 * @author WDZ
 * @date 2020/9/7
 * @time 18:08
 * @description
 */
public interface LocationService {
    Integer addLocation(Location location);


    List<Location> getLocationList();

    Integer updateLocation(Location location);

    Integer deleteLocation(int lid);
}
