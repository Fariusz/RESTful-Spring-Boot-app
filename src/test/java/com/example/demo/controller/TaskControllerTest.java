package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import com.example.demo.service.TaskService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.http.RequestEntity.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class TaskControllerTest {

    @Autowired
    private TaskController taskController;

    @Test
    void toBinary_True_PositiveDecimal() {
        //arrange
        int toConvert = 55;
        //act
        ResponseEntity actual = taskController.toBinary(toConvert);
        //assert
        assertEquals(ResponseEntity.ok("110111"), actual);
    }

    @Test
    void toBinary_True_NegativeDecimal() {
        //arrange
        int toConvert = -3;
        //act
        ResponseEntity actual = taskController.toBinary(toConvert);
        //assert
        assertEquals(ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Non negative decimal integers only."), actual);
    }

    @Test
    void switchDigits_True_PositiveDecimal() {
        //arrange
        int toConvert = 55;
        //act
        ResponseEntity actual = taskController.switchDigits(toConvert);
        //assert
        assertEquals(ResponseEntity.ok("10"),actual);
    }

    @Test
    void switchDigits_True_NegativeDecimal() {
        //arrange
        int toConvert = -3;
        //act
        ResponseEntity actual = taskController.switchDigits(toConvert);
        //assert
        assertEquals(ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Non negative decimal integers only."),actual);
    }

    @Test
    void reverseDigits_True_PositiveDecimal() {
        //arrange
        int toConvert = 55;
        //act
        ResponseEntity actual = taskController.reverseDigits(toConvert);
        //assert
        assertEquals(ResponseEntity.ok("3b"),actual);
    }

    @Test
    void reverseDigits_True_NegativeDecimal() {
        //arrange
        int toConvert = -3;
        //act
        ResponseEntity actual = taskController.reverseDigits(toConvert);
        //assert
        assertEquals(ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Non negative decimal integers only."), actual);
    }

    @Test
    void sortDescending_True_PositiveDecimal() {
        //arrange
        int toConvert = 55;
        //act
        ResponseEntity actual = taskController.sortDescending(toConvert);
        //assert
        assertEquals(ResponseEntity.ok("62"), actual);
    }

    @Test
    void sortDescending_True_NegativeDecimal() {
        //arrange
        int toConvert = -3;
        //act
        ResponseEntity actual = taskController.sortDescending(toConvert);
        //assert
        assertEquals(ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Non negative decimal integers only."), actual);
    }
}