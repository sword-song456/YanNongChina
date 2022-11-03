package com.wuchengdong.service.Impl;

import com.wuchengdong.mapper.JidiMapper;
import com.wuchengdong.pojo.Jidi;
import com.wuchengdong.service.JidiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JidiServiceImpl implements JidiService {
    @Autowired
    JidiMapper jidiMapper;
    @Override
    public int saveJidi(Jidi jidi) {
        return jidiMapper.saveJidi(jidi);
    }


    @Override
    public int deleteJidi(int id) {
        return jidiMapper.deleteJidi(id);
    }

    @Override
    public int updateJidi(Jidi jidi) {
        return jidiMapper.updateJidi(jidi);
    }

    @Override
    public Jidi getJidiById(int id) {
        return jidiMapper.getJidiById(id);
    }

    @Override
    public List<Jidi> getAllJidi() {
        return jidiMapper.getAllJidi();
    }

    @Override
    public List<Jidi> getAllJidi(int index) {
        return jidiMapper.getAllJidi2(index);
    }
}
