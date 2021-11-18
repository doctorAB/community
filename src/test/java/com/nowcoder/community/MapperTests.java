package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * @author Mr.liu
 * @title: MapperTests
 * @projectName com.nowcoder.community
 * @description: TODO
 * @date 2021/11/17 17:47
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTests{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelect(){
        User user = userMapper.selectById(101);
        System.out.println(user.toString());

        user = userMapper.selectByName("liubei");
        System.out.println(user.toString());

        user = userMapper.selectByEmail("nowcoder101@sina.com");
        System.out.println(user.toString());
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setUsername("test");
        user.setPassword("123456");
        user.setSalt("abc");
        user.setEmail("test@qq.com");
        user.setHeaderUrl("http://www.nowcoder.com/101.png");
        user.setCreateTime(new Date());

        int rows = userMapper.insertUser(user);
        System.out.println(rows);
        System.out.println(user.getId());
    }

    @Test
    public void testUpdate(){
        int rows = userMapper.updateStatus(151,1);
        System.out.println(rows);

        rows = userMapper.updateHeader(151,"http://www.nowcoder..com/100.png");
        System.out.println(rows);

        rows = userMapper.updatePassword(151,"hello");
        System.out.println(rows);
    }

    @Test
    public void testSelectPost(){
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(0,0,10);
        for (DiscussPost item : discussPosts) {
            System.out.println(item);
        }

        int rows = discussPostMapper.selectDiscussPostRows(0);
        System.out.println(rows);
    }
}
