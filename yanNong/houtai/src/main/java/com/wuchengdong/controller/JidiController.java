package com.wuchengdong.controller;

import com.alibaba.fastjson.JSON;
import com.wuchengdong.pojo.JidiBean;
import com.wuchengdong.pojo.Jidi;
import com.wuchengdong.service.ImageService;
import com.wuchengdong.service.JidiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jidi")
public class JidiController {
    @Autowired
    JidiService jidiService;
    @Autowired
    ImageService imageService;

    @GetMapping
    List<Jidi> getAllJidi(){
        return jidiService.getAllJidi();
    }
    @GetMapping("/{id}")
    Jidi getJidi(@PathVariable int id) {
        return jidiService.getJidiById(id);
    }
    @GetMapping("/limit/{index}")
    JidiBean getJidis(@PathVariable int index){
        JidiBean jidiBean = new JidiBean();
        List<Jidi> jidis = jidiService.getAllJidi(index);
        jidiBean.setJidis(jidis);
        List<String> strings = new ArrayList<String>();
        for (Jidi jidi : jidis) {
            List<String> imageByIndex = imageService.getImageByIndex(jidi.getStringId(), 1);
            strings.addAll(imageByIndex);
        }
        jidiBean.setImageUrls(strings);
//        System.out.println(JSON.toJSONString(jidiBean));
//        System.out.println(jidiBean);
        return jidiBean;
    }
    @GetMapping("/nolimit")
    JidiBean getJidis(){
        JidiBean jidiBean = new JidiBean();
        List<Jidi> jidis = jidiService.getAllJidi();
        jidiBean.setJidis(jidis);
        List<String> strings = new ArrayList<String>();
        for (Jidi jidi : jidis) {
            List<String> imageByIndex = imageService.getImageByIndex(jidi.getStringId(), 1);
            strings.addAll(imageByIndex);
        }
        jidiBean.setImageUrls(strings);
        return jidiBean;
    }
    @PostMapping
    int saveJidi(@RequestBody Jidi jidi){
        if(jidi.getJidiName()!=null){
            return jidiService.saveJidi(jidi);
        }else {
            return 0;
        }
    }

    @DeleteMapping("/{id}/{jidiName}")
    int deleteJidi(@PathVariable("id") int id,@PathVariable("jidiName") String jidiName) {
        //删除jidi表中数据
        int a = jidiService.deleteJidi(id);
        //删除image_group中数据
        int b = imageService.deleteImages(imageService.getImage(jidiName));
        return a;
    }

    @PutMapping
    int updateJidi(@RequestBody Jidi jidi) {
        return jidiService.updateJidi(jidi);
    }
}
