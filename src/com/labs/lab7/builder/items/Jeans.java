package com.labs.lab7.builder.items;

import com.labs.lab7.builder.Item;

/**
 * Created on: 05/12/2017
 *
 * @author Anna Kolesnikova
 */
public class Jeans implements Item {
    @Override
    public String getName() {
        return "Slim straight jeans";
    }

    @Override
    public String getColor() {
        return "Navy Blue";
    }

    @Override
    public float getPrice() {
        return 5f;
    }
}
