package com.example.social_network.model;


public interface User {

    String getName();

    default String getRole() {
        return "REGULAR_USER";
    }
}
