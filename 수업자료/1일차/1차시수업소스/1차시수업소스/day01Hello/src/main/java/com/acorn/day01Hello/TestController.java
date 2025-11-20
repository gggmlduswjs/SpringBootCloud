package com.acorn.day01Hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {


    @GetMapping("/list")
    public String getMembers( Model model){
        List<Member> list = new ArrayList<>();
        list.add( new Member("acorn01", "00", "윤현기"));
        list.add( new Member("acorn01", "01", "권지언"));
        list.add( new Member("acorn01", "02", "임형택"));
        list.add( new Member("acorn01", "03", "이수민"));
        list.add( new Member("acorn01", "04", "김보성"));

        model.addAttribute("list", list);
        return "memberList";
    }


    @GetMapping("/list2")
    public String getMembers2( Model model){
        List<Member> list = new ArrayList<>();
        list.add( new Member("acorn01", "00", "윤현기"));
        list.add( new Member("acorn01", "01", "권지언"));
        list.add( new Member("acorn01", "02", "임형택"));
        list.add( new Member("acorn01", "03", "이수민"));
        list.add( new Member("acorn01", "04", "김보성"));


        List<Member> list2 = new ArrayList<>();
        list2.add( new Member("acorn01", "00", "정연수"));
        list2.add( new Member("acorn01", "01", "김유민"));
        list2.add( new Member("acorn01", "02", "김민환"));
        list2.add( new Member("acorn01", "03", "이정호"));
        list2.add( new Member("acorn01", "04", "황예지"));
        list2.add( new Member("acorn01", "04", "오윤석"));


        List<Member> list3 = new ArrayList<>();
        list3.add( new Member("acorn01", "00", "최지태"));
        list3.add( new Member("acorn01", "01", "박시우"));
        list3.add( new Member("acorn01", "02", "박예린"));
        list3.add( new Member("acorn01", "03", "박수경"));
        list3.add( new Member("acorn01", "04", "최하은"));
        list3.add( new Member("acorn01", "04", "이동우"));

        Map<String, List<Member> > map = new HashMap<>();

        map.put("1" , list);
        map.put("2" , list2);
        map.put("3" , list3);
        model.addAttribute("map", map);
        return "test";
    }
}
