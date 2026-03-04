package com.example.social_network.model;

import java.util.ArrayList;
import java.util.List;

public class Blogger extends User {
    private PlatformType platform;          // Инкапсуляция
    private List<Post> posts = new ArrayList<>();

    //Конструктор
    public Blogger(String name, PlatformType platform) {
        super(name);                        // Наследование (вызываем конструктор User)
        this.platform = platform;
    }

    public PlatformType getPlatform() {
        return platform;
    }

    public List<Post> getPosts() {
        return posts;
    }

    // Поведение блогера — создание поста
    public Post createPost(String text) {
        Post post = new Post(this, text);
        posts.add(post);
        return post;
    }

    @Override
    public String getRole() {
        return "Blogger";
    }

}
