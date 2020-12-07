package com.joo.dao;

import domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * 用户的持久层接口
 */
public interface IUserDao {

    /**
     * 查询所有操作
     * @return
     */
    @Select("select * from user") //注解方式
    List<User> findAll();

    @Select("select * from user where id = #{id}")
    List<User> findById(Integer id);


}
