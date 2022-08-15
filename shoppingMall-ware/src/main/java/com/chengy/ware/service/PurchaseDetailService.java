package com.chengy.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chengy.common.utils.PageUtils;
import com.chengy.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author chengy
 * @email 1061332369@qq.com
 * @date 2022-08-15 23:33:51
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

