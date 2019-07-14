package by.it_academy.Lesson6.carlib;

import java.util.Objects;

public abstract class Car {
    private int wheelCount; // Количество колес
    private int axisCount; // Количество осей
    private int seatCount; // Количество пассажирских мест
    private int weight; //Вес автомобиля
    private int currentSpeed; // Текущая скорость автомобиля.

    private final Engine engine; // Двигатель автомобиля
    private final Transmission transmission; // Коробка передач

    public Car(int wheelCount, int axisCount, int seatCount, int weight, Engine engine, Transmission transmission) throws Exception {
        this.wheelCount = wheelCount;
        this.axisCount = axisCount;
        this.seatCount = seatCount;
        this.weight = weight;
        this.currentSpeed  = 0;
        if (transmission != null) {
            this.transmission = transmission;
        } else {
            throw new Exception();
        }

        if (engine != null) {
            this.engine = engine;
        } else {
            throw new Exception();
        }
    }

    public void onElectric() {
        System.out.println("Подать питание на элементы машины");
        System.out.println("Ожидание запуска двигателя");
        boolean result = engine.on();
        if(result) {
            System.out.println("Двигатель запущен");
        }
    }

    public void off() {
        boolean result = engine.off();
        if(result) {
            System.out.println("Двигатель остановлен");
        }
        System.out.println("Снять питание с элементов машины");
    }

    public  void currentSpeed(int speed){
        if(speed > getCurrentSpeed()) {
            gasPedal();
            setCurrentSpeed(speed);
            System.out.println("Начинаем двигаться со скоростью " + getCurrentSpeed());
        } else {
            brakePedal();
            setCurrentSpeed(speed);
            System.out.println("Начинаем двигаться со скоростью " + getCurrentSpeed());
        }
    } // Метод изменения скорости

    public void gasPedal() { // Метод нажатия на педаль акселератора
        System.out.println("Нажимаем педаль газа");
    }

    public void brakePedal() { // Метод нажатия на педаль тормоза.
        System.out.println("Нажимаем педаль тормоза");
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getAxisCount() {
        return axisCount;
    }

    public void setAxisCount(int axisCount) {
        this.axisCount = axisCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheelCount=" + wheelCount +
                ", axisCount=" + axisCount +
                ", seatCount=" + seatCount +
                ", weight=" + weight +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return wheelCount == car.wheelCount &&
                axisCount == car.axisCount &&
                seatCount == car.seatCount &&
                weight == car.weight &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheelCount, axisCount, seatCount, weight, engine);
    }
}
