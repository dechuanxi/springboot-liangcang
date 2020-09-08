package com.qf.liangcang.mapper;

import com.qf.liangcang.pojo.Location;

import java.util.List;

/**
 * @author WDZ
 * @date 2020/9/7
 * @time 18:08
 * @description
 */
public interface LocationMapper {
    Integer insertLocation(Location location);

    List<Location> selectLocationList();

    Integer updateLocation(Location location);

    Integer deleteLocation(int lid);

    Integer selectLidByLstatus();

}
