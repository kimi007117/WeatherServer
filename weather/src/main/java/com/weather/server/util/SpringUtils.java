package com.weather.server.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kimi-li on 2016/12/6.
 */
public class SpringUtils {
    private static ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    public static Object getBean(String beanName){
        return ctx.getBean(beanName);
    }
}
