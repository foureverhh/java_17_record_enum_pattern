package org.example.generics.further;

import java.io.Serializable;
// Animal is the boundary for generics, otherwise T animal do not has access to method eat
public class AnimalPrinter <T extends Animal> {
    T animal;
    AnimalPrinter(T animal) {
        this.animal = animal;
    }
    void print() {
        animal.eat();
    }
}
