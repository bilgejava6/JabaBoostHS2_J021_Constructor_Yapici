package com.muhammet;

import com.muhammet.entity.Post;

public class PostRunner {
    public static void main(String[] args) {
        Post post = new Post();
        post.userName = "demet";
        post.comment = "This is a comment";
        post.imageUrl = "guzel-doga.jpg";
        post.print();


        Post post2 = new Post("muhammet","bugün hava kapalı","resim.png");
        post2.print();



    }
}
