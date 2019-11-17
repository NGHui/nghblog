package com.hui.blog.service;

import com.hui.blog.bean.Type;

import java.util.List;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/17
 */
public interface TypeSerivce {

    /**
     * 添加分类
     * @param type
     * @return
     */
    int saveType(Type type);

    /**
     * 根据名字查询分类
     * @param name
     * @return
     */
    Type getType(String name);

    /**
     * 分类分页
     * @param pageNum
     * @return
     */
    List<Type> listType(Integer pageNum);

    /**
     * 通过id获取分类
     * @param id
     * @return
     */
    Type getByIdType(Long id);

    /**
     * 更新分类,先查询,后更新
     * @param type
     * @return
     */
    int update(Type type);

    /**
     * 根据id删除分类
     * @param id
     * @return
     */
    int delete(Long id);

}
