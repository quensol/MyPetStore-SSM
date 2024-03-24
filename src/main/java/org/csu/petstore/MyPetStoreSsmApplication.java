package org.csu.petstore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.csu.petstore.persistence")
public class MyPetStoreSsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyPetStoreSsmApplication.class, args);
    }

}
