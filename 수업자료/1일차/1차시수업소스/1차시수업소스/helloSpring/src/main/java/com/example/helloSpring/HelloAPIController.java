package com.example.helloSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HelloAPIController {

    @GetMapping("/helloNameData")
    @ResponseBody
    public List<String> helloPrintName() {

        List<String> list  = new ArrayList<>();

        list.add("김민희: 오늘도 힘내요~ 🌸");
        list.add("김서호: 웃는 하루 보내요! 😆");
        list.add("김현희: 햇살처럼 밝게 빛나요 ☀️");
        list.add("박두식: 파이팅! 오늘도 화이팅! 💖");
        list.add("박성욱: 귀여운 당신, 오늘도 최고! 🐰");
        list.add("손민영: 하트 가득 하루 보내요 💕");
        list.add("우동훈: 오늘도 즐겁게 달려봅시다! 🎵");
        list.add("유승재: 웃음 폭탄 준비 완료! 😂");
        list.add("윤태민: 힘내요! 꿀잠도 잊지 말아요 💤");
        list.add("이대훈: 오늘 하루도 반짝반짝 ✨");
        list.add("이동규: 파워풀하게 달려요! 💪");
        list.add("이성빈: 포근하게, 기분 좋게! ☁️");
        list.add("이혜린: 오늘도 귀엽게 화이팅! 🌷");
        list.add("전희연: 미소 가득 하루 보내요 😍");
        list.add("정지원: 하하하 웃음 가득! 😄");
        list.add("최성원: 햇살 같은 당신, 화이팅! 🌞");
        list.add("최정문: 오늘도 사랑스러운 하루 되세요! 🐱");




        return list;   // 자동으로 JSON 변환됨
    }

    //
}
