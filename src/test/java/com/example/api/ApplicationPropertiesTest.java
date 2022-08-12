package com.example.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest(classes = ApplicationPropertiesTest.TestApplication.class)
public class ApplicationPropertiesTest {

    @Autowired
    private Environment environment;

    @Test
    void testApplicationProperties(){
        String applicationName = environment.getProperty("application.name");
        Assertions.assertEquals("Demo Api", applicationName);

        String url = environment.getProperty("spring.datasource.url");
        Assertions.assertEquals("jdbc:mysql://localhost:3306/demoapi?useSSL=false", url);

        String username = environment.getProperty("spring.datasource.username");
        Assertions.assertEquals("root", username);

        String password = environment.getProperty("spring.datasource.password");
        Assertions.assertEquals("", password);
    }

    @SpringBootApplication
    public static class TestApplication{

    }
}
