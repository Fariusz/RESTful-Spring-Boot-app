package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {

    @Autowired
    private final TaskService taskService;

    @GetMapping(value = "/")
    public String helloWorld(){
        return taskService.helloWorld();
    }

    @GetMapping(value = "/data")
    public List<Task> getData(){
        return taskService.getData();
    }

    @GetMapping("/toBinary/{N}")
    public ResponseEntity toBinary(int N){
        if(N < 0)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Non negative decimal integers only.");
        else
            return ResponseEntity.ok(taskService.toBinary(N));
    }

    @GetMapping("/switchDigits/{N}")
    public ResponseEntity switchDigits(int N){
        if(N < 0)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Non negative decimal integers only.");
        else
            return ResponseEntity.ok(taskService.switchDigits(N));
    }

    @GetMapping("/reverseDigits/{N}")
    public ResponseEntity reverseDigits(int N){
        if(N < 0)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Non negative decimal integers only.");
        else
            return ResponseEntity.ok(taskService.reverseDigits(N));
    }

    @GetMapping("/sortDescending/{N}")
    public ResponseEntity sortDescending(int N){
        if(N < 0)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Non negative decimal integers only.");
        else
            return ResponseEntity.ok(taskService.sortDescending(N));
    }
}