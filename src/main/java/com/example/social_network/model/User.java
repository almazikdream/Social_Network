package com.example.social_network.model;


public class User {

    protected String name;

    // Конструктор
    public User(String name) {
        this.name = name;
    }

    //Getter
    public String getName() {
        return name;
    }

    //Метод чтобы наследники могли юзать
    public String getRole() {
        return "role";
    }
}
