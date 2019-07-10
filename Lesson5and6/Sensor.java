package by.it_academy.Lesson5;

public class Sensor {
    private boolean isOn;

    public boolean getIsOn() {
        return isOn;
    }

    public void sensorOn() {
        isOn = true;
    }

    public void sensorOff() {
        isOn = false;
    }
}
