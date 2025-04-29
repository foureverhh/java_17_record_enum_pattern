package org.example.generics.base;

public class MyGenericsInterfaceImpl<T> implements MyGenericsInterface<T> {

    @Override
    public T show(T t) {
        return t;
    }

    @Override
    public <M> T show(T t, M m) {
        if ((t instanceof Integer ti) && (m instanceof Integer mi)) {
            return (T)(Integer)(ti + mi);
        }
        if ((t instanceof String ts) && (m instanceof String ms)) {
            return (T) (ts + ms);
        }
        return t;
    }
}
