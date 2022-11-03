package com.wuchengdong.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("Yanxuekecheng")
public class Yanxuekecheng {
    @TableId(type = IdType.AUTO)
    int id;

    String name;

    int price;

    String description;

    String iconurl;

    int isdelete = 0;

}
