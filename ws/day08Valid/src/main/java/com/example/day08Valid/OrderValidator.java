package com.example.day08Valid;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


// Order객체 검증하는 객체
public class OrderValidator  implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Order.class.isAssignableFrom(clazz);  // Order와 Order상속받은 객체인지 확인하기
    }


    //위에서 supports매서드가 동작하고 결과    true  이면
    //validate() 매서드 호출하여 검증
    //검증에 실패했으면    errros 에 담기
    @Override
    public void validate(Object target, Errors errors) {

        Order order = (Order) target;  // 다운캐스팅

        //상품이름 검증하기
        if (order.getName().isEmpty() || order.getName().isBlank()) {
            errors.rejectValue
                    ("name",
                            "required",   //error 코드 생성
                            new Object[]{"제품"},  //에러코드에 대하 에러메시지에 argument전달
                            "상품이름은 필수이다");  //에러코드에 대한 에러메시지가 없는경우 기본메시지 제공


            //금액 검증하기
            if (order.getPrice() < 1000000) {
                errors.rejectValue("price", "range", new Object[]{"1000000"}, "기본메시지 : 1000000이어야 한다");
            }

            //수량검증하기 ( 1~9999)이어야 한다
            if (order.getQty() < 1 || order.getQty() > 9999) {
                errors.rejectValue("qty", "range2", new Object[]{"1", "9999"}, "수량을 확인하시오");
            }

        }

    }  // validate매서드

}  // 클래스
