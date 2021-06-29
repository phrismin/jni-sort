package com.example.jnisort;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Title API", version = "2.0", description = "Sorting of array"))
public class JniSortApplication {

    public static void main(String[] args) {
        SpringApplication.run(JniSortApplication.class, args);
    }

}
