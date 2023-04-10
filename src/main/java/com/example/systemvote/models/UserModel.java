package com.example.systemvote.models;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="user_vote")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserModel {
    @Id
    @GeneratedValue()
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "ihn")
    private String ihn;

    @Column(name = "status")
    private String status;

    public UserModel(Long id, String name, String surname, String ihn, String status) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.ihn = ihn;
        this.status = status;
    }

    public UserModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIhn() {
        return ihn;
    }

    public void setIhn(String ihn) {
        this.ihn = ihn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
