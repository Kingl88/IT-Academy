package by.it_academy.Lesson10.enums;

import java.io.Serializable;

public enum CarBrand implements Serializable {
    AUDI("Audi"), BMW("BMW"), MERCEDES("Mercedes-Benz"), VOLKSWAGEN("Volkswagen"), PORSCHE("Porsche"), OPEL("Opel");
    private String name;
    CarBrand(String name){
        this.name = name;
    }
    public String getName(){ return name;}
}
