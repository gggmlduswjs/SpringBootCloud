package com.example.api.prac;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GoodsApiController {

    @Autowired
    NaverShopService service;


    // 매서드
    @GetMapping("/naverShopList")
    public String getNaverShop(Model model) {
        //

        List<GoodsDTO> list = service.getNaverShopList();
        model.addAttribute("list",list);


        return "navershopList";
    }
}
