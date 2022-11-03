package com.wuchengdong.service;

import com.wuchengdong.pojo.Jidi;

import java.util.List;

public interface JidiService {
    int saveJidi(Jidi jidi);
    int deleteJidi(int id);
    int updateJidi(Jidi jidi);
    Jidi getJidiById(int id);
    List<Jidi> getAllJidi();

    List<Jidi> getAllJidi(int index);
}
