package com.cloud.mall.dao;

import com.cloud.mall.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * User: Wang Pengfei
 * Date: 2021/2/2
 * Time: 下午5:48
 * Description: No Description
 */
@Mapper
public interface UserDao {

    @Select("select * from user where id  = #{id}")
    User getById(String id);
}
