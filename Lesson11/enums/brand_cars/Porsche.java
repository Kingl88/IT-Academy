package by.it_academy.Lesson11.enums.brand_cars;

import by.it_academy.Lesson11.my_interface.InterfaceForEnum;

import java.io.Serializable;
import java.util.Calendar;

public enum Porsche implements Serializable, InterfaceForEnum {
    _911("911", 1963, Calendar.getInstance().get(Calendar.YEAR), 1000), CAYENNE("Cayenne", 2002, Calendar.getInstance().get(Calendar.YEAR), 2000),
    CAYMAN("Cayman", 2008, Calendar.getInstance().get(Calendar.YEAR), 3000), PANAMERA("Panamera", 2009, Calendar.getInstance().get(Calendar.YEAR), 4000);
    private String name;
    private int startOfRelease;
    private int endOfRelease;
    private int price;

    Porsche(String name, int startOfRelease, int endOfRelease, int price) {
        this.name = name;
        this.startOfRelease = startOfRelease;
        this.endOfRelease = endOfRelease;
        this.price = price;
    }

    public int getStartOfRelease() {
        return startOfRelease;
    }

    public int getPrice() {
        return price;
    }

    public int getEndOfRelease() {
        return endOfRelease;
    }

    public String getName() {
        return name;
    }
}
