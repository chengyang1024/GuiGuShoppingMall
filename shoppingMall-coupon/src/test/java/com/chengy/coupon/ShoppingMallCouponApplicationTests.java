package com.chengy.coupon;

import com.chengy.common.utils.R;
import com.chengy.coupon.controller.CouponController;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class ShoppingMallCouponApplicationTests {

    @Autowired
    CouponController couponController;

    @Test
    void contextLoads() {

        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setName(i+"name");
            user.setAge(i+"");
            userList.add(user);
        }

        System.out.println(userList);
        List<User> userList2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            User user = new User();
            user.setName(i+"name");
            user.setAge(i+"");
            userList2.add(user);
        }
        System.out.println(userList2);

        List<User> collect = userList.stream().filter(item -> userList2.contains(item)).collect(Collectors.toList());
        System.out.println("---交集 intersection---");
        System.out.println(collect);
    }

    @Test
    public void testFeign(){
        R r = couponController.testFeign();
        System.out.println(r);
    }

    /**
     * 测试动态获取配置文件
     */
    @Test
    public void testProperties(){
        R r = couponController.testProperties();
        System.out.println(r);
    }

}
