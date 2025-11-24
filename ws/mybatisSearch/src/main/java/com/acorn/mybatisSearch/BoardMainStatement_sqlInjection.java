package com.acorn.mybatisSearch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BoardMainStatement_sqlInjection {

    // DB 정보
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:testdb";
    private static final String DB_USER = "scott";
    private static final String DB_PASSWORD = "tiger";

    public static void main(String[] args) {
       String name=" ' OR '1'='1 ";
//         String name="전희연";
         getMember(name);
    }

    public static void getMember(String name) {
        List<BoardDTO> list = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // JDBC 드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            // Statement 방식: SQL에 직접 문자열 연결

            // select * from acorntbl where name = '' or '1'='1'

            String sql = "SELECT * FROM  acorntbl  WHERE name = '"+ name +"'";

            System.out.println( sql);
            stmt = conn.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {

                System.out.print( rs.getString(1)  + "  ");
                System.out.print( rs.getString(2) + "   ");
                System.out.println( rs.getString(3));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }


    }
}
