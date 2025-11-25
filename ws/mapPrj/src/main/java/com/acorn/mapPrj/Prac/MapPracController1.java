package com.acorn.mapPrj.Prac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MapPracController1 {

    @GetMapping("/pracMap01")
    public  String map1(Model model) {

        // 모델에 position 위도, 경도정보 저장하기
        // DTO, Map

        /*
        * lat :"33.450701" ,
lng :"126.570667"
        *
        * */
        Map<String, String> position = new HashMap<>();
        position.put("lat", "37.5540643" );
        position.put("lng", "126.9205968" );

        model.addAttribute("position", position);   // 자바객체
        


        return  "pracMap01";
    }
}
