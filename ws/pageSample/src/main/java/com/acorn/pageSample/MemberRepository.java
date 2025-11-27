package com.acorn.pageSample;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class MemberRepository {


	@Autowired
	SqlSession  session;



    //간편한게
    public  List<Member> selectAllTest( ){
       return   session.selectList("b.selectPageTest");
    }


	public List<Member> selectAllPage(int currentPage, int size){



		int start= (currentPage-1)*size+1;
		int end = currentPage*size;


		System.out.println("start" + start);
		System.out.println("end" + end);

		Map<String, Integer>  pageInfo  = new HashMap<>();
		pageInfo.put("start" , start);
		pageInfo.put("end" , end);


		return session.selectList( "b.selectPage" ,  pageInfo);

	}

	public int  countAll(  ){
		return session.selectOne( "b.selectCount"  );

	}


    //매서드 테스트하기
    public  List<Member>  testSelect(){
        return  session.selectList("b.testSelect");

    }


    //
    public List<Member> selectPageFinal( int currentPage,  int pageSize){   // 1  , 3

        //현재페이지  * pageSize    1 *3
        int start =  (currentPage-1)*pageSize +1 ;
        int end  = currentPage *pageSize ;

        // 1 - >      ?   1  ->3
        // 2  ->      ?   4  ->6

        // start,end
        Map<String, Integer> map = new HashMap<>();  // "start":1 ,"end" :3
        map.put("start",start);
        map.put("end",end);

        return  session.selectList("b.SelectPageFinal"  , map);

    }
}
