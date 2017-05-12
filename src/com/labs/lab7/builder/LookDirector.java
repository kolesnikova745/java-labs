package com.labs.lab7.builder;

/**
 * Created on: 05/12/2017
 *
 * @author Anna Kolesnikova
 */
public class LookDirector {
    private LookBuilder lookBuilder;

    public LookDirector(LookBuilder lookBuilder) {
        this.lookBuilder = lookBuilder;
    }

    public void createLook() {
        lookBuilder.setHat();
        lookBuilder.setDress();
        lookBuilder.setShirt();
        lookBuilder.setJeans();
        lookBuilder.setShoes();
    }

    public Look getLook() {
        return lookBuilder.build();
    }
}
