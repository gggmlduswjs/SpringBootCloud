package com.example.day08Valid;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class OrderController {

    //주문 화면
    @GetMapping("/order-form")
    // public  String orderForm(@ModelAttribute(name="order") Order order){
    public  String orderForm(Model model){
        Order order= new Order();
        model.addAttribute("order",order);

        return  "order-form";
    }

    //주문 처리
    // 사용자가 폼에서 입력한 주문정보 처리하기
    // 검증성공 ( home으로 가기)
    // 검증실패 ( 다시 입력폼으로 , BindingResult 객체 사용하기 - 오류 정보 담기(비지니스 체크하기)
    
    
    // 검증 (비지니스에 맞는 검증)
    // 검증에 실패했을 때 bindingResult 객체에 오류 정보 저장하기
    // view에서 검증 오류를 바로 th:errors로 사용 가능함
    @PostMapping("/order")
    public String order(@ModelAttribute(name="order") Order order){

        
        
        log.info("order={}",order);
        // 검증하기
        // 오류가 있으면 bindingResult에 오류 등록하기


        

        
        
        
        
        return "order-form";
    }
}
