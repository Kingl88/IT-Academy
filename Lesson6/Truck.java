package by.it_academy.Lesson6.carlib;

import java.util.Objects;

public class Truck extends Car{
    private int maxWeight;

    public Truck(int wheelCount, int axisCount, int seatCount, int weight, Engine engine, Transmission transmission, Steerage steerage, int maxWeight) throws Exception {
        super(wheelCount, axisCount, seatCount, weight, engine, transmission, steerage);
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void attachTrailer(){
        System.out.println("Присоеденить прицеп");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return maxWeight == truck.maxWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxWeight);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxWeight=" + maxWeight +
                '}';
    }
}
