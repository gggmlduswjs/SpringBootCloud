package com.acorn.day01Hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapMain {

    public static void main(String[] args) {



        Map<String , List<User>> map  = new HashMap<>();


        
        //1조
        List<User> team1 = new ArrayList<>();
        team1.add( new User("acorn1" ,"윤현기" ,"010-9336-****"));
        team1.add( new User("acorn2" ,"권지언" ,"010-4699-****"));
        team1.add( new User("acorn3" ,"임형택" ,"010-9959-****"));
        team1.add( new User("acorn4" ,"이수민" ,"010-8383-****"));
        team1.add( new User("acorn5" ,"김보성" ,"010-7766-****"));

        

        //2조
        List<User> team2 = new ArrayList<>();
        team2.add( new User("acorn6" ,"정연수" ,"010-4853-****"));
        team2.add( new User("acorn7" ,"김유민" ,"010-3609-****"));
        team2.add( new User("acorn8" ,"이정호" ,"010-8940-****"));
        team2.add( new User("acorn9" ,"황예지" ,"010-3827-****"));
        team2.add( new User("acorn10" ,"김민환" ,"010-7766-****"));
        team2.add( new User("acorn11" ,"오윤석" ,"010-5344-****"));



        //3조
        List<User> team3 = new ArrayList<>();
        team3.add( new User("acorn12" ,"최지태" ,"010-2063-****"));
        team3.add( new User("acorn13" ,"박시우" ,"010-8666-****"));
        team3.add( new User("acorn14" ,"박예린" ,"010-5386-****"));
        team3.add( new User("acorn15" ,"박수경" ,"010-3272-****"));
        team3.add( new User("acorn16" ,"최하은" ,"010-7766-****"));
        team3.add( new User("acorn17" ,"이동우" ,"010-2477-****"));


        map.put("1조" ,team1);
        map.put("2조" ,team2);
        map.put("3조" ,team3);



      List<User> result  =  map.get("2조");


      System.out.println( "2조");
    result.forEach( item   ->  System.out.println( "^^" + item)   );
        //result.forEach(System.out::print);


      map.forEach( ( key, value)->{
          System.out.println( key);
       //   System.out.println( value);

          for( User user : value){
              System.out.println( user.getId());
              System.out.println( user.getName());
              System.out.println( user.getTel());
          }
      });



System.out.println("################");

      for( Map.Entry<String, List<User>>   entry :  map.entrySet()){

          System.out.println( entry.getKey());
          System.out.println( entry.getValue());

          for( User user :  entry.getValue()){
              System.out.println( user.getId());
              System.out.println( user.getName());
              System.out.println( user.getTel());
           }


      }




    }
}
