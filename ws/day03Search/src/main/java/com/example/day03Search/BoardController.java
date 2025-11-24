package com.example.day03Search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    BoardRepository repository;

    // 게시판 조회하기

    @GetMapping("/board")
    public  String  getBoardSearch( SearchCondition searchCondition, Model model ){

//        SearchCondition  searchCondition = new SearchCondition();
//        searchCondition.setCondition("content");
//        searchCondition.setKeyword("생성자");
        System.out.println(searchCondition);
        System.out.println(searchCondition.getCondition());
        System.out.println(searchCondition.getKeyword());
        List<Board> list  = repository.selectSearchFinal( searchCondition);

        model.addAttribute("list",  list);
        return "boardList";   //게시판 목록
    }


}
