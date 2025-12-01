package com.example.day08Convert;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Controller
public class ItemController {
    // 변환, 검증

    /*
     *
     *
     *
     *
     * */

    // 요청 -> 컨트롤러 -> initBinder 동작 -> 매서드 매핑
    @InitBinder
    public  void  initBinder(WebDataBinder binder){

        log.info("initBinder ~~~");

        // 변환정보 등록
        // 날짜 데이터( 스프링 yyy/MM/dd, "문자열 -> 날짜로 변환해 줌"
        // 날짜 데이터 변환을 다르게 하고 싶으면 등록을 해줘야
        // 검증등록

        // 스프링 날짜 변환 yyyy/MM/dd => yyyy-MM-dd

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat,true));



    }
    


    //item-form
    @GetMapping("/item-form")
    //public  String itemForm( Model model){
    //     Item item = new Item();
     //    model.addAttribute("item", item);
    public  String itemForm( @ModelAttribute Item item){   // item객체가 매개변수전달되지 않으면
        
        
        
                   
                                                           // Item 객체를 생성해서 모델에 저장해줌
        return   "item-form";
    }


    //item  처리

    //사용자의 입력내용을 객체로 바인딩
    //모델에 저장까지 해줌  ( 뷰에서 모델을 사용할 수 있다)

    
    //검증하려는 객체 뒤에 작성해야함 . 필수사항
    @PostMapping("/item")
//    public  String item(@ModelAttribute(name="item") Item item ){
    public  String item(@ModelAttribute(name="item") Item item , BindingResult bindingResult){
        //item내용 확인하기
        //log사용하여 출력하기
        log.info( "item={}" ,  item);

        //변환이 문제가 있으면
        return  "item-form";
        // return  "redirect:/home";
      
    }


}
