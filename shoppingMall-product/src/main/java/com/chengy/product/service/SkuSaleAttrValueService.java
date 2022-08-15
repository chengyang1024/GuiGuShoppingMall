package com.chengy.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chengy.common.utils.PageUtils;
import com.chengy.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author chengy
 * @email 1061332369@qq.com
 * @date 2022-08-15 12:17:14
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

