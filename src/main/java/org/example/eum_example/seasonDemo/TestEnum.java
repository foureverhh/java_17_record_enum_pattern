package org.example.eum_example.seasonDemo;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println(MySeasonEnum.SPRING);
        System.out.println(MySeasonEnum.SUMMER);
        System.out.println(MySeasonEnum.AUTUMN);
        System.out.println(MySeasonEnum.WINTER);

        System.out.println("-----------------");
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);

        // test enum methods
        /*
          name
          toString
          ordinal
          values
          valueOf
          compareTo
         */

        //name
        System.out.println(Season.AUTUMN.name());

        //ordinal index
        System.out.println(Season.WINTER.ordinal());

        //compareTo Winter ordinal - Spring ordinal
        System.out.println(Season.WINTER.compareTo(Season.SPRING));

        // values returns all fields defines in the enum
        for (Season value : Season.values()) {
            System.out.println(value);
        }

        // valueOf to compare enum name with the text to return the enum
        System.out.println(Season.valueOf("SPRING"));
        // System.out.println(Season.valueOf("XXX"));

    }
}
