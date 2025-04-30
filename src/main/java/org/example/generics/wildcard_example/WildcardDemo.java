package org.example.generics.wildcard_example;

import org.example.generics.further.domains.Cat;

import java.util.List;

public class WildcardDemo {
    public static void main(String[] args) {
        printList(List.of("hello", "world"));
        printList(List.of(1, 2));
    }

    // wildcard for list to accept all objects
    private static void printList(List<?> list) {
        list.forEach(System.out::println);
    }
}