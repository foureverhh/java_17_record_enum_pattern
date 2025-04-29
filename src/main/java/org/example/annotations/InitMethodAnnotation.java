package org.example.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //注释只能应用于方法
@Retention(RetentionPolicy.RUNTIME) //保留在运行时，jvm可以调用
public @interface InitMethodAnnotation {
    /* @Target is root annotation for Annotation in java
       ElementType:
       ElementType.TYPE              for class and interface
       ElementType.FIELD             for class filed
       ELementType.METHOD            for class method
       ElementType.PARAMETER         for parameters for method
       ElementType.CONSTRUCTOR       for class constructor

       ElementType.PACKAGE           for package
       ElementType.ANNOTATION_TYPE   for annotation
    */


    /*
        @RETENTION 指定注释的保留域
        RetentionPolicy:
        RetentionPolicy.SOURCE      源码级别，由编译器处理，处理之后不再保留
        RetentionPolicy.CLASS       注释信息保留到类对应的.class文件中
        RetentionPolicy.RUNTIME     由jvm读取，运行时使用
     */


}
