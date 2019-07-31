package com.example.springboot;

import com.example.springboot.util.CmdbProperties;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootexampleApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringbootexampleApplication.class);
    @Autowired
    public CmdbProperties cmdbProperties;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootexampleApplication.class, args);
        System.out.println("com.example.SPRINGBOOTEXAMPLE.SpringbootexampleApplication.main()");
        System.out.println("" + ClassLoader.getSystemClassLoader().getParent().getClass().getName());
    }

    @PostConstruct
    public void init() {
        logger.info(cmdbProperties.toString());
    }
}
