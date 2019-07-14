package by.it_academy.Lesson6.carlib;

public class ElectricEngine extends Engine{

    public ElectricEngine(int power, int torque) {
        super(power, torque);
    }

    @Override
    public boolean on() {
        System.out.println("Запуск электрического двигателя");
        return true;
    }

    public boolean off() {
        System.out.println("Выключение электрического двигателя");
        return true;
    }
}
