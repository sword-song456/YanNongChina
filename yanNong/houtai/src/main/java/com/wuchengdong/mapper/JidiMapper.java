package com.wuchengdong.mapper;

import com.wuchengdong.pojo.Jidi;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface JidiMapper {

    @Insert("insert into jidi values (null ,#{jidiName}, #{description})")
    int saveJidi(Jidi jidi);

    @Delete("delete from jidi where id = #{id}")
    int deleteJidi(int id);

    @Update("update jidi set jidiName = #{jidiName} ,description = #{description} where id = #{id}")
    int updateJidi(Jidi jidi);

    @Select("select * from jidi where id = #{id}")
    Jidi getJidiById(int id);

    @Select("select * from jidi")
    List<Jidi> getAllJidi();

    @Select("select * from jidi limit 0 ,#{index}")
    List<Jidi> getAllJidi2(int index);
}
