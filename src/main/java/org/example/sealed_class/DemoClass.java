package org.example.sealed_class;

// final class make no class can extends it
final class A {

}

sealed class AA permits BB,CC,DD {}

final class BB extends AA {}
non-sealed class CC extends AA {}
sealed class DD extends AA permits EE{} //sealed class must have subclass

final class EE extends DD implements ICC{}
class B {}



class C extends CC {} //As class CC is a non-sealed class

class D {}

sealed interface IAA permits IBB, ICC {

}

non-sealed interface IBB extends IAA {
}

sealed interface ICC extends IAA permits IDD, EE {}

non-sealed interface IDD extends ICC {}

public class DemoClass {
    public static void main(String[] args) {

    }
}
/*
final class on purpose to not be inherited
abstract class on purpose to be inherited
sealed class permits which one or ones subclasses can inherit
sealed subclass must have either non-sealed keyword or final keyword to decide whether the subclass itself can be inherited or not,
or with sealed keyword to make itself as a sealed class

sealed interface permits only which class or interface can inherit it
those subinterface should have keyword sealed or non-sealed, but not final, as interface by default should be implemented
 */