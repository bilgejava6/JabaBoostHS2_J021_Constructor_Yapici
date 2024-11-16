package com.muhammet.entity;

import java.util.Random;

public class Post {
    public Long id;
    public String userName;
    public String comment;
    public String imageUrl;
    public int likeCount;

    public Post(){

    }

    public Post(String pUserName, String pComment, String pImageUrl){
        id = new Random().nextLong(1,9999);
        userName = pUserName;
        comment = pComment;
        imageUrl = pImageUrl;
        likeCount = 0;
    }

    public void print(){
        System.out.println("""
                ****** POST BİLGİLERİ *******
                """);
        System.out.println("id.........: "+ id);
        System.out.println("userName...: "+ userName);
        System.out.println("comment....: "+ comment);
        System.out.println("image......: "+ imageUrl);
        System.out.println("like.......: "+ likeCount);

    }
}
