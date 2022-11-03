package com.wuchengdong.pojo;

import lombok.Data;

@Data
public class Jidi {
    int id;

    String jidiName;

    String description;

    public String getStringId(){
        return String.valueOf(id);
    }

}
