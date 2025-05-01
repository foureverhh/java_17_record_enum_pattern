package org.example.eum_example.seasonDemo;

public enum Season {
    SPRING("spring","spring charactor"),
    SUMMER("summer","summer charactor"),
    AUTUMN("autumn","autumn charactor"),
    WINTER("winter","winter charactor");

    private String name;
    private String characteristic;

    // enum constructor by default is private scope
    Season(){};
    Season(String name, String characteristic){
        this.name = name;
        this.characteristic = characteristic;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Season {" +
                "name='" + name + '\'' +
                ", characteristic='" + characteristic + '\'' +"}";
    }
}
