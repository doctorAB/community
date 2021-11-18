package com.nowcoder.community;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Mr.liu
 * @title: LoggerTests
 * @projectName com.nowcoder.community
 * @description: TODO
 * @date 2021/11/18 17:23
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class LoggerTests {

    // 需要用工厂生成
    private static final Logger  logger = LoggerFactory.getLogger(LoggerTests.class);

    @Test
    public void testLogger(){
        logger.debug("logger-debug");
        logger.info("logger-info");
        logger.warn("logger-warn");
        logger.error("logger-error");
    }
}
