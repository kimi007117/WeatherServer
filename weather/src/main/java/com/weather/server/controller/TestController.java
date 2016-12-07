package com.weather.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kimi-li on 2016/12/6.
 * 测试
 */
@Controller
public class TestController {
    @ResponseBody
    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    public Map getHello() {
        Map<String,Object> map = new HashMap<>();
        map.put("id",100100);
        map.put("city","北京");
        return map;
    }
}
