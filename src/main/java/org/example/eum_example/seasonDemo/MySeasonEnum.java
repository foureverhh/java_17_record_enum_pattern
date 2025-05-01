package org.example.eum_example.seasonDemo;

import javax.swing.*;

public class MySeasonEnum {
    private String name;
    private String characteristic;

    // public 4 variants - spring, summer, autumn, winter
    public static final MySeasonEnum SPRING = new MySeasonEnum("spring","This is spring");
    public static final MySeasonEnum SUMMER = new MySeasonEnum("summer","This is summer");
    public static final MySeasonEnum AUTUMN = new MySeasonEnum("autumn","This is autumn");
    public static final MySeasonEnum WINTER = new MySeasonEnum("winter","This is winter");

    // private constructor to make it no way to create a new ENUM instance outside the class
    private MySeasonEnum(){}
    private MySeasonEnum(String name, String characteristic) {
        this.name = name;
        this.characteristic = characteristic;
    }

    // Only public getters but no setter. so no way to change value
    public String getName() {
        return name;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    @Override
    public String toString() {
        return "My seasonEnum {" +
                "name='" + name + '\'' +
                ", characteristic='" + characteristic + '\'' +"}";
    }
}
