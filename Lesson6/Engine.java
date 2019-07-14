package by.it_academy.Lesson6.carlib;

import java.util.Objects;

public abstract class Engine {
    private int power; // Мощность двигателя.
    private int torque; // Крутящий момент.

    public Engine(int power, int torque) {
        this.power = power;
        this.torque = torque;
    }

    public abstract boolean on();
    public abstract boolean off();

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power &&
                torque == engine.torque;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, torque);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", torque=" + torque +
                '}';
    }
}
