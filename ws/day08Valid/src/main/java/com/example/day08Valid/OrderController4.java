package com.example.day08Valid;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class OrderController4 {
    

    //valiator등록하기
    // 0) Validator객체, 검증객체 만들기    //
    // 1)controller 단위 validator 등록
    // 2)검증하고 싶은 객체앞에다 @Validated 붙이기






    //주문화면




    @GetMapping("/order-form4")
    //ublic  String orderForm( @ModelAttribute(name="order") Order order ){
    public  String orderForm( Model model ){
        Order order =new Order();
        model.addAttribute("order" , order);
        return "order-form4";
    }
     
    
    //주문처리
    //사용자가 폼에서 입력한 주문정보를 처리하기 
    //검증성공 ( home 으로 가기)
    //검증실패 (다시 입력폼으로 , BindingResult 객체 사용하기 -오류정보 담기(비즈니스 체크하기) )


    //검증 ( 비지니스에 맞는 검증)
    // 검증에 실패했을 때 bindingResult객체에 오류정보 저장하기
    // view에서 검증오류를 바로 th:errors로 사용가능함
    
    @PostMapping("/order4")
    public  String  order(@ModelAttribute(name ="order") @Validated Order order  , BindingResult bindingResult){

        log.info("order={}" , order);

        //검증로직 별도로 분리하기   OrderValidator 만들기 ( Validator 구현하기)

        //검증하기
        //에러가 등록된것이 있으면
        if(bindingResult.hasErrors())  {
            //검증실패
            return  "order-form4";
             
        }else{
            //검증성공
            return  "redirect:/home";
        }


    }
}
