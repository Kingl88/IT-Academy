package by.it_academy.Lesson9.enums.brand_cars;

import java.io.Serializable;
import java.util.Calendar;

public enum Bmw implements Serializable {
    X1("X1", 2009, Calendar.getInstance().get(Calendar.YEAR), 1000), X2("X2", 2018, Calendar.getInstance().get(Calendar.YEAR), 2000),
    X3("X3", 2003, Calendar.getInstance().get(Calendar.YEAR), 3000), X4("X4", 2014, Calendar.getInstance().get(Calendar.YEAR), 4000),
    X5("X5", 1999, Calendar.getInstance().get(Calendar.YEAR), 5000), X6("X6", 2007, Calendar.getInstance().get(Calendar.YEAR), 6000),
    X7("X7", 2018, Calendar.getInstance().get(Calendar.YEAR), 7000), I3("i3", 2013, Calendar.getInstance().get(Calendar.YEAR), 8000),
    I8("i8", 2013, Calendar.getInstance().get(Calendar.YEAR), 9000);

    private String name;
    private int startOfRelease;
    private int endOfRelease;
    private int price;

    Bmw(String name, int startOfRelease, int endOfRelease, int price) {
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

    public String getName(){ return name;}
}
