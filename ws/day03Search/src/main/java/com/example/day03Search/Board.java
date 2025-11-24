package com.example.day03Search;

import lombok.Data;


// 생성자와 setter를 사용하여 객체 생성과 값을 넣는다
@Data
public class Board {
    private int boardNo;   // BOARD_NO
    private String title;  // TITLE
    private String writer; // WRITER
    private String content;// CONTENT
}
