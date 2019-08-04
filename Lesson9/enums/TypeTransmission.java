package by.it_academy.Lesson9.enums;

import java.io.Serializable;

public enum TypeTransmission implements Serializable {
    MKPP("механическая коробка передач", 1000), AKPP("автоматическая коробка передач", 2000),
    RKPP("роботизированная коробка передач", 3000), VARIATOR("вариативная коробка передач", 4000);
    private String name;
    private int price;

    TypeTransmission(String name, int price) {
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
