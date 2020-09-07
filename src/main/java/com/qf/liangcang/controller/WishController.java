package com.qf.liangcang.controller;

import com.qf.liangcang.bean.AjaxMessage;
import com.qf.liangcang.pojo.Product;
import com.qf.liangcang.pojo.Wish;
import com.qf.liangcang.service.ProductService;
import com.qf.liangcang.service.WishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author WDZ
 * @date 2020/9/7
 * @time 8:51
 * @description
 */
@RestController
@RequestMapping("/lc/wish")
public class WishController {

    @Autowired
    private WishService wishService;

    @Autowired(required = false)
    private ProductService productService;

    @GetMapping("/get")
    public List<Wish> getWish() {
        return wishService.getWish();
    }

    @RequestMapping("/change")
    public AjaxMessage addAndCancelWish(int pid) {
        System.out.println("WishController++addWish++pid====" + pid);

        Product product = productService.selectProductByPid(pid);
        int pstatus = product.getPstatus();
        System.out.println("WishController++addWish++pstatus====" + pstatus);

        try {
            if (pstatus == 0) {
                Wish wish = new Wish();
                wish.setPid(pid);
                wish.setPimage(product.getPimage());
                wishService.addWish(wish);
                product.setPstatus(1);
                productService.changePstatus(product);
                return new AjaxMessage(true, "操作成功");
            }
            if (pstatus == 1) {
                product.setPstatus(0);
                productService.changePstatus(product);
                return new AjaxMessage(true, "修改成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxMessage(false, "操作失败");


//        try {
//            Product product = productService.selectProductByPid(pid);
//            System.out.println("WishController++addWish===="+product.getPname());
//            Wish wish = new Wish();
//            wish.setPid(pid);
//            wish.setPimage(product.getPimage());
//            wishService.addWish(wish);
//            return new AjaxMessage(true, "添加成功");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return new AjaxMessage(false, "添加失败");
    }
}
