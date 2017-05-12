package com.labs.lab7.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on: 05/12/2017
 *
 * @author Anna Kolesnikova
 */
public class Look {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.getPrice();
        }

        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item: " + item.getName());
            System.out.print(", Color: " + item.getColor());
            System.out.println(", Price: " + item.getPrice() + "$");
        }
    }
}
