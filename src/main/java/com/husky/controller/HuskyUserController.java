package com.husky.controller;

import com.husky.model.HuskyUser;
import com.husky.service.HuskyUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class HuskyUserController {
    @Resource
    private HuskyUserService huskyUserService;

    @GetMapping("/findAll")
    public String findAll(Model model){
        List<HuskyUser> huskyUserList = huskyUserService.findAll();
        for(HuskyUser huskyUser:huskyUserList){
            System.out.println("id:" + huskyUser.getId());
            System.out.println("name:" + huskyUser.getName());
        }
        System.out.println("张三 李四");
        return "hello";
    }
}
