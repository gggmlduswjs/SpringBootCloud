package com.example.api.prac;

public class GoodsDTO {

    String title;
    String link;
    String lprice;
    String image;
    String mallName;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLprice() {
        return lprice;
    }

    public void setLprice(String lprice) {
        this.lprice = lprice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    @Override
    public String toString() {
        return "GoodsDTO{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", lprice='" + lprice + '\'' +
                ", image='" + image + '\'' +
                ", mallName='" + mallName + '\'' +
                '}';
    }

}
