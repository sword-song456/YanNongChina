package com.wuchengdong.service.Impl;

import com.wuchengdong.mapper.ImageMapper;
import com.wuchengdong.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
//管理image的 查找和删除 应为image不能改 增加由upload管理

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageMapper imageMapper;

    @Override
    public List<String> getImage(String group_name) {
        return imageMapper.selectImageUrl(group_name);
    }

    @Override
    public List<String> getImageByIndex(String group_name, int index) {
        return imageMapper.selectImageUrlByIndex(group_name, index);
    }

    @Override
    public int deleteImage(String url) {
        return imageMapper.deleteImageUrl(url);
    }

    @Override
    public int deleteImages(List<String> urls) {
        int cnt=0;
        for (String url : urls) {
            if (deleteImage(url) == 1) {
                cnt++;
            }
        }
        return cnt;
    }

}
