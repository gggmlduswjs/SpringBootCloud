package com.example.day02;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Transactional  // rollback (추가,변경, 삭제하는 것이 실제 반영되지는 않는다)
@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository repository;

//    @Test
    public  void  test(){
        List<User> list=repository.findAll();

        assertTrue(list.size()>=1);
    }

//    @Test
    public  void  test2(){
        User user=new User("t91","9999","test2");
        int result=repository.insert(user);

        assertTrue(result==1);
    }

//    @Test
    public  void test3(){

        User user  = new User();
        user.setM_id("m100");
        user.setM_pw("7777");

        int result  =repository.update(user);
        assertTrue( result==1);
    }

//    @Test
    public  void  test4() {
        String id="m100";

        int row=repository.delete(id);

        assertTrue(row==1);

    }

    //
    @Test
    public void test5(){
        List<User2> list=repository.findAllUser2();
        System.out.println(list);
        assertTrue(list.size()>=1);

    //    User2 user =list.get(0);
    //    String userid=user.getId();
     //   assertTrue(userid!=null);
    }





}