package com.labs.lab7.builder;

import com.labs.lab7.builder.items.Dress;
import com.labs.lab7.builder.items.Hat;
import com.labs.lab7.builder.items.StilettoShoes;

/**
 * Created on: 05/12/2017
 *
 * @author Anna Kolesnikova
 */
public class RomanticLookBuilder extends LookBuilder {

    public void setHat() {
        look.addItem(new Hat());
    }

    public void setShirt() {
        // fashion look doesn't have shirt!
    }

    public void setJeans() {
        // fashion look doesn't have jeans!
    }

    public void setDress() {
        look.addItem(new Dress());
    }

    public void setShoes() {
        look.addItem(new StilettoShoes());
    }

}
