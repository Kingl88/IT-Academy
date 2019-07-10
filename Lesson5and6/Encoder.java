package by.it_academy.Lesson5;

public class Encoder {
    private final double NUMBER_OF_PULSES_PER_REVOLUTION = 4000; // Количество импульсов за оборот

    private int currentCountPulses = 4000; // для проверки работоспособности приняли значение равное 4000.
    private double numberOfRevolution; // Количество оборотов вала.

    public double getNumberOfRevolution() {
        return cut(((double) currentCountPulses) / NUMBER_OF_PULSES_PER_REVOLUTION, 2);
    }

    private double cut(double number, int count) { // Метод для округления числа до сотых.
        int degree = (int) Math.pow(10, count);
        number = number * degree;
        number = Math.round(number);
        number = number / degree;
        return number;
    }
}
