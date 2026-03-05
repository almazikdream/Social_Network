package com.example.social_network.service;

import com.example.social_network.model.*;
import org.apache.juli.logging.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class SocialNetworkService {

    private List<User> users = new ArrayList<>();
    private List<Post> posts = new ArrayList<>();

    //Функция создания блоггера
    public Blogger createBlogger(String name, PlatformType platform){
        Blogger blogger = new Blogger(name, platform);
        users.add(blogger);
        return blogger;
    }

    //Функция по созданию фолловера
    public Follower createFollower(String name){
        Follower follower = new Follower(name);
        users.add(follower);
        return follower;
    }

    //Функция создания поста
    public Post createPost(Blogger blogger, String text){
        Post post = blogger.createPost(text);
        posts.add(post);
        return post;
    }

    //Функция создания комментария
    public void addComment(Follower follower, Post post, String text){
        follower.writeComment(post, text);
    }

    public List<Post> getAllPosts(){
        return posts;
    }

    public void showRoles (List<User> users){
        users.stream().forEach(user -> {
            System.out.println(user.getRole());
        });
    }

}
