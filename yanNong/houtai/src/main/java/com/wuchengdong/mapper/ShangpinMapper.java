package com.wuchengdong.mapper;

import com.wuchengdong.pojo.Shangpin;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface ShangpinMapper {
    @Select("select * from shangpin")
    List<Shangpin> getAll();

    @Select("select * from shangpin where id=#{id}")
    Shangpin getOne(int id);

    @Insert("insert into shangpin values (null,#{name},#{price},#{description},#{iconurl})")
    int saveShangpin(Shangpin shangpin);

    @Update("update shangpin set name=#{name},price=#{price},description=#{description},iconurl=#{iconurl} where id=#{id}")
    int updateShangpin(Shangpin shangpin);

    @Delete("delete from shangpin where id=#{id}")
    int deleteShangpin(int id);
}
