package com.chengy.order.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.chengy.common.utils.PageUtils;
import com.chengy.order.entity.OmsPaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author chengy
 * @email 1061332369@qq.com
 * @date 2022-08-15 22:20:34
 */
public interface OmsPaymentInfoService extends IService<OmsPaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

