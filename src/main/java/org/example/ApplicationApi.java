package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "org.example")
public class ApplicationApi {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationApi.class, args);
    }

}