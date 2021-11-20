package com.openclassrooms.helloworld;

import com.openclassrooms.helloworld.service.BusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class HelloworldApplicationTests {
    @Autowired
    private BusinessService bs;

    @Test
    void contextLoads() {
    }

    @Test
    void gettingHelloWorld(){
        assertThat(bs.getHelloWorld().getValue()).isEqualTo("Hello World");
    }

}
