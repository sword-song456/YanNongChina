package com.wuchengdong.pojo;

import lombok.Data;

import java.util.List;
@Data
public class JidiBean {
    List<Jidi> Jidis;
    List<String> ImageUrls;

    public void setJidis(List<Jidi> jidis) {
        this.Jidis=jidis;
    }

    public void setImageUrls(List<String> strings) {
        this.ImageUrls=strings;
    }
}
