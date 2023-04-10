package com.example.systemvote.models;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "candidates_vote")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CandidatesModel {
    @Id
    @GeneratedValue()
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "count")
    private Long count;

    public CandidatesModel(Long id, String name, String surname, Long count) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.count = count;
    }

    public CandidatesModel() {
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

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
