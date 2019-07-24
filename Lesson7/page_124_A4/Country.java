package by.it_academy.Lesson7._124_a_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Country extends Territory {

    private ArrayList<Region> regions = new ArrayList<>();

    public Country(String nameCountry) {
        super(nameCountry);
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(String nameRegion, double area) {
        this.regions.add(new Region(nameRegion, area));
    }

    public void theCapital() {
        for (Region reg : regions) {
            for (District dis : reg.getDistricts()) {
                for (City city : dis.getCity()) {
                    if (city.isCapital())
                        System.out.println("Столицей страны " + getName() + " является " + city);
                }
            }
        }
    }

    public void regionalCentre() {
        for (Region reg : regions) {
            for (District dis : reg.getDistricts()) {
                for (City city : dis.getCity()) {
                    if (city.isRegionalCentr())
                        System.out.println("Областным центром " + reg.getName() + " области является " + city);
                }
            }
        }
    }

    public void numberRegions() {
        System.out.println("Количество областей в стране " + getName() + " " + regions.size() + " шт.");
    }

    public void countryArea() {
        double sum = 0;
        for (Region reg : regions) {
            sum += reg.getArea();
        }
        System.out.println("Площадь страны " + getName() + " равна = " + sum + " километров квадратных");
    }
    public void addCity(String nameCity, BufferedReader reader, int i, int j) throws IOException {
        System.out.println("Город " + nameCity + " является областным центром " + regions.get(i).getName() + " да/нет");
        String temp = reader.readLine();
        if(temp.equals("да") && !getRegions().get(i).isRegionalCentr()) {
            getRegions().get(i).setRegionalCentr(true);
            getRegions().get(i).getDistricts().get(j).setCity(nameCity, true, true);
        } else {
            if(temp.equals("нет")) {
                getRegions().get(i).getDistricts().get(j).setCity(nameCity, true, false);
            }
        }
    }
    @Override
    public String toString() {
        return "Страна - " + getName() +
                "\n Количесвто областей " + regions.size() +
                "\n" + Arrays.toString(regions.toArray());
    }
}
