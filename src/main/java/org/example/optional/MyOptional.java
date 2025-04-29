package org.example.optional;

import org.example.Alien;

import java.util.Optional;
import java.util.stream.Stream;

public class MyOptional {
    public static void main(String[] args) {
        getAlienByAge(2).ifPresent(System.out::println);  // ifPresent if present use the value, otherwise do nothing
        getAlienByAge(2).ifPresentOrElse(alien-> System.out.println(alien.name()), () -> System.out.println(new Alien(10, "fake alien"))); // ifPresentOrElse if present use value, otherwise
        getAlienByAge(1).ifPresentOrElse(alien-> System.out.println(alien.name()), () -> System.out.println(new Alien(10, "fake alien"))); // ifPresentOrElse if present use value, otherwise
        getAlienByAge(2).or(Optional::empty);
        getAlienByAge(2).orElse(new Alien(10, "fake alien"));
        //or can combine a group of optional
        getAlienByAge(2).or(()->getAlienByAge(1)).ifPresent(System.out::println);
        getAlienByAge(1).filter(alien -> alien.name().length() >=5).ifPresent(System.out::println);
    }

    public static Optional<Alien> getAlienByAge(int age) {
        return Stream.of(new Alien(1,"Alien")).filter(alien -> alien.age() == age).findFirst();
    }
}
