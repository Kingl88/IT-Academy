package by.it_academy.Lesson6.carlib;

import java.util.Objects;

public class PetrolEngine extends Engine {
    private String typePetrol;
    private int numberOfCylinder;

    public PetrolEngine(int power, int torque, String typePetrol, int numberOfCylinder) {
        super(power, torque);
        this.typePetrol = typePetrol;
        this.numberOfCylinder = numberOfCylinder;
    }

    public String getTypePetrol() {
        return typePetrol;
    }

    public void setTypePetrol(String typePetrol) {
        this.typePetrol = typePetrol;
    }

    public int getNumberOfCylinder() {
        return numberOfCylinder;
    }

    public void setNumberOfCylinder(int numberOfCylinder) {
        this.numberOfCylinder = numberOfCylinder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PetrolEngine that = (PetrolEngine) o;
        return numberOfCylinder == that.numberOfCylinder &&
                Objects.equals(typePetrol, that.typePetrol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typePetrol, numberOfCylinder);
    }

    @Override
    public String toString() {
        return "PetrolEngine{" +
                "typePetrol='" + typePetrol + '\'' +
                ", numberOfCylinder=" + numberOfCylinder +
                '}';
    }
    @Override
    public boolean on() {
        System.out.println("Запуск бензинового двигателя");
        return true;
    }

    public boolean off() {
        System.out.println("Выключение бензинового двигателя");
        return true;
    }
}
