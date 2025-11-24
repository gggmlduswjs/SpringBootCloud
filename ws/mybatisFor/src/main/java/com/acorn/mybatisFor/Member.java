package com.acorn.mybatisFor;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Member {

    String id;
    String name;
    String email;

}


/*




CREATE TABLE membertbl (
    id   varchar2(10) primary key  ,
    name VARCHAR2(50),
    email VARCHAR2(50)
);

insert into membertbl values('acorn','손민영','aaa@naver.com');
insert into membertbl values('acorn3','우동훈','bbb@goole.com');
insert into membertbl values('acorn4','이혜린','ccc@naver.com');
commit;




 */