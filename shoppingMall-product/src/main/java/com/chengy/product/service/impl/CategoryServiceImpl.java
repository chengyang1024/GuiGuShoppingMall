package com.chengy.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chengy.common.utils.PageUtils;
import com.chengy.common.utils.Query;

import com.chengy.product.dao.CategoryDao;
import com.chengy.product.entity.CategoryEntity;
import com.chengy.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {
    @Autowired
    CategoryDao categoryDao;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> queryTree() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(new QueryWrapper<>());
        //2.1）、找到所有的一级分类
        List<CategoryEntity> level1Menus = categoryEntities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).map((menu)->{
            menu.setChildrens(getChildrens(menu,categoryEntities));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());

        return level1Menus;
    }

    private List<CategoryEntity> getChildrens(CategoryEntity entity, List<CategoryEntity> all) {

        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == entity.getCatId();
        }).map(categoryEntity -> {
            //1、找到子菜单
            categoryEntity.setChildrens(getChildrens(categoryEntity,all));
            return categoryEntity;
        }).sorted((menu1,menu2)->{
            //2、菜单的排序
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());

        return children;
    }


    /**
     * mybatisplus 逻辑删除(实体类加@TableLogic)
     *
     * @param asList
     * @return
     */
    @Override
    public int removeMenusByIds(List<Long> asList) {
        //todo 检查当前菜单是否被别的地方引用
        return baseMapper.deleteBatchIds(asList);
    }

}
