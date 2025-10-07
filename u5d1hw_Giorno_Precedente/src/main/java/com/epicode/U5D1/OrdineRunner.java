package com.epicode.U5D1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OrdineRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(OrdineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        System.out.println("ciao");
    }
}
