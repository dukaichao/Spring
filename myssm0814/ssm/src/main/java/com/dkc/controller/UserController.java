package com.dkc.controller;


import com.dkc.po.User;
import com.dkc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/showUserList")
    public ModelAndView userController() throws Exception{


        List<User> userList =  userService.queryUserListService();

        ModelAndView modelAndView  = new ModelAndView();
        modelAndView.addObject("userListKey",userList);
        modelAndView.setViewName("showuser");
        return modelAndView;
    }
}
