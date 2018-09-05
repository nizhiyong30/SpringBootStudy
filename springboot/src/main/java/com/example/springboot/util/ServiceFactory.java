package com.example.springboot.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by nizy on 2018/9/5.
 */

public class ServiceFactory implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ServiceFactory.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return ServiceFactory.applicationContext;
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(String bean, Class<T> clazz) {
        return (T) applicationContext.getBean(bean);
    }
}
