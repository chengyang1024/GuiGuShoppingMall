package com.chengy.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chengy.common.utils.PageUtils;
import com.chengy.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author chengy
 * @email 1061332369@qq.com
 * @date 2022-08-15 12:17:14
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

