package com.example.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.springboot.service.UserService;
import com.example.springboot.util.ServiceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by nizy on 2018/9/4.
 */
@RestController
@RequestMapping(value = "/test")

public class TestController {

    Logger logger = LoggerFactory.getLogger("SpringBootTest");

    @PostMapping("/user/tasklist")
    public String test(@RequestBody String para, HttpServletResponse response) {
        Map<String, String> paraMap = JSONObject.parseObject(para, Map.class);
        UserService userService = ServiceFactory.getBean("userService", UserService.class);
        userService.doSomething();
        logger.error("logTest");
        return paraMap.get("data");
    }
}
