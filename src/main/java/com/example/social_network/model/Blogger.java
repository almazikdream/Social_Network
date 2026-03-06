package com.example.social_network.model;

import java.util.ArrayList;
import java.util.List;

public class Blogger implements User {

    private String name;               // Поле переехало сюда
    private PlatformType platform;
    private List<Post> posts = new ArrayList<>();

    //Конструктор
    public Blogger(String name, PlatformType platform) {
        this.name = name;
        this.platform = platform;
    }

    @Override
    public String getName() {          // Реализуем метод интерфейса
        return name;
    }

    @Override
    public String getRole() {          // Переопределяем роль специально для блогера
        return "Blogger";
    }

    public PlatformType getPlatform() {
        return platform;
    }

    public Post createPost(String text) {
        Post post = new Post(this, text);
        posts.add(post);
        return post;
    }

}
//composition enharitance
