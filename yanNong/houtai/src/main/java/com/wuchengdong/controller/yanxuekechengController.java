package com.wuchengdong.controller;

import com.alibaba.fastjson.JSON;
import com.wuchengdong.pojo.Yanxuekecheng;
import com.wuchengdong.service.yanxuekechengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlFormatName.JSON;

@RestController
@RequestMapping("/yanxuekecheng")
public class yanxuekechengController {
    @Autowired
    yanxuekechengService yanxuekechengService;

    @GetMapping
    List<Yanxuekecheng> getAll(){
        return yanxuekechengService.getAll();
    }
    @GetMapping("/limit/{count}")
    List<Yanxuekecheng> getByCount(@PathVariable int count){
        //获取前count条数据
//        System.out.println(com.alibaba.fastjson.JSON.toJSONString(yanxuekechengService.getByCount(count)));
        return yanxuekechengService.getByCount(count);
    }
    @GetMapping("/{id}")
    Yanxuekecheng getById(@PathVariable int id) {
        return yanxuekechengService.getById(id);
    }
    @PostMapping
    int saveyanxuekecheng(@RequestBody Yanxuekecheng yanxuekecheng){
        System.out.println(yanxuekecheng);
        return yanxuekechengService.saveyanxuekecheng(yanxuekecheng);
    }
    @DeleteMapping("/{id}")
    int deleteyanxuekecheng(@PathVariable int id){
        return yanxuekechengService.deleteyanxuekecheng(id);
    }

}
