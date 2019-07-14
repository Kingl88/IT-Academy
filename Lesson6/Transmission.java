package by.it_academy.Lesson6.carlib;

import java.util.Objects;

public abstract class Transmission {

    private byte numberOfGear; // Количесвто передач.

    public Transmission(byte numberOfGear) {
        this.numberOfGear = numberOfGear;
    }

    public abstract void positionBellCrank(Object obj); // Положение рычага коробки передач

    public byte getNumberOfGear() {
        return numberOfGear;
    }

    public void setNumberOfGear(byte numberOfGear) {
        this.numberOfGear = numberOfGear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transmission that = (Transmission) o;
        return numberOfGear == that.numberOfGear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfGear);
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "numberOfGear=" + numberOfGear +
                '}';
    }
}
