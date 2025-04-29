package org.example.generics.further;

public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        // specific printer
        AnimalPrinter<Cat> catPrinter = new AnimalPrinter<>(cat);
        catPrinter.print();
        AnimalPrinter<Dog> DogPrinter = new AnimalPrinter<>(dog);
        DogPrinter.print();

        // Generic printer
        AnimalPrinter<Animal> printer = new AnimalPrinter<>(cat);
        printer.print();
        printer = new AnimalPrinter<>(dog);
        printer.print();


    }
}
