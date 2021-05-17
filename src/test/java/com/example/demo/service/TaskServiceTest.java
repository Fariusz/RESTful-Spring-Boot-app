package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskServiceTest {

    @Autowired
    private TaskService taskService;

    @Test
    void toBinary_True_PositiveDecimal() {
        //arrange
        int toConvert = 55;
        //act
        String actual = taskService.toBinary(toConvert);
        //assert
        assertEquals("110111", actual);
    }

    @Test
    void switchDigits_True_PositiveDecimal() {
        //arrange
        int toConvert = 55;
        //act
        String actual = taskService.switchDigits(toConvert);
        //assert
        assertEquals("10", actual);
    }

    @Test
    void reverseDigits_True_PositiveDecimal() {
        //arrange
        int toConvert = 55;
        //act
        String actual = taskService.reverseDigits(toConvert);
        //assert
        assertEquals("3b", actual);
    }

    @Test
    void sortDescending_True_PositiveDecimal() {
        //arrange
        int toConvert = 55;
        //act
        String actual = taskService.sortDescending(toConvert);
        //assert
        assertEquals("62", actual);
    }
}