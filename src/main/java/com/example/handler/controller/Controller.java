package com.example.handler.controller;

import com.example.handler.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author yangzengchun
 * @Title: Controller
 * @ProjectName handler
 * @Description: TODO
 * @date 2019-02-2610:24
 */
@RestController
public class Controller {

    @GetMapping("/")
    public  Object test(){

        int i = 1/0;
        return new User(111, "abc123", "10001000", new Date());
    }
}
