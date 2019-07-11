package com.example.demo.Controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@Autowired
private UserService userService;

    @GetMapping("/test/{item}")
    public   String  test(@PathVariable Integer item){
       User user= userService.findById(item);
        return JSON.toJSONString(user);

    }
}
