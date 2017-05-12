package com.labs.lab7.builder;

import com.labs.lab7.builder.items.Hat;
import com.labs.lab7.builder.items.Jeans;
import com.labs.lab7.builder.items.Shirt;
import com.labs.lab7.builder.items.StilettoShoes;

/**
 * Created on: 05/12/2017
 *
 * @author Anna Kolesnikova
 */
public class FashionLookBuilder extends LookBuilder {

    public void setHat() {
        look.addItem(new Hat());
    }

    public void setShirt() {
        look.addItem(new Shirt());
    }

    public void setJeans() {
        look.addItem(new Jeans());
    }

    public void setDress() {
        // fashion look doesn't have dress!
    }

    public void setShoes() {
        look.addItem(new StilettoShoes());
    }

}
