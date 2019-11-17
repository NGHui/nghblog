package com.hui.blog.service.impl;

import com.hui.blog.bean.Tag;
import com.hui.blog.bean.TagExample;
import com.hui.blog.mapper.TagMapper;
import com.hui.blog.service.TagService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/12
 */
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    @Transactional
    @Override
    public int saveTag(Tag tag) {
        return tagMapper.insert(tag);
    }
    @Transactional
    @Override
    public Tag getTag(String name){
        TagExample example = new TagExample();
        example.createCriteria()
                .andNameEqualTo(name);
        List<Tag> tags = tagMapper.selectByExample(example);
        if (tags.size()==1){
            return tags.get(0);
        }
        return null;
    }

    /**
     * 分页排序,按照id排序
     * @param pageNum
     * @return
     */
    @Transactional
    @Override
    public List<Tag> listTag(Integer pageNum) {
        TagExample example = new TagExample();
        example.setOrderByClause("id DESC");
        List<Tag> tags = tagMapper.selectByExample(example);
        return tags;
    }

    @Transactional
    @Override
    public Tag getByIdTag(Long id) {
        return tagMapper.selectByPrimaryKey(id);
    }

    @Transactional
    @Override
    public int update(Tag type) {
        return tagMapper.updateByPrimaryKey(type);
    }

    @Override
    public int delete(Long id) {
        return tagMapper.deleteByPrimaryKey(id);
    }
}
