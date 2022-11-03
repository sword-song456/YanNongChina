package com.wuchengdong.mapper;

import com.wuchengdong.pojo.Yanxuekecheng;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface yanxuekechengMapper {

    @Insert("insert into yanxuekecheng values (null,#{name},#{price},#{description},#{iconurl},#{isdelete})")
    int saveyanxuekecheng(Yanxuekecheng yanxuekecheng);

    @Delete("delete from yanxuekecheng where id = #{id}")
    int deleteyanxuekecheng(int id);

    @Update("update yanxuekecheng set NAME = #{name},price = #{price},description = #{description},iconurl = #{iconurl},isdelete = #{isdelete}")
    int updateyanxuekecheng(Yanxuekecheng yanxuekecheng);

    @Select("select * from yanxuekecheng")
    List<Yanxuekecheng> getAll();
    @Select("select * from yanxuekecheng limit 0,#{count}")
    List<Yanxuekecheng> getByCount(int count);
    @Select("select * from yanxuekecheng where id = #{id}")
    Yanxuekecheng getById(int id);
}
