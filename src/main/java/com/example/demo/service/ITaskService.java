package com.example.demo.service;

import com.example.demo.model.Task;
import java.util.List;

public interface ITaskService {

        public List<Task> getData();

        public String toBinary(int number);

        public String switchDigits(int number);

        public String reverseDigits(int number);

        public String sortDescending(int number);

}
