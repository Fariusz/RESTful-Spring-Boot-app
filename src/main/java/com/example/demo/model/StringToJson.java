package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StringToJson {

    private String response;

    public StringToJson(String string) {
        this.response = string;
    }
}
