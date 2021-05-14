package com.example.demo.controller;

import com.example.demo.service.NumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NumberController {

    private final NumberService numberService;

    @GetMapping("/tobinary/{int}")
    public String toBinary(int number){

        return numberService.toBinary(number);
    }

    @GetMapping("/switchdigits/{int}")
    public String switchDigits(int number){
        return numberService.switchDigits(number);
    }

    @GetMapping("/reversedigits/{int}")
    public String reverseDigits(int number){
        return numberService.reverseDigits(number);
    }

    @GetMapping("/sortdescending/{int}")
    public String sortDescending(int number){
        return numberService.sortDescending(number);
    }
}
