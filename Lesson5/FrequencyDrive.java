package by.it_academy.Lesson5;

public class FrequencyDrive {

    private final int MAX_COORDINATE = 2000;
    private final int MIN_COORDINATE = 0;
    private final int MAX_SPEED = 50;
    private final int MIN_SPEED = 0;
    private final int SEC_IN_MIN = 60;

    private BallScrew bs;
    private Encoder enc;
    private GearMotor gm;
    private Sensor sn;

    private int setCoordinate;
    private int currentCoordinate;
    private int setFrenquency;
    private double moveSpeed;

    public FrequencyDrive(int stepScrew, int rotationalSpeedMotor, int gearRatioReducer) throws Exception {
        bs = new BallScrew(stepScrew);
        enc = new Encoder();
        gm = new GearMotor(rotationalSpeedMotor, gearRatioReducer);
        sn = new Sensor();
    }

    public int getMAX_COORDINATE() {
        return MAX_COORDINATE;
    }

    public int getMIN_COORDINATE() {
        return MIN_COORDINATE;
    }

    public BallScrew getBs() {
        return bs;
    }

    public Encoder getEnc() {
        return enc;
    }

    public GearMotor getGm() {
        return gm;
    }

    public Sensor getSn() {
        return sn;
    }

    public double getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(double moveSpeed) {
        this.moveSpeed = 0;
        if (moveSpeed >= MIN_SPEED && moveSpeed <= MAX_SPEED) {
            this.moveSpeed = moveSpeed;
        }
    }

    public int getSetFrenquency() {
        return setFrenquency;
    }

    public void setSetFrenquency(int moveSpeed) {
        setMoveSpeed(moveSpeed);
        this.setFrenquency = (int) (((getMoveSpeed() * SEC_IN_MIN * gm.getGearRatioReducer()) / bs.getStepScrew()) / 30);
    }

    public int getSetCoordinate() {
        return setCoordinate;
    }

    public void setSetCoordinate(int setCoordinate) {
        this.setCoordinate = 0;
        if (setCoordinate >= MIN_COORDINATE && setCoordinate <= MAX_COORDINATE) {
            this.setCoordinate = setCoordinate;
        }
    }

    public int getCurrentCoordinate() {
        return currentCoordinate;
    }

    public void movement(int setCoordinate, int moveSpeed) { // Метод для движения в заданную координату с заданной скоростью.
        int directionOfRotation;
        setSetCoordinate(setCoordinate);
        setSetFrenquency(moveSpeed);
        if (getSetCoordinate() > getCurrentCoordinate()) {
            directionOfRotation = 1;
            gm.Rotation(getSetFrenquency(), directionOfRotation);
            while (currentCoordinate != setCoordinate) {
                if (enc.getNumberOfRevolution() * bs.getStepScrew() != getMoveSpeed()) {
                    System.out.println("Проблема с движение проверьте энкодер");
                    gm.setWithBrake(true);
                    break;
                }
                currentCoordinate += (int) getMoveSpeed();
                gm.setWithBrake(true);
            }
        } else {
            directionOfRotation = -1;
            gm.Rotation(getSetFrenquency(), directionOfRotation);
            while (currentCoordinate != setCoordinate) {
                if (enc.getNumberOfRevolution() * bs.getStepScrew() != getMoveSpeed()) {
                    System.out.println("Проблема с движение проверьте энкодер");
                    gm.setWithBrake(true);
                    break;
                }
                currentCoordinate -= (int) getMoveSpeed();
                gm.setWithBrake(true);
            }
        }
    }
}
