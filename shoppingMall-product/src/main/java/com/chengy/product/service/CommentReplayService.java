package com.chengy.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chengy.common.utils.PageUtils;
import com.chengy.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author chengy
 * @email 1061332369@qq.com
 * @date 2022-08-15 12:17:14
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

