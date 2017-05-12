package com.labs.lab7.builder.items;

import com.labs.lab7.builder.Item;

/**
 * Created on: 05/12/2017
 *
 * @author Anna Kolesnikova
 */
public class StilettoShoes implements Item {

    @Override
    public String getName() {
        return "Stiletto shoes";
    }

    @Override
    public String getColor() {
        return "Scarlet";
    }

    @Override
    public float getPrice() {
        return 38.5f;
    }
}
