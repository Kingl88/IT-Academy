package by.it_academy.Lesson6;

public class PassengerCar extends Automobile { // Класс пассажирский автомобиль
    private int numberOfPassengers; // Количесвто пассажиров
    private String bodyType; // Тип кузова

    public PassengerCar(Engine en, Transmission tr, String color, String driveType, int numberOfWheel, int numberOfPassengers, String bodyType) {
        super(en, tr, color, driveType, numberOfWheel);
        this.numberOfPassengers = numberOfPassengers;
        this.bodyType = bodyType;
    }

    public void openTrunk(){} // Метод открытия багажника.
}
