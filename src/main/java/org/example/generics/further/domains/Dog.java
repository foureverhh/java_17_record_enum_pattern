package org.example.generics.further.domains;

import org.example.generics.further.myInterface.Sleep;

public class Dog extends Animal implements Sleep {
    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}
