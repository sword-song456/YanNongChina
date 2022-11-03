package com.wuchengdong.controller;
import com.wuchengdong.mapper.ImageMapper;
import com.wuchengdong.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

//管理各种上传文件（图片）

@Controller
@RequestMapping("/upload")
public class uploadController {
    @Autowired
    UploadService uploadService;
    @Autowired
    ImageMapper imageMapper;


    @ResponseBody
    @RequestMapping("/image/{group_name}")
    String imageUpload(MultipartFile file,@PathVariable("group_name") String dir){
        if (file.isEmpty()) {
            return null;
        }
        //调用service层 储存图片
        String path = uploadService.imageUpload(file, dir);
        //调用mapper层  储存路径
        imageMapper.saveImageUrl(dir,path);
        return path;
    }
    @ResponseBody
    @RequestMapping("/image/{group_name}/{dir}")
    String imageUpload2(MultipartFile file,@PathVariable("group_name") String group_name,@PathVariable("dir")String dir){
        if (file.isEmpty()) {
            return null;
        }
        //调用service层 储存图片
        String path = uploadService.imageUpload(file, group_name+'/'+dir);
        //调用mapper层  储存路径
        imageMapper.saveImageUrl(dir,path);
        return path;
    }
}
