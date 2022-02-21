package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class HelloWorldModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String language;
    @Column
    private String value;

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public String getLanguage() {
        return language;
    }

    public String getValue() {
        return value;
    }
}
