package by.it_academy.Lesson6.carlib;

public class Steerage implements Rotation {
    @Override
    public <Integer> void left(Integer degree) {
        System.out.println("Повернуть руль на " + degree + " градусов влево.");
        System.out.println("Повернуть налево.");
        System.out.println("Выровнить руль.");
    }

    @Override
    public <Integer> void right(Integer degree) {
        System.out.println("Повернуть руль на " + degree + " градусов вправо.");
        System.out.println("Повернуть направо.");
        System.out.println("Выровнить руль.");
    }
}
