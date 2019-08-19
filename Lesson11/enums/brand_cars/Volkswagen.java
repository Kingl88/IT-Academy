package by.it_academy.Lesson11.enums.brand_cars;

import by.it_academy.Lesson11.my_interface.InterfaceForEnum;

import java.io.Serializable;
import java.util.Calendar;

public enum Volkswagen implements Serializable, InterfaceForEnum {
    BORA("Bora", 1998, 2005, 1000), CADDY("Caddy", 1979, Calendar.getInstance().get(Calendar.YEAR), 2000),
    GOLF("Golf", 1974, Calendar.getInstance().get(Calendar.YEAR), 3000), JETTA("Jetta", 1979, Calendar.getInstance().get(Calendar.YEAR), 4000),
    PASSAT("Passat", 1973, Calendar.getInstance().get(Calendar.YEAR), 5000), POLO("Polo", 1975, Calendar.getInstance().get(Calendar.YEAR), 6000),
    TIGUAN("Tiguan", 2007, Calendar.getInstance().get(Calendar.YEAR), 7000), TOUAREG("Touareg", 2002, Calendar.getInstance().get(Calendar.YEAR), 8000);

    private String name;
    private int startOfRelease;
    private int endOfRelease;
    private int price;

    Volkswagen(String name, int startOfRelease, int endOfRelease, int price) {
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
