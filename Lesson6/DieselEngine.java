package by.it_academy.Lesson6.carlib;

import java.util.Objects;

public class DieselEngine extends Engine {

    private int compressionRatio; // Степень сжатия

    public DieselEngine(int power, int torque) {
        super(power, torque);
    }

    public int getCompressionRatio() {
        return compressionRatio;
    }

    public void setCompressionRatio(int compressionRatio) {
        this.compressionRatio = compressionRatio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DieselEngine that = (DieselEngine) o;
        return compressionRatio == that.compressionRatio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), compressionRatio);
    }

    @Override
    public String toString() {
        return "DieselEngine{" +
                "compressionRatio=" + compressionRatio +
                '}';
    }

    @Override
    public boolean on() {
        System.out.println("Запуск дизельного двигателя");
        return true;
    }

    public boolean off() {
        System.out.println("Выключение дизельного двигателя");
        return true;
    }
}
