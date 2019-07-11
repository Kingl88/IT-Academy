package by.it_academy.Lesson6;

public class Truck extends Automobile { // Класс грузовик
    private int tonnage; // Грузоподъемность.

    public Truck(Engine en, Transmission tr, String color, String driveType, int numberOfWheel, int tonnage) {
        super(en, tr, color, driveType, numberOfWheel);
        this.tonnage = tonnage;
    }

    public void liftCabin(){} // Метод поднятия кабины.
}
