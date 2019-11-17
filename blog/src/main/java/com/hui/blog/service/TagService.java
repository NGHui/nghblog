package com.hui.blog.service;

import com.hui.blog.bean.Tag;

import java.util.List;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/12
 */
public interface TagService {

    /**
     * 添加标签
     * @param tag
     * @return
     */
    int saveTag(Tag tag);

    /**
     * 根据名字查询标签
     * @param name
     * @return
     */
    Tag getTag(String name);

    /**
     * 标签分页
     * @param pageNum
     * @return
     */
    List<Tag> listTag(Integer pageNum);

    /**
     * 通过id获取标签
     * @param id
     * @return
     */
    Tag getByIdTag(Long id);


    /**
     * 更新标签,先查询,后更新
     * @param type
     * @return
     */
    int update(Tag type);

    /**
     * 根据id删除标签
     * @param id
     * @return
     */
    int delete(Long id);

}
