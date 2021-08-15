package com.exec.wiki;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class WikiApplication {

    public static void main(String[] args) {
        log.info("wiki init start");
        SpringApplication.run(WikiApplication.class, args);
        log.info("wiki init success");
    }
}
