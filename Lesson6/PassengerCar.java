package by.it_academy.Lesson6.carlib;

import java.util.Objects;

public class PassengerCar extends Car {
    private String typeBody;

    public PassengerCar(int wheelCount, int axisCount, int seatCount, int weight, Engine engine, Transmission transmission, String typeBody) throws Exception {
        super(wheelCount, axisCount, seatCount, weight, engine, transmission);
        this.typeBody = typeBody;
    }

    public void openTrunk(){ // Метод для открывания багажника.
        System.out.println("Багажник открыт");
    }

    public String getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(String typeBody) {
        this.typeBody = typeBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerCar that = (PassengerCar) o;
        return Objects.equals(typeBody, that.typeBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeBody);
    }
}
