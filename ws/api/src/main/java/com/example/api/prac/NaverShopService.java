package com.example.api.prac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NaverShopService {



    @Autowired
    ApiExam2SearchBlog1125 api;

    public List<GoodsDTO> getNaverShopList(){
        String result= api.gateData();
        List<GoodsDTO> list=api.parseItem(result);
        return list;
    }
}
