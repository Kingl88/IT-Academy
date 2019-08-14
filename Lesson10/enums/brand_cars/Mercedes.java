package by.it_academy.Lesson10.enums.brand_cars;

import by.it_academy.Lesson10.my_interface.InterfaceForEnum;

import java.io.Serializable;
import java.util.Calendar;

public enum Mercedes implements Serializable, InterfaceForEnum {
    CLS("CLS", 2004, Calendar.getInstance().get(Calendar.YEAR), 1000), GLA("GLA", 2013, Calendar.getInstance().get(Calendar.YEAR), 2000),
    SL("SL", 1963, Calendar.getInstance().get(Calendar.YEAR), 3000), SLK("SLK", 1996, 2016, 4000),
    GLS("GLS", 2015, Calendar.getInstance().get(Calendar.YEAR), 5000);

    private String name;
    private int startOfRelease;
    private int endOfRelease;
    private int price;

    Mercedes(String name, int startOfRelease, int endOfRelease, int price) {
        this.name = name;
        this.startOfRelease = startOfRelease;
        this.endOfRelease = endOfRelease;
        this.price = price;
    }

    public int getEndOfRelease() {
        return endOfRelease;
    }

    public int getPrice() {
        return price;
    }

    public int getStartOfRelease() {
        return startOfRelease;
    }

    public String getName() {
        return name;
    }
}
