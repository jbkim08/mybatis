package com.mysite.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private Long prodId;     //CamelCase prod_id
    private String prodName; //DB 에서는 prod_name
    private int prodPrice;   //prod_price

    //id 없는 생성자 => 입력시 사용
    public Product(String prodName, int prodPrice) {
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }
}
