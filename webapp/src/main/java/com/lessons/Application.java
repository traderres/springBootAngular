package com.lessons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class Application
{
    private static final Logger logger = LoggerFactory.getLogger(Application.class);


    public static void main( String[] args ) throws Exception
    {
        logger.debug("main() started.");

        // Start up Spring Boot
        SpringApplication.run(Application.class, args);

        logger.debug("WebApp is Up.");
    }
}
