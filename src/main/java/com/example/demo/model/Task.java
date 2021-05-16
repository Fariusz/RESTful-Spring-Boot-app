package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Task {

    public Task() {
    }

    public Task(int input, String output, String method) {
        this.input = input;
        this.output = output;
        this.method = method;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private int input;
    private String output;
    private String method;
}