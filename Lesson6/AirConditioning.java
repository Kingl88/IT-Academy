package by.it_academy.Lesson6.carlib;

public class AirConditioning implements Rotation {
    @Override
    public <Integer> void left(Integer temp) {
        System.out.println("Уменьшить температуру в салоне автомобиля на " + temp + " градусов.");
    }

    @Override
    public <Integer> void right(Integer temp) {
        System.out.println("Увеличить температуру в салоне автомобиля на " + temp + " градусов.");
    }
}
