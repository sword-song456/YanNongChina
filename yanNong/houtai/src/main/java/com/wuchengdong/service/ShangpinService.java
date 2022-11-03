package com.wuchengdong.service;

import com.wuchengdong.pojo.Shangpin;

import java.util.List;

public interface ShangpinService {
    List<Shangpin> getShangpin(String model);
    int setShangpin(Shangpin shangpin);

    int deleteShangpin(int id);

    int updateShangpin(Shangpin shangpin);
}
