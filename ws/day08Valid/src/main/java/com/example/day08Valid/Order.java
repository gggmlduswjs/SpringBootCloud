package com.example.day08Valid;

import lombok.Data;

@Data
public class Order {

    String name; // 상품이름
    Integer price;
            // int -> Integer 없는 경우 null -> int는 null 저장할 수 없다.(Integer로 하는게 좋음)
    Integer qty;
}
