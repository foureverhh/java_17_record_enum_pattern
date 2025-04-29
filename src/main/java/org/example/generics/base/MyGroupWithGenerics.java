package org.example.generics.base;

import java.util.ArrayList;
import java.util.List;

public class MyGroupWithGenerics<T> {
    private final List<T> list = new ArrayList<>();
    public void addItem(T t) {
        list.add(t);
    }
    public void removeItem(T t) {
        list.remove(t);
    }

    public List<T> getList() {
        return this.list;
    }

    public T getItem(int index) {
        return list.get(index);
    }

    @Override
    public String toString() {
        return "MyGroup{" +
                "list=" + list +
                '}';
    }
}
