package by.it_academy.Lesson11;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Warehouse implements Serializable {
    private static int uid = 0;
    private int id;
    private String name = "Склад №";
    private ArrayList<Car> cars;
    private boolean isTradIn;
    private boolean isFull = false;

    Warehouse(boolean isTradIn) {
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

    ArrayList<Car> getCars() {

        return cars;
    }

    private void setCars() {
        this.cars = new ArrayList<>();
    }

    boolean isTradIn() {
        return isTradIn;
    }

    private void setTradIn(boolean tradIn) {
        isTradIn = tradIn;
    }

    boolean isFull() {
        return isFull;
    }

    void setFull(boolean full) {
        isFull = full;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warehouse warehouse = (Warehouse) o;
        return id == warehouse.id &&
                isTradIn == warehouse.isTradIn &&
                isFull == warehouse.isFull &&
                Objects.equals(name, warehouse.name) &&
                Objects.equals(cars, warehouse.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cars, isTradIn, isFull);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cars=" + cars +
                ", isTradIn=" + isTradIn +
                ", isFull=" + isFull +
                '}';
    }
}
