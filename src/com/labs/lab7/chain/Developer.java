package com.labs.lab7.chain;

/**
 * Created on: 05/12/2017
 *
 * @author Alena Kolesnikova
 */
public class Developer extends AbstractServiceDeskEmployee {

    public Developer(Alert alertLevel) {
        this.alertLevel = alertLevel;
    }

    protected void greetClient() {
        System.out.println("Hi, developer is listening to you. Please, tell me about your problem...");
    }
}
