package by.it_academy.Lesson9;

import java.io.Serializable;
import java.util.ArrayList;

public class Warehouse implements Serializable {
    private static int uid = 0;
    private int id;
    private String name = "Склад №";
    private ArrayList<Car> cars;
    private boolean isTradIn;
    private boolean isFull = false;

    public Warehouse(boolean isTradIn) {
        setId();
        setTradIn(isTradIn);
        setCars();
    }

    private void setId() {
        id = ++uid;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Car> getCars() {

        return cars;
    }

    public void setCars() {
        this.cars = new ArrayList<>();
    }

    public boolean isTradIn() {
        return isTradIn;
    }

    public void setTradIn(boolean tradIn) {
        isTradIn = tradIn;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }
}
