package com.wuchengdong.service;

import com.wuchengdong.pojo.User;

public interface LoginService {

    boolean backgroundLogin(String username,String password);
    User userLogin(String username, String password);
}
