package com.wuchengdong.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wuchengdong.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/images")
public class imagesController {
    @Autowired
    ImageService imageService;

    @GetMapping("/{group_name}")
    List<String> getImage(@PathVariable String group_name){
//        System.out.println(JSON.toJSONString(imageService.getImage(group_name)));
        return imageService.getImage(group_name);
    }
    @GetMapping("/{group_name}/{index}")
    List<String> getImage(@PathVariable("group_name") String group_name,@PathVariable("index") int index) {
//        System.out.println(JSON.toJSONString(imageService.getImageByIndex(group_name, index)));
        return imageService.getImageByIndex(group_name,index);
    }

    @DeleteMapping ("/delete")
    int deleteImage(@RequestBody String url) {
        System.out.println(url);
        return imageService.deleteImage(url);
    }

}
