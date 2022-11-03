package com.wuchengdong.service.Impl;

import com.wuchengdong.mapper.ShangpinMapper;
import com.wuchengdong.pojo.Shangpin;
import com.wuchengdong.service.ShangpinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ShangpinServiceImpl implements ShangpinService {
    public static final String GET_ALL = "getall";
    public static final String RANDOM = "random";
    @Autowired
    ShangpinMapper shangpinMapper;
    Random random = new Random();
    @Override
    public List<Shangpin> getShangpin(String model) {
        List<Shangpin> all = shangpinMapper.getAll();
        int size = all.size();
        if(model.equals(GET_ALL)){
//            查询所有商品信息
            return all;
        } else if (model.equals(RANDOM)) {
//            提供随机商品信息(优惠页面使用该数据)
            int count = 6; //-----------------------------
            if(size <= count) return all;
//            取随机数（取count个）
            ArrayList<Integer> ints = new ArrayList<>();
            for (int cnt = 0; cnt < count; cnt++){
                int i = random.nextInt(size);
                while (ints.contains(i)){
                    i = random.nextInt(size);
                }
                ints.add(i);
            }
            List<Shangpin> shangpins = new ArrayList<>();
            for (int a:ints){
                shangpins.add(all.get(a));
            }
            return shangpins;
        } else {
            return null;
        }
    }

    @Override
    public int setShangpin(Shangpin shangpin){
        return shangpinMapper.saveShangpin(shangpin);
    }

    @Override
    public int deleteShangpin(int id) {
        return shangpinMapper.deleteShangpin(id);
    }

    @Override
    public int updateShangpin(Shangpin shangpin) {
        return shangpinMapper.updateShangpin(shangpin);
    }
}
