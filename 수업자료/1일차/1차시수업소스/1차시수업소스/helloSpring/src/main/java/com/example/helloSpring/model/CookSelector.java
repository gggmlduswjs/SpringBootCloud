package com.example.helloSpring.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CookSelector {

    // 오늘의 요리사 반환 메서드
    public   Cook getTodayCook() {
        // Cook형을 담을 수 있는 ArrayList 준비
        List<Cook> list = new ArrayList<>();
        list.add(new HoonCook("이대훈"));
        list.add(new koreaTopChef("정지원"));
        list.add(new SampleCook_박두식("박두식"));
        list.add(new SampleCook5_전희연("전희연"));
        list.add(new SampleSJCook("유승재"));
        list.add(new SampleCookSMY("손민영"));
        list.add(new SampleCookPSW("박성욱"));
        list.add(new SampleCook5_Hyerin("이혜린"));
        list.add(new SampleMHCook("김민희"));
        list.add(new SungbinCook("이성빈"));
        list.add(new SampleCookGYU("이동규"));
        list.add(new 최성원("최성원"));
        list.add(new SampleCook5_최정문("최정문"));
        list.add(new SampleCook_윤태민("윤태민"));
        list.add(new 김서호요리사("김서호"));
        //김현희

        // 요리사별 ArrayList 준비
        List<한식가능한> 한식요리사 = new ArrayList<>();
        List<중식가능한> 중식요리사 = new ArrayList<>();
        List<일식가능한> 일식요리사 = new ArrayList<>();

        // 요리사 종류별로 분류
        for (Cook cook : list) {
            if (cook instanceof 한식가능한) {
                한식요리사.add((한식가능한) cook);
            } else if (cook instanceof 중식가능한) {
                중식요리사.add((중식가능한) cook);
            } else if (cook instanceof 일식가능한) {
                일식요리사.add((일식가능한) cook);
            }
        }

        // 랜덤하게 요리사 종류 선택
        String[] kinds = { "한식가능한", "중식가능한", "일식가능한" };
        int randomKindIndex = (int) (Math.random() * kinds.length);
        String selectedKind = kinds[randomKindIndex];

        List<?> selectedList;
        switch (selectedKind) {
            case "한식가능한":
                selectedList = 한식요리사;
                break;
            case "중식가능한":
                selectedList = 중식요리사;
                break;
            case "일식가능한":
                selectedList = 일식요리사;
                break;
            default:
                selectedList = 한식요리사; // 기본값
        }

        // 랜덤하게 요리사 한 명 선택
        int randomIndex = (int) (Math.random() * selectedList.size());
        return (Cook) selectedList.get(randomIndex);
    }

    // 테스트용 main
    public static void main(String[] args) {
        Cook todayCook =   new CookSelector().getTodayCook();
        System.out.println("==== 오늘의 요리사 ====");
        System.out.println(todayCook);
    }
}
