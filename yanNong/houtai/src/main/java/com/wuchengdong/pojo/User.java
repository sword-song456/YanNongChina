package com.wuchengdong.pojo;

import lombok.Data;

@Data
public class User {
    int id;
    int gender;
    String username;
    String description;
    String iconurl;
    String password;
}
