package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Task {
    @Id
    private long id;
    private int input;
    private String output;
    private String method;
}