package com.mysite.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//겟셋 메소드 , 전체필드변수 생성자
@Getter
@Setter
@AllArgsConstructor
public class User {

    private String id;
    private String name;
    private String phone;
    private String address;
}
