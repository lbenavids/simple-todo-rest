package com.clevertigroup.simpletodorest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class SimpleTodoRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleTodoRestApplication.class, args);
    }

}
