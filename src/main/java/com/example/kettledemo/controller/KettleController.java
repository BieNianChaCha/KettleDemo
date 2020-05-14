package com.example.kettledemo.controller;

import com.example.kettledemo.util.kettleUtil;
import com.google.common.collect.Maps;
import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package： com.example.kettledemo.controller
 * @Author: zhangchengjia
 * @Since: 2020/5/13 14:30
 * @Version: V1.0
 */
@RestController
public class KettleController {

    @GetMapping("test")
    public void test(String filePath, String param) throws Exception {
        HashMap<Object, Object> map = Maps.newHashMap();
        map.put("param", param);
        kettleUtil.callNativeJob(filePath, map);
    }
}
