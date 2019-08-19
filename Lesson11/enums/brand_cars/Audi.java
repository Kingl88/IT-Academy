package by.it_academy.Lesson11.enums.brand_cars;

import by.it_academy.Lesson11.my_interface.InterfaceForEnum;

import java.io.Serializable;
import java.util.Calendar;

public enum Audi implements Serializable, InterfaceForEnum {
    A4("A4", 1994, Calendar.getInstance().get(Calendar.YEAR), 1000), A5("A5", 2007, Calendar.getInstance().get(Calendar.YEAR), 2000),
    A6("A6", 1994, Calendar.getInstance().get(Calendar.YEAR),3000), A7("A7", 2010, Calendar.getInstance().get(Calendar.YEAR), 4000),
    A8("A8", 1994, Calendar.getInstance().get(Calendar.YEAR), 5000), Q3("Q3", 2011, Calendar.getInstance().get(Calendar.YEAR), 6000),
    Q5("Q5", 2008, Calendar.getInstance().get(Calendar.YEAR), 7000), Q7("Q7", 2005, Calendar.getInstance().get(Calendar.YEAR), 8000),
    Q8("Q8", 2018, Calendar.getInstance().get(Calendar.YEAR), 9000), E_TRON("e-tron", 2018, Calendar.getInstance().get(Calendar.YEAR), 10000);
    private String name;
    private int startOfRelease;
    private int endOfRelease;
    private int price;

    Audi(String name, int startOfRelease, int endOfRelease, int price) {
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
