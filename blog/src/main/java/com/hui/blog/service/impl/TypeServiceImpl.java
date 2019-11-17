package com.hui.blog.service.impl;

import com.hui.blog.bean.Type;
import com.hui.blog.bean.TypeExample;
import com.hui.blog.mapper.TypeMapper;
import com.hui.blog.service.TypeSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/17
 */
@Service
public class TypeServiceImpl implements TypeSerivce {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public int saveType(Type type) {
        return typeMapper.insert(type);
    }

    @Override
    public Type getType(String name) {
        TypeExample example = new TypeExample();
        example.createCriteria()
                .andNameEqualTo(name);
        List<Type> types = typeMapper.selectByExample(example);
        if (types.size()==1){
            return types.get(0);
        }
        return null;
    }

    @Override
    public List<Type> listType(Integer pageNum) {
        TypeExample example = new TypeExample();
        example.setOrderByClause("id DESC");
        return typeMapper.selectByExample(example);
    }

    @Override
    public Type getByIdType(Long id) {
        return typeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Type type) {
        return typeMapper.updateByPrimaryKey(type);
    }

    @Override
    public int delete(Long id) {
        return typeMapper.deleteByPrimaryKey(id);
    }
}
