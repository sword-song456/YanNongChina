package com.wuchengdong.service;


import java.util.List;

public interface ImageService {
    List<String> getImage(String group_name);
    List<String> getImageByIndex(String group_name,int index);
    int deleteImage(String url);
    int deleteImages(List<String> urls);

}
