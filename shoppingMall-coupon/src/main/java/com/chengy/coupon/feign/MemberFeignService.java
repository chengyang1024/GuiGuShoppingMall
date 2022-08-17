package com.chengy.coupon.feign;

import com.chengy.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value = "member", path = "member/growthchangehistory")
public interface MemberFeignService {

    @RequestMapping("/test")
    R test();
}
