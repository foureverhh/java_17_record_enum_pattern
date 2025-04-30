package org.example.generics.wildcard_example;

import org.example.generics.further.domains.Animal;
import org.example.generics.further.domains.Cat;
import org.example.generics.further.domains.Dog;
import org.example.generics.further.myInterface.Sleep;

import java.util.List;

public class WildcardDemo {
    public static void main(String[] args) {
        printList(List.of("hello", "world"));
        printList(List.of(1, 2));
        printWildCardList(List.of(new Cat(),new Dog()));
    }

    // wildcard for list to accept all objects
    private static void printList(List<?> list) {
        list.forEach(System.out::println);
    }

    private static void printWildCardList(List<? extends Animal> animalInstances) {
        animalInstances.forEach(Sleep::sleep);
        animalInstances.forEach(Animal::eat);
    }

    /*
    private static void printWildCardList(List<? extends Sleep> sleepInstances) {
        sleepInstances.forEach(Sleep::sleep);
        sleepInstances.forEach(Animal::eat); // this eat is not accessible
    }
    */
}