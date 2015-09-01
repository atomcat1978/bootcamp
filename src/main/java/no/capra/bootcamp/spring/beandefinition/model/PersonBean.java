package no.capra.bootcamp.spring.beandefinition.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.ConstructorProperties;

/**
 * Created by tom on 01/09/15.
 */
public class PersonBean {

    private static final Logger logger = LoggerFactory.getLogger(PersonBean.class);

    private String firstName;
    private String surName;

    private Address address;

    public PersonBean(){
        logger.debug("Creating PersonBean with no-arg constructor");
    }


    @ConstructorProperties({"firstName", "surName"})
    public PersonBean(String firstName, String surName){
        logger.debug("Creating PersonBean {} {}.", firstName, surName);
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
