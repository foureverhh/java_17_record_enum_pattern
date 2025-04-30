package org.example.generics.further;

import org.example.generics.further.domains.Animal;
import org.example.generics.further.domains.Cat;
import org.example.generics.further.domains.Dog;

public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        // specific printer
        AnimalPrinter<Cat> catPrinter = new AnimalPrinter<>(cat);
        catPrinter.print();
        catPrinter.sleep();
        AnimalPrinter<Dog> dogPrinter = new AnimalPrinter<>(dog);
        dogPrinter.print();
        dogPrinter.sleep();

        // Generic printer
        AnimalPrinter<Animal> printer = new AnimalPrinter<>(cat);
        printer.print();
        printer.sleep();
        printer = new AnimalPrinter<>(dog);
        printer.print();
        printer.sleep();

    }
}
