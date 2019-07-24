package by.it_academy.Lesson7._124_a_4;

import java.util.ArrayList;
import java.util.Arrays;

public class District extends Territory {

    private ArrayList<City> city = new ArrayList<>();;

    public District(String nameDistrict) {
        super(nameDistrict);
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

    @Override
    public String toString() {
        return getName() + " район " + "\n Количесвто городов " + city.size() + "\n" + Arrays.toString(city.toArray());
    }
}
