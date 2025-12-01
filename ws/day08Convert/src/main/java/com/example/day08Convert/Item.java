package com.example.day08Convert;


//

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

// "문자열" -> 숫자
// 날짜 변환
// 운동#산책#영화 => String[]

@Data
public class Item {

    //int , long   =>  Integer , Long
    int money;
    String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date inDate;

}
