package com.example.day08Valid;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class OrderController2 {

    //주문 화면
    @GetMapping("/order-form2")
    // public  String orderForm(@ModelAttribute(name="order") Order order){
    public  String orderForm(Model model){
        Order order= new Order();
        model.addAttribute("order",order);

        return  "order-form2";
    }

    //주문 처리
    // 사용자가 폼에서 입력한 주문정보 처리하기
    // 검증성공 ( home으로 가기)
    // 검증실패 ( 다시 입력폼으로 , BindingResult 객체 사용하기 - 오류 정보 담기(비지니스 체크하기)


    // 검증 (비지니스에 맞는 검증)
    // 검증에 실패했을 때 bindingResult 객체에 오류 정보 저장하기
    // view에서 검증 오류를 바로 th:errors로 사용 가능함
    @PostMapping("/order2")
    public String order(@ModelAttribute(name="order") Order order, BindingResult bindingResult){



        log.info("order={}",order);
        // 검증하기
        // 오류가 있으면 bindingResult에 오류 등록하기

        // 상품이름을 입력 안하면 에러발생

        // null, ''
        if(order.getName().isEmpty() || order.getName().isBlank()){
            // 입력 필수 오류

            // 에러 등록하는 방법(4개)
            // FieldError 직접 만들기
            // rejectValue 매서드는 내부적으로 FiledError
//            bindingResult.rejectValue
//                    ("name",
//                        "required",         //error 코드 생성
//                            new Object[]{"제품"} ,    // 에러 코드에 대한 에러메시지에 argument 전달
//                            "상품이름은 필수이다");      // 에러 코드에 대한 에러메시지가 없는 경우 기본 메세지 제공
        
            
            // addError() 메서드 사용해서 오류 등록하기
            // new FieldError() 생성하기
            // -기본메세지
            // -에러코드, 에러메세지
            
//            bindingResult.addError(new FieldError("order","name","상품코드를 입력하시오 field error"));
//            bindingResult.addError(
//                    new FieldError("order",
//                            "name",
//                            order.getName() ,
//                            false,
//                            new String[]{"nameError","nameError.order.name"},
//                            new Object[]{"item"},
//                            "상품 이름을 반드시 입력하시오"));


            //

//            bindingResult.rejectValue();

            bindingResult.rejectValue
                    ("name",
                        "required",         //error 코드 생성
                            new Object[]{"제품"} ,    // 에러 코드에 대한 에러메시지에 argument 전달
                            "상품이름은 필수이다");      // 에러 코드에 대한 에러메시지가 없는 경우 기본 메세지 제공

            // 가격 검증하기 ( >= 이상이여야 한다)

            if(order.getPrice() < 1000000){


                bindingResult.rejectValue("price","range", new Object[]{"1000000"} ,"기본메시지 : 1000000이어야 한다 ");

            }


            // 수량 검증하기 (1~9999) 이어야 한다
            if(order.getQty()<1 || order.getQty() >9999){
                bindingResult.rejectValue("qty","range2",new Object[]{"1", "9999"}, "수량을 확인하시오");
            }

        }


        
        // 검증하기
        // 에러가 등록된 것이 있으면
        if(bindingResult.hasErrors()){
            // 검증실패
            return "order-form2";
            
        }else {
            // 검증성공
            return "redirect:/home";
        }
        
        

    }
}
