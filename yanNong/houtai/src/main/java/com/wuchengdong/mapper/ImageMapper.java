package com.wuchengdong.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface ImageMapper {
    //查找图片 返回列表
    @Select("select url from image_groups where group_name = #{group_name}")
    List<String> selectImageUrl(String group_name);

    @Select("select url from image_groups where group_name = #{group_name} limit 0,#{index}")
    List<String> selectImageUrlByIndex(@Param("group_name") String group_name,@Param("index") int index);

    //储存新加入的图片url
    @Insert("insert into image_groups values (#{group_name}, #{path})")
    int saveImageUrl(@Param("group_name") String group_name, @Param("path") String path);

    //删除图片
    @Delete("delete from image_groups where url = #{path}")
    int deleteImageUrl(@Param("path") String path);
}
