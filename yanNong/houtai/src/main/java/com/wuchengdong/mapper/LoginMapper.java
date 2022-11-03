package com.wuchengdong.mapper;

import com.wuchengdong.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface LoginMapper {
//    普通用户登录
    @Select("select * from users where username = #{username} and password = #{password}")
    User userlogin(@Param("username") String username, @Param("password") String password);

//    管理员登录/后台登录
    @Select("select count(*) from Administrator where username=#{username} and password=#{password}")
    int backgroundLogin(@Param("username")String username,@Param("password")String password);
}
