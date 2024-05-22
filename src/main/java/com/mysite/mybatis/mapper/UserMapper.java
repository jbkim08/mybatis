package com.mysite.mybatis.mapper;

import com.mysite.mybatis.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

//마이바티스는 리파지토리 대신 매퍼를 사용하여 만듬
@Mapper
public interface UserMapper {

    //XML 대신에 @select update delete insert 로 바로 작성가능
    @Select("select * from user where id=#{id}")
    public User getUser(String id);

    //모든 유저 리스트 리턴
    @Select("select * from user")
    public List<User> getUsers();

    //새 유저 입력
    @Insert("insert into user values (#{id},#{name},#{phone},#{address})")
    public int insertUser(String id, String name, String phone, String address);

    //유저 업데이트
    @Update("update user set name=#{name}, phone=#{phone}, address=#{address} where id=#{id}")
    public int updateUser(String id, String name, String phone, String address);

    //유저 삭제 (id)
    @Delete("delete from user where id=#{id}")
    public int deleteUser(String id);
}
