package com.example.springboot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by nizy on 2018/9/4.
 */
@Service("userService")
public class UserService {

    Logger logger = LoggerFactory.getLogger("SpringBootTest");

    public void doSomething() {
        logger.info("doing");
        System.out.println("doing");
    }
}
