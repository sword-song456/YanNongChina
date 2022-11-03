package com.wuchengdong.controller;

import com.wuchengdong.pojo.User;
import com.wuchengdong.service.LoginService;
import com.wuchengdong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class loginController {
    @Autowired
    LoginService loginService;

//普通用户登录
    @RequestMapping("/userLogin")
    @ResponseBody
    User userLogin(@RequestParam("username") String username,@RequestParam("password") String password) {
        return loginService.userLogin(username, password);
    }
//管理员后台登录
//    @RequestMapping("/background")
//    String backgroundLogin( String username, String password){
//        boolean b = loginService.backgroundLogin(username, password);
//        if (b) {
////            成功则跳转
//            return "backgroundSystem/background";
//        }else {
//            return null;
//        }
//    }
}
