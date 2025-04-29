package org.example.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyGroupWithGenericsMethod {
    public <T> List<T> reverseGroup(List<T> list) {
        List<T> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
         return reversedList;
    }
}
