package by.it_academy.Lesson5;

public class GearMotor {
    private final int DEFAULT_FREQUENCY = 50; // Стандартная частота напряжения на двигателе
    private final int MAX_FREQUENCY = 100; // Максимальная частота напряжения
    private final int MIN_FREQUENCY = 2; // Минимальная частота напряжения
    private final int MAX_ROTATIONAL_SPEED_MOTOR = 3000; // Максимальная стандартная частота вращения двигателей
    private final int MIN_ROTATIONAL_SPEED_MOTOR = 750; // Минимальная стандартная частота вращения двигателей
    private final int MAX_GEAR_RATION_REDUCER = 150; // Максимальное передаточное число
    private final int MIN_GEAR_RATION_REDUCER = 5; // Минимальное передаточное число

    private int rotationalSpeedMotor; // Скорость вращения вала двигателя.
    private int currentRotationalSpeedMotor; // Текучая скорость вращения вала двигателя.
    private boolean isWithBrake; // Двигатель стоит на тормозе Да/Нет.
    private int gearRatioReducer; //Передаточное число редуктора.
    private int frequency; // Частота напряжения подаваемого на двигатель.
    private int directionOfRotation; // направление вращения вала двигателя 1- по часовой стрелке, -1 против часовой стрелки.

    public GearMotor(int rotationalSpeedMotor, int gearRatioReducer) {
        setRotationalSpeedMotor(rotationalSpeedMotor);
        setGearRatioReducer(gearRatioReducer);
        this.frequency = DEFAULT_FREQUENCY;
        this.currentRotationalSpeedMotor = 0;
        isWithBrake = true;
    }

    public boolean getIsWithBrake() {
        return isWithBrake;
    }

    public void setWithBrake(boolean withBrake) {
        if (getCurrentRotationalSpeedMotor() == 0 && withBrake == true) {
            isWithBrake = withBrake;
        } else {
            isWithBrake = withBrake;
        }
    }

    private void setCurrentRotationalSpeedMotor(int directionOfRotation) {  // Метод который определяет направление и скорость вращения вала двигателя.
        currentRotationalSpeedMotor = 0;
        if ((getRotationalSpeedMotor() / DEFAULT_FREQUENCY) * getFrequency() >= 0 && (getRotationalSpeedMotor() / DEFAULT_FREQUENCY) * getFrequency() < MAX_ROTATIONAL_SPEED_MOTOR * 2) {
            if (directionOfRotation == 1) {
                this.currentRotationalSpeedMotor = (getRotationalSpeedMotor() / DEFAULT_FREQUENCY) * getFrequency();
            } else {
                if (directionOfRotation == -1) {
                    this.currentRotationalSpeedMotor = directionOfRotation * (getRotationalSpeedMotor() / DEFAULT_FREQUENCY) * getFrequency();
                } else {
                    currentRotationalSpeedMotor = 0;
                }
            }
        }
    }

    public int getCurrentRotationalSpeedMotor() {
        return currentRotationalSpeedMotor;
    }

    public int getRotationalSpeedMotor() {
        return rotationalSpeedMotor;
    }

    public void setRotationalSpeedMotor(int rotationalSpeedMotor) {
        rotationalSpeedMotor = MIN_ROTATIONAL_SPEED_MOTOR;
        if (rotationalSpeedMotor >= MIN_ROTATIONAL_SPEED_MOTOR && rotationalSpeedMotor <= MAX_ROTATIONAL_SPEED_MOTOR) {
            this.rotationalSpeedMotor = rotationalSpeedMotor;
        }
    }

    public int getGearRatioReducer() {
        return gearRatioReducer;
    }

    public void setGearRatioReducer(int gearRatioReducer) {
        if (gearRatioReducer >= MIN_GEAR_RATION_REDUCER && gearRatioReducer <= MAX_GEAR_RATION_REDUCER) {
            this.gearRatioReducer = gearRatioReducer;
        }
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = DEFAULT_FREQUENCY;
        if (frequency >= MIN_FREQUENCY && frequency <= MAX_FREQUENCY) {
            this.frequency = frequency;
        }
    }

    public void Rotation(int frequency, int directionOfRotation) { // Метод который говорит что надо начать вращение вала двигателя.
        if (frequency >= MIN_FREQUENCY) {
            setFrequency(frequency);
            setWithBrake(false);
            setCurrentRotationalSpeedMotor(directionOfRotation);
        }

    }
}
