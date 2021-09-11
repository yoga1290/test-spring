package com.example.demo.controllers;
import static org.assertj.core.api.Assertions.assertThat;

import com.example.demo.services.BreedService;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


//
//@SpringBootTest
//public class BreedControllerTest {
//
//    @Autowired
//    private BreedController controller;
//
//    @Test
//    public void contextLoads() throws Exception {
//        assertThat(controller).isNotNull();
//    }
//}

@WebMvcTest
public class BreedControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private BreedService breedService;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString( breedService.list().getMessage() )));
    }
}