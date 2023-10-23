package org.example;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyAPiController {
    @GetMapping(path = "/", produces= MediaType.APPLICATION_JSON_VALUE)
    String home() {
        return returnJSON("Chela");
    }
    @GetMapping(path ="/answer/{input}", produces=MediaType.APPLICATION_JSON_VALUE)
    String math(@PathVariable String input) {
        String Answer=String.valueOf( Integer.valueOf(input)+9);
        return returnJSON(Answer);
    }
    public static void main(String[] args) {
        SpringApplication.run(MyAPiController.class, args);
    }

    public String returnJSON(String result){

        return result;
    }

}

