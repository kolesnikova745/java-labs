package com.labs.lab7.facade;

/**
 * Created on: 05/12/2017
 *
 * @author Anna Kolesnikova
 */
public class StyleMaker {
    private StyleItem hair;
    private StyleItem makeup;
    private StyleItem clothes;
    private StyleItem accessories;

    public StyleMaker() {
        hair = new Hair();
        makeup = new Makeup();
        clothes = new Clothes();
        accessories = new Accessories();
    }

    public void createStylishLook() {
        hair.setStyleItem();
        makeup.setStyleItem();
        clothes.setStyleItem();
        accessories.setStyleItem();
    }
}
