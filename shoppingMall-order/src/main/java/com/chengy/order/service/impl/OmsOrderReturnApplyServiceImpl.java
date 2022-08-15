package com.chengy.order.service.impl;

import com.chengy.common.utils.PageUtils;
import com.chengy.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.chengy.order.dao.OmsOrderReturnApplyDao;
import com.chengy.order.entity.OmsOrderReturnApplyEntity;
import com.chengy.order.service.OmsOrderReturnApplyService;


@Service("omsOrderReturnApplyService")
public class OmsOrderReturnApplyServiceImpl extends ServiceImpl<OmsOrderReturnApplyDao, OmsOrderReturnApplyEntity> implements OmsOrderReturnApplyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsOrderReturnApplyEntity> page = this.page(
                new Query<OmsOrderReturnApplyEntity>().getPage(params),
                new QueryWrapper<OmsOrderReturnApplyEntity>()
        );

        return new PageUtils(page);
    }

}