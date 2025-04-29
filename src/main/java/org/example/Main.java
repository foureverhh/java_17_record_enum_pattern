package org.example;

import org.example.generics.base.MyGenericsInterface;
import org.example.generics.base.MyGenericsInterfaceImpl;
import org.example.generics.base.MyGroupWithGenerics;
import org.example.generics.base.MyGroupWithGenericsMethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Alien alien = new Alien(1, "Jack");
        System.out.println(alien);
        System.out.println(alien.name());
        System.out.println(alien.age());

        ArrayList<String> stringList = new ArrayList();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        // stringList.add(66);
        Iterator iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 泛型可以用于类，方法和接口
        // generics for class
        MyGroupWithGenerics<String> stringGroup = new MyGroupWithGenerics<>();
        stringGroup.addItem("hello");
        stringGroup.addItem("world");
        System.out.println("stringGroup is " + stringGroup.getList());
        MyGroupWithGenericsMethod myGroupWithGenericsMethod = new MyGroupWithGenericsMethod();
        List<String> reversed = myGroupWithGenericsMethod.reverseGroup(stringGroup.getList());
        System.out.println("After reverse the list is " + reversed);
        System.out.println("After reverse the stringGroup.getList() is " + reversed);

        MyGroupWithGenerics<Integer> integerGroup = new MyGroupWithGenerics<>();
        integerGroup.addItem(1);
        System.out.println("integerGroup is " + integerGroup.getList());

        // generics interface
        MyGenericsInterfaceImpl<String> myGenericsStringInterface = new MyGenericsInterfaceImpl<>();
        String result = myGenericsStringInterface.show("hello");
        System.out.println("result is " + result);
        MyGenericsInterface<Integer> myGenericsIntegerInterface = new MyGenericsInterfaceImpl<>();
        Integer integer = myGenericsIntegerInterface.show(1);
        System.out.println("integer is " + integer);

        // generics interface with generics method
        String newResult = myGenericsStringInterface.show("hello", "world");
        System.out.println("newResult is " + newResult);
        // int

    }

    static <T> List<T> showList(List<T> list) {
        return list;
    }
}