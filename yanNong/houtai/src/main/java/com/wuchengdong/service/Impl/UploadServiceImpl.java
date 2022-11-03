package com.wuchengdong.service.Impl;

import com.wuchengdong.service.UploadService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
@Service
@PropertySource("classpath:config.properties")
public class UploadServiceImpl implements UploadService {
    @Value("${staticResourcePath}")
    String staticResourcePath;
    @Override
    public String imageUpload(MultipartFile file, String dir) {
        //切除 “file:”
        String staticResourcePath2 = staticResourcePath.substring(5);
        try{
            //获取真实文件名
            String filename = file.getOriginalFilename();
            //用真实文件名拿到后缀
            String suffix = filename.substring(filename.lastIndexOf('.'));
            //生成系统储存的唯一文件名
            String newFilename = UUID.randomUUID().toString()+ suffix;

            //创建文件目录
            File filePath = new File(staticResourcePath2+"/"+dir);
            if (!filePath.exists()) {
                filePath.mkdirs();
            }
            //上传
            File targrtFile = new File(filePath,newFilename);
            file.transferTo(targrtFile);

            return "upload/"+dir+"/"+newFilename;
        }catch (IOException e) {
            return "error";
        }
    }
}
