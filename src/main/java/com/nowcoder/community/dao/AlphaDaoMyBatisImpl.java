package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @author Mr.liu
 * @title: AlphaDaoMyBatisImpl
 * @projectName com.nowcoder.community.dao
 * @description: TODO
 * @date 2021/11/16 16:45
 */

@Repository
@Primary
public class AlphaDaoMyBatisImpl implements AlphaDao{
    @Override
    public String selet() {
        return "MyBatis";
    }
}
