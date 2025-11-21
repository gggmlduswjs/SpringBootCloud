package com.example.batis;
;



public class User {

    private String M_ID;
    private String M_PW;
    private String M_NAME;

    public String getId() {
        return M_ID;
    }

    public String getPw() {
        return M_PW;
    }

    public String getName() {
        return M_NAME;
    }

    public void setId(String id) {
        this.M_ID = id;
    }

    public void setPw(String pw) {
        this.M_PW = pw;
    }

    public void setName(String name) {
        this.M_NAME = name;
    }
}
