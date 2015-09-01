package no.capra.bootcamp.spring.beandefinition.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * Created by tom on 01/09/15.
 */

// TODO::: Tests missing, implement at least one unit-test!

public class ParserFactory {

    public enum Format{
        XML,
        JSON
    }

    private static final Logger logger = LoggerFactory.getLogger(ParserFactory.class);

    private static ParserFactory instance;

    private ParserFactory(){
        logger.debug("ParserFactory instance created.");
    }

    public Optional<Parser> createParser(Format format){
        logger.debug("Creating parser for format {}.", format);
        switch(format){
            case JSON:
                return Optional.of(new JsonParser());
            case XML:
                return Optional.of(new XMLParser());
            default:
                return Optional.empty();
        }
    }

    public ParserFactory getInstance(){
        logger.debug("Getting ParserFactory instance.");
        return instance;
    }

    static {
        instance = new ParserFactory();
    }

}
