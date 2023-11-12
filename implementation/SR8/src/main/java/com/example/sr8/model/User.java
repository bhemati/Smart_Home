package com.example.sr8.model;

public class User {

    int id;
    String Email;
    String Password;
    String Token;
    roles role;
    userID user_ID;

    public userID getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(userID user_ID) {
        this.user_ID = user_ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public roles getRole() {
        return role;
    }

    public void setRole(roles role) {
        this.role = role;
    }
}
