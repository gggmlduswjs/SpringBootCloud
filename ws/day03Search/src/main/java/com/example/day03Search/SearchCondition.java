package com.example.day03Search;

import lombok.Data;

@Data
public class SearchCondition {

    String condition;   // title, write, content
    String keyword;     // 검색어 다향성, 작성자, 제목의 내용이나 컨텐츠의 내용


}
