package org.launchcode.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class User {
    @NotEmpty(message = "username is required")
    @Size(min=5, max=15, message= "username must be between 5 and 15 char")
    private String username;


    @Email(message = "invaild email format")
    private String email;

    @NotEmpty(message = "password is required")
    @Size(min= 6, message= "password must be at least 6 char")
    private String password;


    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

