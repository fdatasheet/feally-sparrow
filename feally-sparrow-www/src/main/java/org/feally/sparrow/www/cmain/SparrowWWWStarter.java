package org.feally.sparrow.www.cmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "org.feally.sparrow.www.controller" })
public class SparrowWWWStarter {

    public static void main(String[] args) {
        SpringApplication.run(SparrowWWWStarter.class, args);
    }

}
