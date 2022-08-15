package com.chengy.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.chengy.common.utils.PageUtils;
import com.chengy.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author chengy
 * @email 1061332369@qq.com
 * @date 2022-08-15 23:00:44
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

