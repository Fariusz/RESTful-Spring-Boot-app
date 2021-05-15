package com.example.demo.service;

import com.example.demo.model.Task;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.TaskRepository;
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
        return toBinaryString(number);
    }

    public String switchDigits(int number){
        String invertedBinary = toBinaryString(number).replace('0', 'x').replace('1', '0').replace('x', '1');
        return toOctalString(parseInt(invertedBinary, 2));
    }

    public String reverseDigits(int number){
        byte[] binaryNumberArray = toBinaryString(number).getBytes();
        byte[] reversedNumberArray = new byte[binaryNumberArray.length];

        for (int i = 0; i < binaryNumberArray.length; i++) {
            reversedNumberArray[i] = binaryNumberArray[binaryNumberArray.length - i - 1];
        }

        String reversedNumber = new String(reversedNumberArray);
        return toHexString(Integer.parseInt(reversedNumber, 2));
    }

    public String sortDescending(int number) {
        byte[] numberArray = toBinaryString(number).getBytes();
        Arrays.sort(numberArray);

        for (int left = 0, right = numberArray.length - 1; left < right; left++, right--) {
            byte temp = numberArray[left];
            numberArray[left] = numberArray[right];
            numberArray[right] = temp;
        }

        String result = new String(numberArray);
        int decimal = Integer.parseInt(result, 2);
        return String.valueOf(decimal);
    }
}