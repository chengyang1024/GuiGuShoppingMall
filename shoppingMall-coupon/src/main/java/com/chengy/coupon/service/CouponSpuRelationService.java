package com.chengy.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.chengy.common.utils.PageUtils;
import com.chengy.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author chengy
 * @email 1061332369@qq.com
 * @date 2022-08-15 23:00:45
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

