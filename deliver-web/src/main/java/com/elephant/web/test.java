package com.elephant.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Elephant-FZY
 * @Email: https://github.com/Elephant-BIG-LEG
 * @Date: 2025/07/08/15:08
 * @Description: TODO
 */
@RestController
public class test {

    @RequestMapping("/test")
    private String test(){
        return "测试成功";
    }
}
