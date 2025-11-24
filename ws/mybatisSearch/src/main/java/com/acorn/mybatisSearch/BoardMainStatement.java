package com.acorn.mybatisSearch;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BoardMainStatement {

    // DB 정보
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:testdb";
    private static final String DB_USER = "scott";
    private static final String DB_PASSWORD = "tiger";

    public static void main(String[] args) {
        String keyword = "다형성"; // 검색할 제목 키워드
        String  field="content";

        List<BoardDTO> boards = getBoardListByTitle(keyword  , field);

        for (BoardDTO board : boards) {
            System.out.println(board);
        }
    }

    public static List<BoardDTO> getBoardListByTitle(String keyword, String field) {
        List<BoardDTO> list = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // JDBC 드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            // Statement 방식: SQL에 직접 문자열 연결


            // SELECT * FROM boardt WHERE   content   like  '%다형성%'   order by  board_no DESC
            String sql = "SELECT * FROM boardt WHERE " + field +" LIKE '%" + keyword + "%' ORDER BY board_no DESC";
            stmt = conn.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                BoardDTO board = new BoardDTO();
                board.setBoardNo(rs.getInt("board_no"));
                board.setTitle(rs.getString("title"));
                board.setContent(rs.getString("content"));
                board.setWriter(rs.getString("writer"));
                list.add(board);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }

        return list;
    }
}
