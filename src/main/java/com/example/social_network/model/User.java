package com.example.social_network.model;


public abstract class User {

    protected String name;

    // Конструктор
    public User(String name) {
        this.name = name;
    }

    //Getter
    public String getName() {
        return name;
    }

    //Метод чтобы наследники могли язать
    public abstract String getRole();
}
