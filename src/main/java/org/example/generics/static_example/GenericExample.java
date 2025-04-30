package org.example.generics.static_example;

import org.example.generics.further.domains.Cat;

public class GenericExample {
    public static void main(String[] args) {
        sleep("A String");
        sleep(new Cat());
        sleep("A String", new Cat());
        System.out.println(sleep("A String", new Cat(), "With return type").getClass().getName());
    }

    static<T> void sleep(T whatEverWantsToSleep) {
        System.out.printf("%s is sleeping %n", whatEverWantsToSleep);
    }

    static<T,V> void sleep(T whatEverWantsToSleep, V otherThingWantsToSleep) {
        System.out.printf("%s is sleeping %n", whatEverWantsToSleep);
        System.out.printf("%s is sleeping %n", otherThingWantsToSleep);
    }

    static<T,V> T sleep(T whatEverWantsToSleep, V otherThingWantsToSleep, String str) {
        return whatEverWantsToSleep;
    }
}
