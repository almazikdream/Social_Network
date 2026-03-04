package com.example.social_network.model;

public class Comment {

    private User author;      // Полиморфизм
    private String text;      // Инкапсуляция

    public Comment(User author, String text) {
        this.author = author;
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }
}
