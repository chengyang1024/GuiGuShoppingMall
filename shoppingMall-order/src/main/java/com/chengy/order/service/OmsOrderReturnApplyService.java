package com.chengy.order.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.chengy.common.utils.PageUtils;
import com.chengy.order.entity.OmsOrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author chengy
 * @email 1061332369@qq.com
 * @date 2022-08-15 22:20:34
 */
public interface OmsOrderReturnApplyService extends IService<OmsOrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

