package com.nowcoder.community.dao;


import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

// Mapper注解不生效
@Mapper
@Repository
public interface UserMapper {

    // 根据id查询用户
    User selectById(int id);

    // 根据用户名查询用户
    User selectByName(String name);

    // 根据邮箱查询用户
    User selectByEmail(String email);

    // 插入用户返回影响行数
    int insertUser(User user);

    // 修改用户状态返回影响行数
    int updateStatus(int id, int status);

    // 修改用户头像返回影响行数
    int updateHeader(int id, String headerUrl);

    // 修改用户密码返回影响行数
    int updatePassword(int id, String password);
}
