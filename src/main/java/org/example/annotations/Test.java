package org.example.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("org.example.annotations.InitDemo");
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            boolean isWithAnnotation = method.isAnnotationPresent(InitMethodAnnotation.class);
            if (isWithAnnotation) {
                System.out.println("Method with name " + method.getName() + ": isWithAnnotation");
                method.invoke(clazz.getConstructor(null).newInstance(null),null );
            }
        }
    }
}
