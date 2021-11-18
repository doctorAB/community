package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author Mr.liu
 * @title: AlphaDaoHibernateImpl
 * @projectName com.nowcoder.community.dao
 * @description: TODO
 * @date 2021/11/16 16:35
 */

@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao {
    @Override
    public String selet() {
        return "Hibernate";
    }
}
