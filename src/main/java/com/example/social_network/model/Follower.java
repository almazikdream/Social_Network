package com.example.social_network.model;

public class Follower extends User {

    //Конструктор, пишу super тем самым вызывая родительский класс для того передать ему значение
    public Follower(String name) {
        super(name);
    }

    // Поведение фоловера — написание комментария
    public Comment writeComment(Post post, String text) {
        Comment comment = new Comment(this, text);
        post.addComment(comment);
        return comment;
    }

    @Override
    public String getRole() {
        return "Follower";
    }
}
