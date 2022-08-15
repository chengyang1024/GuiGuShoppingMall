package com.chengy.coupon;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class ShoppingMallCouponApplicationTests {

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

}
