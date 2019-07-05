// Класс описывает работу частотного привода. Где isUp движение вверх, isDown движение вниз,
// передаются кординаты и сообщение о достижении текучей координаты или нет.

package Academy.Lesson5;

public class FrequencyDrive {

    public static final int MAX_COORDINATE = 1000;
    public static final int MIN_COORDINATE = 0;
    public static final int MAX_FREQUENCY = 100;
    public static final int MIN_FREQUENCY = 2;
    public static final int GEAR_RATIO = 10; // Передаточное число редуктора.

    private int сurrentСoordinate; // Текущая координата
    private int setCoordinate; // Координата в которую нужно двигаться
    private int frequency; // Частота с которой будет работать двигатель

    public FrequencyDrive(int setCoordinate) { // Тут создаем экземпляр класса с координатой в которую нужно двигаться и частота вращения двигателя
        setSetCoordinate(setCoordinate);
        this.frequency = MAX_FREQUENCY / 2;
    }

    public FrequencyDrive(int сurrentСoordinate, int setCoordinate, int frequency) { // Тут создаем экземпляр класса с текущей коорднатой, с координатой в которую едем и частотой вращения двигателя.
            setSetCoordinate(setCoordinate);
            setСurrentСoordinate(сurrentСoordinate);
            setFrequency(frequency);
    }

    public int getСurrentСoordinate() {
        return сurrentСoordinate;
    }

    public void setСurrentСoordinate(int сurrentСoordinate) {
        if (сurrentСoordinate >= MIN_COORDINATE && сurrentСoordinate <= MAX_COORDINATE) {
            this.сurrentСoordinate = сurrentСoordinate;
        } else {
            System.out.println("Ошибка позиционирования.");
        }
        this.сurrentСoordinate = сurrentСoordinate;
    }

    public int getSetCoordinate() {
        return setCoordinate;
    }

    public void setSetCoordinate(int setCoordinate) {
        if (setCoordinate >= MIN_COORDINATE && setCoordinate <= MAX_COORDINATE) {
            this.setCoordinate = setCoordinate;
        } else {
            this.setCoordinate = MAX_COORDINATE;
        }
        this.setCoordinate = setCoordinate;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        if (frequency > MIN_FREQUENCY && frequency <= MAX_FREQUENCY) {
            this.frequency = frequency;
        } else {
            this.frequency = 0;
            System.out.println("Привод остановлен, неправильно задана частота вращения");
        }
        this.frequency = frequency;
    }

    public void up(int сurrentСoordinate, int setCoordinate) { //Метод движения вверх
        this.сurrentСoordinate = сurrentСoordinate;
        while(this.сurrentСoordinate < (this.setCoordinate = setCoordinate)) {
            this.сurrentСoordinate+=MAX_FREQUENCY/GEAR_RATIO;
        }
    }
    public void up(int сurrentСoordinate, int setCoordinate, int frequency) {
        this.сurrentСoordinate = сurrentСoordinate;
        while(this.сurrentСoordinate < (this.setCoordinate = setCoordinate)) {
            this.сurrentСoordinate+=frequency/GEAR_RATIO;
        }
    }

    public void down(int сurrentСoordinate, int setCoordinate) { // Метод движения вниз.
        this.сurrentСoordinate = сurrentСoordinate;
        while(this.сurrentСoordinate < (this.setCoordinate = setCoordinate)) {
            this.сurrentСoordinate-=MAX_FREQUENCY/GEAR_RATIO;
        }
        System.out.println("Координата достигнута");
    }

    public void down(int сurrentСoordinate, int setCoordinate, int frequency) {
        this.сurrentСoordinate = сurrentСoordinate;
        while(this.сurrentСoordinate < (this.setCoordinate = setCoordinate)) {
            this.сurrentСoordinate-=frequency/GEAR_RATIO;
        }
        System.out.println("Координата достигнута");
    }

    public static void printConstCoordinate() {
        System.out.println("Максимальная координа = " + MAX_COORDINATE + ", минимальная координата = " + MIN_COORDINATE);
    }

    public static void main(String[] args) {
        FrequencyDrive drive = new FrequencyDrive(750);
        System.out.println(drive.сurrentСoordinate);
        drive.up(100, 750, 25);
        System.out.println(drive.сurrentСoordinate);
        FrequencyDrive.printConstCoordinate();
    }
}
