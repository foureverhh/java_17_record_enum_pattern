package org.example.generics.further;

import org.example.generics.further.domains.Animal;
import org.example.generics.further.myInterface.Sleep;

// Animal is the boundary for generics, otherwise T animal do not has access to method eat
public class AnimalPrinter <T extends Animal & Sleep> implements Sleep {
    T animal;
    AnimalPrinter(T animal) {
        this.animal = animal;
    }
    void print() {
        animal.eat();
    }

    @Override
    public void sleep() {
        animal.sleep();
    }
}
