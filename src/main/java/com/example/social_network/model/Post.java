package com.example.social_network.model;

import java.util.ArrayList;
import java.util.List;

public class Post {

    private User author;                // Полиморфизм
    private String text;                // Инкапсуляция
    private List<Comment> comments = new ArrayList<>();

    public Post(User author, String text) {
        this.author = author;
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public List<Comment> getComments() {
        return comments;
    }

    // Управление комментариями через метод (инкапсуляция)
    public void addComment(Comment comment) {
        comments.add(comment);
    }

}
