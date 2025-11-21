package com.example.day02;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    //바티스라이브러리 주입받자

    @Autowired
    SqlSession session;

    //전체회원 조회하기

    public List<User> findAll(){

        List<User> list= session.selectList("a.SelectAll");   // 매퍼정보.실행될커리id

        return  list;
    }


    //회원등록하기, 반환 반영된 row의 개수 반환

    public int insert(User user){
        return session.insert("a.insert",user);
    }

    //회원수정하기
    public int update(User user){
        return session.update("a.update",user);
    }

    //회원삭제하기

    public int delete(String id){
        int rowont =session.delete("a.delete",id);
        return  rowont;

    }


    //전체조회하기    User2로 바인딩하기
    public  List<User2>  findAllUser2(){
        return  session.selectList("a.selectAll2");
    }
}
