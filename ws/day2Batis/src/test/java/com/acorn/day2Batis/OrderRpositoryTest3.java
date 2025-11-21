package com.acorn.day2Batis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class OrderRpositoryTest3 {


    @Autowired
    OrderRpository  repository;


    @Test
    public void test(){
        int size = repository.selectAll().size();
        assertTrue(  size >=1);

    }

}

/*


Preparing: SELECT * FROM tbl_test_order o JOIN tbl_test_customer m ON o.id = m.id
==> Parameters:
<==    Columns: OCODE, ODATE, ID, PCODE, SALE_CNT, ID, NAME, ADDRESS, TEL
<==        Row: J001, 2021-01-10 00:00:00, H001, P001, 2, H001, 이대훈, 라스베가스, 010-3030-2222
<==        Row: J002, 2021-01-10 00:00:00, H002, P002, 5, H002, 유승재, L.A, 010-2424-2222
<==        Row: J003, 2021-01-10 00:00:00, H003, P003, 2, H003, 최성원, 워싱턴D.C, 010-1010-2121
<==        Row: J004, 2021-01-10 00:00:00, H004, P004, 1, H004, 정지원, 뉴욕, 010-3333-2222
<==        Row: J005, 2021-01-10 00:00:00, H005, P002, 3, H005, 전희연, 텍사스, 010-9090-2222
<==        Row: J006, 2021-01-10 00:00:00, H001, P002, 3, H001, 이대훈, 라스베가스, 010-3030-2222
<==        Row: J007, 2021-01-10 00:00:00, H002, P001, 1, H002, 유승재, L.A, 010-2424-2222
<==        Row: J008, 2021-01-10 00:00:00, H001, P002, 4, H001, 이대훈, 라스베가스, 010-3030-2222
<==      Total: 8
 */