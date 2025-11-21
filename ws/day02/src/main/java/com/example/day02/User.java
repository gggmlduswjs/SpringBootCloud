package com.example.day02;

// 3개 속성
// 테이블 컬럼과 같게 하기
public class User {

    String m_id;
    String m_pw;
    String m_name;

    public User(String m_id, String m_pw, String m_name) {
        this.m_id = m_id;
        this.m_pw = m_pw;
        this.m_name = m_name;
    }

    public User() {
    }

    public String getM_id() {
        return m_id;
    }

    public void setM_id(String m_id) {
        this.m_id = m_id;
    }

    public String getM_pw() {
        return m_pw;
    }

    public void setM_pw(String m_pw) {
        this.m_pw = m_pw;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    @Override
    public String toString() {
        return "User{" +
                "m_id='" + m_id + '\'' +
                ", m_pw='" + m_pw + '\'' +
                ", m_name='" + m_name + '\'' +
                '}';
    }
}
