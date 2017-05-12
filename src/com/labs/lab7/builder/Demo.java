package com.labs.lab7.builder;

/**
 * Created on: 05/12/2017
 *
 * @author Anna Kolesnikova
 */
public class Demo {
    public static void main(String[] args) {
        //fashion builder
        LookBuilder fashionLookBuilder = new FashionLookBuilder();
        LookDirector fashionLookDirector = new LookDirector(fashionLookBuilder);
        fashionLookDirector.createLook();
        Look fashionLook = fashionLookDirector.getLook();

        System.out.println("Cool fashion look:");
        fashionLook.showItems();
        System.out.println("Total price: " + fashionLook.getCost() + "$");
        System.out.println();

        //romantic builder
        LookBuilder romanticLookBuilder = new RomanticLookBuilder();
        LookDirector romanticLookDirector = new LookDirector(romanticLookBuilder);
        romanticLookDirector.createLook();
        Look romanticLook = romanticLookDirector.getLook();

        System.out.println("Sexy romantic look:");
        romanticLook.showItems();
        System.out.println("Total price: " + romanticLook.getCost() + "$");


    }
}
