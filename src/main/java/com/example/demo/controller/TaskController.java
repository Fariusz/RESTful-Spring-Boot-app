package com.example.demo.controller;

import com.example.demo.model.StringToJson;
import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {

    @Autowired
    private final TaskService taskService;

    @GetMapping(value = "/data")
    public List<Task> getData(){
        return taskService.getData();
    }

    @GetMapping("/toBinary/{N}")
    public ResponseEntity toBinary(@PathVariable("N") int N){
        if(N < 0)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new StringToJson("Non negative decimal integers only."));
        else
            return ResponseEntity.ok(new StringToJson(taskService.toBinary(N)));
    }

    @GetMapping("/switchDigits/{N}")
    public ResponseEntity switchDigits(@PathVariable("N") int N){
        if(N < 0)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new StringToJson("Non negative decimal integers only."));
        else
            return ResponseEntity.ok(new StringToJson(taskService.switchDigits(N)));
    }

    @GetMapping("/reverseDigits/{N}")
    public ResponseEntity reverseDigits(@PathVariable("N") int N){
        if(N < 0)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new StringToJson("Non negative decimal integers only."));
        else
            return ResponseEntity.ok(new StringToJson(taskService.reverseDigits(N).toString()));
    }

    @GetMapping("/sortDescending/{N}")
    public ResponseEntity sortDescending(@PathVariable("N") int N){
        if(N < 0)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new StringToJson("Non negative decimal integers only."));
        else
            return ResponseEntity.ok(new StringToJson(taskService.sortDescending(N)));
    }
}