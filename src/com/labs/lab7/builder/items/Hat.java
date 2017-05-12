package com.labs.lab7.builder.items;

import com.labs.lab7.builder.Item;

/**
 * Created on: 05/12/2017
 *
 * @author Anna Kolesnikova
 */
public class Hat implements Item {

    @Override
    public String getName() {
        return "Small hat";
    }

    @Override
    public String getColor() {
        return "Ultimate Black";
    }

    @Override
    public float getPrice() {
        return 16.2f;
    }
}
