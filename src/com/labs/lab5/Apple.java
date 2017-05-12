package com.labs.lab5;

/**
 * Created by Anna Kolesnikova on 12.05.2017.
 */
public class Apple {
    private String color;
    private double weight;

    public Apple(String color, double wight) {
        this.color = color;
        this.weight = wight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Color: " + color + ", Weight: " + weight + "g";
    }
}
