package com.wuchengdong.service.Impl;

import com.wuchengdong.mapper.yanxuekechengMapper;
import com.wuchengdong.pojo.Yanxuekecheng;
import com.wuchengdong.service.yanxuekechengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class yanxuekechengServiceImpl implements yanxuekechengService {
    @Autowired
    yanxuekechengMapper yanxuekechengMapper;

    @Override
    public int saveyanxuekecheng(Yanxuekecheng yanxuekecheng) {
        return yanxuekechengMapper.saveyanxuekecheng(yanxuekecheng);
    }

    @Override
    public int deleteyanxuekecheng(int id) {
        return yanxuekechengMapper.deleteyanxuekecheng(id);
    }

    @Override
    public int updateyanxuekecheng(Yanxuekecheng yanxuekecheng) {
        return yanxuekechengMapper.updateyanxuekecheng(yanxuekecheng);
    }

    @Override
    public List<Yanxuekecheng> getAll() {
        return yanxuekechengMapper.getAll();
    }

    @Override
    public List<Yanxuekecheng> getByCount(int count) {
        return yanxuekechengMapper.getByCount(count);
    }

    @Override
    public Yanxuekecheng getById(int id) {
        return yanxuekechengMapper.getById(id);
    }
}
