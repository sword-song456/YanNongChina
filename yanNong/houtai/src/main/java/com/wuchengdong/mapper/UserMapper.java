package com.wuchengdong.mapper;

import com.wuchengdong.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserMapper {

    @Insert("insert into users values (null,#{gender},#{username},#{description},#{password})")
    int saveUser(User user);

    @Delete("delete from users where id = #{id}")
    int deleteUser(int id);

    @Update("update users set gender = #{gender}, username = #{username}, description = #{description}, password = #{password} where id = #{id}")
    int updateUser(User user);

    @Select("select * from users")
    List<User> selectAllUser();

    @Select("select * from users where id = #{id}")
    User selectUserById(int id);


}
