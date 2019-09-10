package by.it_academy.Lesson15;

public class ParkingPlace {
    private boolean free = true;
    private static int id;
    private Car car;

    ParkingPlace() {
        id++;
    }

    boolean isFree() {
        return free;
    }

    void addCar(Car car, int numberParking){
        car.setNumberParking(numberParking);
        this.car = car;
        free = false;
        car.start();
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
