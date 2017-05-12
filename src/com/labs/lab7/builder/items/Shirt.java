package com.labs.lab7.builder.items;

import com.labs.lab7.builder.Item;

/**
 * Created on: 05/12/2017
 *
 * @author Anna Kolesnikova
 */
public class Shirt implements Item {
    @Override
    public String getName() {
        return "Loose shirt";
    }

    @Override
    public String getColor() {
        return "Snow White";
    }

    @Override
    public float getPrice() {
        return 7.8f;
    }
}
