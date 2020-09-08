package com.qf.liangcang.controller;

import com.qf.liangcang.bean.AjaxMessage;
import com.qf.liangcang.pojo.Location;
import com.qf.liangcang.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author WDZ
 * @date 2020/9/7
 * @time 18:07
 * @description
 */
@RestController
@RequestMapping("/lc/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping("/add")
    public AjaxMessage addLocation(Location location) {
        try {
            locationService.addLocation(location);
            return new AjaxMessage(true, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxMessage(true, "添加失败");
    }

    @GetMapping("/get")
    public List<Location> getLocationList() {
        return locationService.getLocationList();
    }

    @PostMapping("/update")
    public AjaxMessage updateLocation(Location location) {
        try {
            locationService.updateLocation(location);
            return new AjaxMessage(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxMessage(true, "修改失败");
    }

    @PutMapping("/delete")
    public AjaxMessage deleteLocation(int lid) {
        try {
            locationService.deleteLocation(lid);
            return new AjaxMessage(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxMessage(true, "删除失败");
    }

    /**
     * 设置默认地址
     * @param lid
     * @return
     */
    @RequestMapping("/change")
    public AjaxMessage changeLstatus(Integer lid) {

        Integer lidByLstatus = locationService.selectLidByLstatus();
        System.out.println("lidByLstatus\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" +
                "" + lidByLstatus);
        Location location = new Location();
        location.setLid(lid);
        location.setLstatus(1);

        if (lidByLstatus == null) {
            locationService.updateLocation(location);
            return new AjaxMessage(true, "设置成功");
        } else if (lidByLstatus != null) {
            Location location1 = new Location();
            location1.setLid(lidByLstatus);
            location1.setLstatus(0);
            locationService.updateLocation(location1);
            locationService.updateLocation(location);
            return new AjaxMessage(true, "设置成功");
        } else {
            return new AjaxMessage(false, "设置失败");
        }
    }
}
