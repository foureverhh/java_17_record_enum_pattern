package org.example.generics.further.domains;

import org.example.generics.further.myInterface.Sleep;

public class Animal implements Sleep {
    public void eat() {}

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
