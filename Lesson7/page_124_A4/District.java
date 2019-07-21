package by.it_academy.Lesson7._124_a_4;

import java.util.ArrayList;
import java.util.Arrays;

public class District {

    private ArrayList<City> city = new ArrayList<>();;
    private String nameDistrict;

    public District(String nameDistrict) {
        this.nameDistrict = nameDistrict;
    }
    public void setCity(String nameCity, boolean isCapital, boolean isRegionalCentr) {
        this.city.add(new City(nameCity, isCapital, isRegionalCentr));
    }
    public ArrayList<City> getCity() {
        return city;
    }

    public void setCity(ArrayList<City> city) {
        this.city = city;
    }

    public String getNameDistrict() {
        return nameDistrict;
    }

    public void setNameDistrict(String nameDistrict) {
        this.nameDistrict = nameDistrict;
    }

    @Override
    public String toString() {
        return nameDistrict + " район " + "\n Количесвто городов " + city.size() + "\n" + Arrays.toString(city.toArray());
    }
}
