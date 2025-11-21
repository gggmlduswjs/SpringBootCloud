package com.example.day02;

// 컬럼명과 속성명을 다르게 설정하기
// 결과를 받아오지 못함(null)
// resultMap 작성하기


public class User2 {

    String id;
    String pw;
    String name;

    public User2() {
    }

    public User2(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User2{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
