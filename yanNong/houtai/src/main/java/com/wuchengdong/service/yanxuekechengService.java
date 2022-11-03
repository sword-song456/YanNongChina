package com.wuchengdong.service;

import com.wuchengdong.pojo.Yanxuekecheng;

import java.util.List;

public interface yanxuekechengService {

    int saveyanxuekecheng(Yanxuekecheng yanxuekecheng);

    int deleteyanxuekecheng(int id);

    int updateyanxuekecheng(Yanxuekecheng yanxuekecheng);

    List<Yanxuekecheng> getAll();

    List<Yanxuekecheng> getByCount(int count);

    Yanxuekecheng getById(int id);
}
