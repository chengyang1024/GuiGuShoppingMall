package com.chengy.product.dao;

import com.chengy.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chengy
 * @email 1061332369@qq.com
 * @date 2022-08-15 12:17:14
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
