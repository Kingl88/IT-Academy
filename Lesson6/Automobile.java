package by.it_academy.Lesson6;

public abstract class Automobile {
    Engine en;
    Transmission tr;
    private String color;
    private String driveType;
    private int numberOfWheel;

    public Automobile(Engine en, Transmission tr, String color, String driveType, int numberOfWheel) {
        this.en = en;
        this.tr = tr;
        this.color = color;
        this.driveType = driveType;
        this.numberOfWheel = numberOfWheel;
    }

    public void MoveForward(){}
    public void MoveBackward(){}

}
