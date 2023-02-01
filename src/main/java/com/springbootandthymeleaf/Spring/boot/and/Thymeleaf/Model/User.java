package com.springbootandthymeleaf.Spring.boot.and.Thymeleaf.Model;

public class User {

    private String password;
    private String email;

    public User(){    }
    public User(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
