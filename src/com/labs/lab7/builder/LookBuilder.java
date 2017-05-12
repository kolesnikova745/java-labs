package com.labs.lab7.builder;

/**
 * Created on: 05/12/2017
 *
 * @author Anna Kolesnikova
 */
abstract class LookBuilder {
    protected Look look = new Look();

    public abstract void setHat();
    public abstract void setShirt();
    public abstract void setJeans();
    public abstract void setDress();
    public abstract void setShoes();

    public Look build() {
        return look;
    }
}
