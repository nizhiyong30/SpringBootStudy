package com.example.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by nizy on 2018/9/5.
 */
@Configuration
@ImportResource(locations={"spring/applicationContext.xml"})
public class Config {
}
