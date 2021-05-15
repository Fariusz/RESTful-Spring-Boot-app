package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/data")
    public List<Task> getData(){
        return taskService.getData();
    }

    @GetMapping("/toBinary/{N}")
    public String toBinary(int N){
        if(N < 0)
            throw new IllegalArgumentException("Only non negative decimal integers!");
        else
            return taskService.toBinary(N);
    }

    @GetMapping("/switchDigits/{N}")
    public String switchDigits(int N){

        if(N < 0)
            throw new IllegalArgumentException("Only non negative decimal integers!");
        else
            return taskService.switchDigits(N);
    }

    @GetMapping("/reverseDigits/{N}")
    public String reverseDigits(int N){
        if(N < 0)
            throw new IllegalArgumentException("Only non negative decimal integers!");
        else
            return taskService.reverseDigits(N);
    }

    @GetMapping("/sortDescending/{N}")
    public String sortDescending(int N){
        if(N < 0)
            throw new IllegalArgumentException("Only non negative decimal integers!");
        else
            return taskService.sortDescending(N);
    }
}