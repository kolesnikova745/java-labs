package com.labs.lab7.chain;

/**
 * Created on: 05/12/2017
 *
 * @author Anna Kolesnikova
 */
public class ChiefTechnologyOfficer extends AbstractServiceDeskEmployee {

    public ChiefTechnologyOfficer(Alert alertLevel) {
        this.alertLevel = alertLevel;
    }

    protected void greetClient() {
        System.out.println("Hi, chief technology officer is listening to you. Please, tell me about your problem...");
    }
}
