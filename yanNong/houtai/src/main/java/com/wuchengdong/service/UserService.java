package com.wuchengdong.service;

import com.wuchengdong.pojo.User;

import java.util.List;

public interface UserService {

    int saveUser(User user);

    int deleteUser(int id);

    int updateUser(User user);

    List<User> getAllUser();

    User getUserById(int id);

}
