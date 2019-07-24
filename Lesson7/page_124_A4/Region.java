package by.it_academy.Lesson7._124_a_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Region extends Territory {

    private ArrayList<District> districts = new ArrayList<>();
    private double area;
    private boolean isRegionalCentr = false;

    public Region(String nameRegion, double area) {
        super(nameRegion);
        setArea(area);
    }

    public void setDistrict(String nameDistrict) {
        this.districts.add(new District(nameDistrict));
    }

    public boolean isRegionalCentr() {
        return isRegionalCentr;
    }

    public void setRegionalCentr(boolean regionalCentr) {
        isRegionalCentr = regionalCentr;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    @Override
    public String toString() {
        return getName() + " область" + "\n Количество районов " + districts.size() + "\n" + Arrays.toString(districts.toArray());
    }
}
