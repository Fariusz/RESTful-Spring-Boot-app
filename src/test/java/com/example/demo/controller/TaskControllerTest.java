package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@SpringBootTest
@AutoConfigureMockMvc
class TaskControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void toBinary_True_PositiveDecimal() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.
                get("/toBinary/55")).
                andExpect(MockMvcResultMatchers.status().isOk()).
                andExpect(MockMvcResultMatchers.content().string("{\"response\":\"110111\"}"));
    }

    @Test
    void toBinary_True_NegativeDecimal() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.
                get("/toBinary/-3")).
                andExpect(MockMvcResultMatchers.status().isBadRequest()).
                andExpect(MockMvcResultMatchers.content().string("{\"response\":\"Non negative decimal integers only.\"}"));
    }

    @Test
    void switchDigits_True_PositiveDecimal() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.
                get("/switchDigits/55")).
                andExpect(MockMvcResultMatchers.status().isOk()).
                andExpect(MockMvcResultMatchers.content().string("{\"response\":\"10\"}"));
    }

    @Test
    void switchDigits_True_NegativeDecimal() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.
                get("/switchDigits/-3")).
                andExpect(MockMvcResultMatchers.status().isBadRequest()).
                andExpect(MockMvcResultMatchers.content().string("{\"response\":\"Non negative decimal integers only.\"}"));
    }

    @Test
    void reverseDigits_True_PositiveDecimal() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.
                get("/reverseDigits/55")).
                andExpect(MockMvcResultMatchers.status().isOk()).
                andExpect(MockMvcResultMatchers.content().string("{\"response\":\"3b\"}"));
    }

    @Test
    void reverseDigits_True_NegativeDecimal() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.
                get("/reverseDigits/-3")).
                andExpect(MockMvcResultMatchers.status().isBadRequest()).
                andExpect(MockMvcResultMatchers.content().string("{\"response\":\"Non negative decimal integers only.\"}"));
    }

    @Test
    void sortDescending_True_PositiveDecimal() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.
                get("/sortDescending/55")).
                andExpect(MockMvcResultMatchers.status().isOk()).
                andExpect(MockMvcResultMatchers.content().string("{\"response\":\"62\"}"));
    }

    @Test
    void sortDescending_True_NegativeDecimal() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.
                get("/sortDescending/-3")).
                andExpect(MockMvcResultMatchers.status().isBadRequest()).
                andExpect(MockMvcResultMatchers.content().string("{\"response\":\"Non negative decimal integers only.\"}"));
    }
}