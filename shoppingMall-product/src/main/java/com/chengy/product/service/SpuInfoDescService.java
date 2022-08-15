package com.chengy.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chengy.common.utils.PageUtils;
import com.chengy.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author chengy
 * @email 1061332369@qq.com
 * @date 2022-08-15 12:17:14
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

