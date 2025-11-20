package com.example.helloday01;

public class Drama {
    private String title;
    private String summary;
    private String[] actors;   // 배열로 변경
    private  String time;


    // 이미지 속성 추가
     private String image;

    public Drama(String title, String summary, String[] actors,String time ,String image)  {
        this.title = title;
        this.summary = summary;
        this.actors = actors;
        this.time = time;
        this.image=image;


    }

    public String getTitle() {
        return title;
    }


    public String getSummary() {
        return summary;
    }

    public String[] getActors() {
        return actors;
    }

    // getter/setter도 필수!
    public String getTime() {
        return time;
    }

    public String getImage() {
        return image;
    }
}
