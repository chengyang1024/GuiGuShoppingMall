package com.chengy.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chengy.common.utils.PageUtils;
import com.chengy.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 搴撳瓨宸ヤ綔鍗�
 *
 * @author chengy
 * @email 1061332369@qq.com
 * @date 2022-08-15 23:33:51
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

