package com.mysite.mybatis.controller;

import com.mysite.mybatis.mapper.UserMapper;
import com.mysite.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Rest 컨트롤러는 화면없이 바로 객체나 문자열을 제이슨으로 리턴
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        User user = userMapper.getUser(id);
        return user;
    }

    //모든 유저 리스트를 리턴
    @GetMapping
    public List<User> getUsers() {
        List<User> users = userMapper.getUsers();
        return users;
    }

    //새 유저 입력 (/users)
    @PostMapping
    public void createUser(@RequestParam("id") String id,
                           @RequestParam("name") String name,
                           @RequestParam("phone") String phone,
                           @RequestParam("address") String address) {

        userMapper.insertUser(id,name,phone,address);
    }

    //유저 업데이트 PUT 메서드
    @PutMapping("/{id}")
    public void editUser(@PathVariable String id,
                         @RequestParam("name") String name,
                         @RequestParam("phone") String phone,
                         @RequestParam("address") String address){

        userMapper.updateUser(id,name,phone,address);
    }



}
