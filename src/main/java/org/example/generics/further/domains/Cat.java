package org.example.generics.further.domains;

import org.example.generics.further.myInterface.Sleep;

public class Cat extends Animal implements Sleep {
    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps");
    }

    @Override
    public String toString() {
        return "An cat instance";
    }
}
