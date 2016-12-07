package com.weather.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by kimi-li on 2016/12/6.
 * 测试
 */
@Controller
public class TestController {
    @ResponseBody
    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    public String getHello() {
        return "WeatherServer Api Test";
    }
}
