package com.example.retrodeneme;

import com.google.gson.annotations.SerializedName;

public class Post {
    private  String name;
    private  String password;
    private  String email;
    @SerializedName("body")
    private String text;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getText() {
        return text;
    }
}
