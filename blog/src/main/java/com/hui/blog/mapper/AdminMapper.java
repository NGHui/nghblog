package com.hui.blog.mapper;

import com.hui.blog.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/11
 */
@Mapper
public interface AdminMapper {

    @Select("select * from t_user where username=#{username} and password=#{password}")
    User login(@Value("username")String username, @Value("password")String  password);

}
