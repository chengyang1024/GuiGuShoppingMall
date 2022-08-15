package com.chengy.coupon.dao;

import com.chengy.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chengy
 * @email 1061332369@qq.com
 * @date 2022-08-15 23:00:44
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
