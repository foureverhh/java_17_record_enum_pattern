package org.example.records;

import java.util.function.Predicate;

record Person(String name, int age)  {
    private static Predicate<Integer> ageValidator = age -> age <=0 || age >=100;
    public Person(String name, int age) {
        if (ageValidator.test(age)) {
            throw new IllegalArgumentException("Age must be between 1 and 100");
        }
        this.name = name;
        this.age = age;
    }
    public String upperCaseName() {
        return name.toUpperCase();
    }
}

public class PersonDemo{
    public static void main(String[] args) {
        Person p1 = new Person("Jack", 25);
        Person p2 = new Person("Mike", 26);
        Person p3 = new Person("John", -1);
        System.out.println(p1.age() + " " + p1.name() + " " + p1.upperCaseName());
        System.out.println(p1.age() + " " + p2.name());
        System.out.println(p1);
        System.out.println(p2);
    }
}
