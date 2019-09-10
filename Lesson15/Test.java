package by.it_academy.Lesson15;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ParkingPlace[] parkingPlaces = new ParkingPlace[5];
        int n = 10;
        for (int i = 0; i < n; i++) {
            Car car = new Car("Автомобиль номер " + (i + 1));
            if (isSleep( parkingPlaces, car)) {
                Thread.sleep((long) (Math.random() * 1000));
                if (isSleep( parkingPlaces, car)) {
                    System.out.println(car.getName() + " поехал на другую парковку");
                }
            }
        }
    }

    private static boolean isSleep( ParkingPlace[] parkingPlaces, Car car) throws InterruptedException {
        for (int j = 0; j < parkingPlaces.length; j++) {
            if (parkingPlaces[j] == null || parkingPlaces[j].isFree()) {
                parkingPlaces[j] = new ParkingPlace();
            }
            if (parkingPlaces[j].getCar() == null || parkingPlaces[j].getCar().isEnd()) {
                parkingPlaces[j].addCar(car, j + 1);
                return false;
            }
        }
        return true;
    }
}
