package com.wuchengdong.service.Impl;

import com.wuchengdong.mapper.UserMapper;
import com.wuchengdong.pojo.User;
import com.wuchengdong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int saveUser(User user) {
        return userMapper.saveUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public User getUserById(int id) {
        return userMapper.selectUserById(id);
    }
}
