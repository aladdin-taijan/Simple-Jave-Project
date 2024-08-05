package com.example.demo;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(GreetingController.class)
public class GreetingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/greeting"))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello, World!")));
    }

    @Test
    public void greetingShouldReturnCustomMessage() throws Exception {
        this.mockMvc.perform(get("/greeting").param("name", "Jenkins"))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello, Jenkins!")));
    }
}
