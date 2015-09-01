package no.capra.bootcamp.spring.beandefinition.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by tom on 01/09/15.
 */
public class XMLParser implements Parser {

    private static final Logger logger = LoggerFactory.getLogger(XMLParser.class);

    public XMLParser(){
        logger.debug("XMLParser was created.");
    }

    @Override
    public int parse(String data) {
        // TODO::: Implement!
        return 0;
    }
}
