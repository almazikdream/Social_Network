package com.example.social_network.model;

public class Follower implements User {

    private String name;


    public Follower(String name) {
        this.name = name;
    }

    // Реализуем метод из интерфейса User
    @Override
    public String getName() {
        return name;
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
