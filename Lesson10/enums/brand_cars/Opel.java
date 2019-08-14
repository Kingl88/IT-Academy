package by.it_academy.Lesson10.enums.brand_cars;

import by.it_academy.Lesson10.my_interface.InterfaceForEnum;

import java.io.Serializable;
import java.util.Calendar;

public enum Opel implements Serializable, InterfaceForEnum {
    ASTRA("Astra", 1991, Calendar.getInstance().get(Calendar.YEAR), 1000), CORSA("Corsa", 1982, Calendar.getInstance().get(Calendar.YEAR), 2000),
    FRONTERA("Frontera", 1991, 2004, 3000), INSIGNIA("Insignia", 2008, Calendar.getInstance().get(Calendar.YEAR), 4000),
    MERIVA("Meriva", 2002, Calendar.getInstance().get(Calendar.YEAR), 5000), VECTRA("Vectra", 1988, 2009, 6000),
    OMEGA("Omega", 1986, 2003, 7000), AMPERA_E("Ampera-e", 2016, Calendar.getInstance().get(Calendar.YEAR), 8000);
    private String name;
    private int startOfRelease;
    private int endOfRelease;
    private int price;

    Opel(String name, int startOfRelease, int endOfRelease, int price) {
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
