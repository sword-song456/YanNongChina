package com.wuchengdong.controller;

import com.wuchengdong.pojo.Yanxuekecheng;
import com.wuchengdong.service.yanxuekechengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//管理各种页面跳转
@Controller
public class webController {
    //伪静态页面跳转
    @RequestMapping("")
    String index(){
        return "index";
    }
    @RequestMapping("/_yanxuekecheng")
    String yanxuekecheng(){
        return "pages/yanxuekecheng";
    }
    @RequestMapping("/jidijianshe")
    String jidijianshe(){
        return "pages/jidijianshe";
    }
    @RequestMapping("/wangqihuigu")
    String wangqihuigu(){
        return "pages/wangqihuigu";
    }
    @RequestMapping("/xiangcunzhenxin")
    String xiangcunzhenxin(){
        return "pages/xiangcunzhenxin";
    }
    @RequestMapping("/lianxiwomen")
    String lianxiwomen(){
        return "pages/lianxiwomen";
    }
    @RequestMapping("/background")
    String backgroundLogin(){
        return "backgroundSystem/backgroundLogin";
    }
    @RequestMapping("/backgroundTable")
    String Login(){
        return "backgroundSystem/background";
    }

    @Autowired
    yanxuekechengService yanxuekechengService;

    //动态页面跳转
    @RequestMapping("/yanxuekechengDetail/{id}")
    String yanxuekechengDetail(@PathVariable int id){
        return "detailpages/yanxuekechengDetail";
    }

    @RequestMapping("/jidiDetail/{id}")
    String jidiDetail(@PathVariable int id){
        return "detailpages/jidiDetail";
    }

}
