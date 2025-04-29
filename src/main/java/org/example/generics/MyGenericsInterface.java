package org.example.generics;

public interface MyGenericsInterface<T> {
    T show(T t);

    // 同时使用泛型接口T和泛型方法M
    <M> T show(T t, M m);

}
