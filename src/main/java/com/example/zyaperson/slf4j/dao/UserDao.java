package com.example.zyaperson.slf4j.dao;

import com.example.zyaperson.slf4j.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select id as id,name as name,email as email from user")
    List<User> findAllUser();
}
