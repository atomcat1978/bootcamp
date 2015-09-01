package no.capra.bootcamp.spring.beandefinition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeandefinitionApplication {

    private static final Logger logger = LoggerFactory.getLogger(BeandefinitionApplication.class);

    public static void main(String[] args) {
        logger.debug("Starting application");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"config.xml"});
        // TODO::: Get the recently created bean(s) from the application context
        // TODO::: Verify that everything happened as planned based on the log messages
    }
}
