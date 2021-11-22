package com.openclassrooms.helloworld;

import com.openclassrooms.helloworld.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication implements CommandLineRunner {

   
    private BusinessService bs;
    @Autowired
    public HelloworldApplication(BusinessService bs){
        this.bs = bs;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       System.out.println(bs.getHelloWorld());
    }

}
