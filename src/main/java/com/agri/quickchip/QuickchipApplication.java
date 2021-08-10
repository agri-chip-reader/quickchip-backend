package com.agri.quickchip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"controller"})
public class QuickchipApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickchipApplication.class, args);
    }

}
