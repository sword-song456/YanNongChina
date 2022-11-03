package com.wuchengdong.service.Impl;

import com.wuchengdong.mapper.LoginMapper;
import com.wuchengdong.pojo.User;
import com.wuchengdong.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;

//    后台登录
    @Override
    public boolean backgroundLogin(String username, String password) {
        int i = loginMapper.backgroundLogin(username, password);
        if(i==1){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public User userLogin(String username, String password) {
        return loginMapper.userlogin(username, password);
    }
}
