package by.it_academy.Lesson9.enums;

import java.io.Serializable;

public enum Color implements Serializable {
    RED("красный", 500), BLUE("синий", 500), GREEN("зеленый", 500), BLACK("черный", 500), GRAY("серый", 500);
    private String name;
    private int price;
    Color(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName(){ return name;}
}
