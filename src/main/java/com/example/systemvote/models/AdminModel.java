package com.example.systemvote.models;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="admin_vote")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdminModel {
    @Id
    @GeneratedValue()
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    public AdminModel(Long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public AdminModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
