package com.wuchengdong.houtai;

import com.wuchengdong.mapper.ImageMapper;
import com.wuchengdong.service.ImageService;
import com.wuchengdong.service.LoginService;
import org.apache.catalina.connector.Connector;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HoutaiApplicationTests {
    @Autowired
    ImageService imageService;
    @Autowired
    LoginService loginService;
    @Autowired
    ImageMapper imageMapper;

    @Autowired
    Connector connector;


    @Test
    void testImageService() {
        System.out.println(imageService.getImage("swipers"));
    }
    @Test
    void testLoginService(){
        System.out.println(loginService.backgroundLogin("root", "1234"));
    }
    @Test
    void testImagerMapprt(){
//        System.out.println(imageMapper.selectImageUrlByIndex("2", 1));
        System.out.println(imageService.getImageByIndex("2", 1));
    }

    @Test
    public void test1()
    {
        System.out.println("*************************************");
        System.out.println("======================="+connector);
    }
}
