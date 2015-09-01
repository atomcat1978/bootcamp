package no.capra.bootcamp.spring.beandefinition.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by tom on 01/09/15.
 */
public class JsonParser implements Parser {

    private static final Logger logger = LoggerFactory.getLogger(JsonParser.class);

    public JsonParser(){
        logger.debug("JsonParser was created.");
    }

    @Override
    public int parse(String data) {
        return 0;
    }

}
