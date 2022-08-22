package com.chengy.product;

import com.chengy.product.entity.BrandEntity;
import com.chengy.product.service.BrandService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShoppingmallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("华为手机");
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
        BrandEntity byId = brandService.getById(1L);
        System.out.println(byId);
    }

}
