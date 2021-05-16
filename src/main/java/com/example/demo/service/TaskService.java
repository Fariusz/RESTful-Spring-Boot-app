package com.example.demo.service;

import com.example.demo.model.Method;
import com.example.demo.model.Task;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.*;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public List<Task> getData(){
        return taskRepository.findAll();
    }

    public String toBinary(int number){
        String result = toBinaryString(number);
        Task task = new Task(number, result, "toBinary");
        taskRepository.save(task);
        return result;
    }

    public String switchDigits(int number){
        String invertedBinary = toBinaryString(number).replace('0', 'x').replace('1', '0').replace('x', '1');
        String result = toOctalString(parseInt(invertedBinary, 2));
        Task task = new Task(number, result, "switchDigits");
        taskRepository.save(task);
        return result;
    }

    public String reverseDigits(int number){

        byte[] binaryNumberArray = toBinaryString(number).getBytes();
        byte[] reversedNumberArray = new byte[binaryNumberArray.length];

        for (int i = 0; i < binaryNumberArray.length; i++) {
            reversedNumberArray[i] = binaryNumberArray[binaryNumberArray.length - i - 1];
        }

        String reversedNumber = new String(reversedNumberArray);
        String result = toHexString(Integer.parseInt(reversedNumber, 2));
        Task task = new Task(number, result, "reverseDigits");
        taskRepository.save(task);
        return result;
    }

    public String sortDescending(int number) {
        byte[] numberArray = toBinaryString(number).getBytes();
        Arrays.sort(numberArray);

        for (int left = 0, right = numberArray.length - 1; left < right; left++, right--) {
            byte temp = numberArray[left];
            numberArray[left] = numberArray[right];
            numberArray[right] = temp;
        }

        String temp = new String(numberArray);
        int decimal = Integer.parseInt(temp, 2);

        String result = String.valueOf(decimal);
        Task task = new Task(number, result, "sortDescending");
        taskRepository.save(task);
        return result;
    }
}