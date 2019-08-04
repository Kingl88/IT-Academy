package by.it_academy.Lesson9.enums;

import java.io.Serializable;

public enum TypeEngine implements Serializable {
    DISEL("дизельный", 1000), PETROL("бензиновый", 2000), ELECTRIC("электрический", 3000);
    private String name;
    private int price;

    TypeEngine(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
