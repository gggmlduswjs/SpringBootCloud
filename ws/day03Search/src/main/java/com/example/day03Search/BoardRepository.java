package com.example.day03Search;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardRepository {

    @Autowired
    SqlSession session;

//
    public List<Board> selectAll() {
        return session.selectList("a.selectAll");
    }

    public List<Board> selectSearch() {
        return session.selectList("a.selectSearch");
    }

    public List<Board> selectSearchTest(String search) {
        return session.selectList("a.selectSearchTest", search);
    }

    public List<Board> selectSearchFinal(SearchCondition searchCondition) {
        return session.selectList("b.selectSearchCondition", searchCondition);
    }




}
