package by.it_academy.Lesson7._126_b_4;

import java.util.ArrayList;

public class Salad {
    private ArrayList<Vegetable> vegetables;
    private String nameSalad;

    public Salad(String nameSalad, ArrayList<Vegetable> vegetables) {
        this.vegetables = vegetables;
        this.nameSalad = nameSalad;
    }

    public String getNameSalad() {
        return nameSalad;
    }

    public void setNameSalad(String nameSalad) {
        this.nameSalad = nameSalad;
    }

    public ArrayList<Vegetable> getVegetables() {
        return vegetables;
    }

    public void calories() {
        int sum = 0;
        for(Vegetable vegetable : vegetables) {
            sum += vegetable.getCalories();
        }
        System.out.println("Калорийность салата \"" + getNameSalad() + "\" равна " + sum + " калорий.");
    }

    public void sort() {
        ArrayList<Vegetable> veg = vegetables;
        for (int i = 0; i < veg.size(); i++) {
            for (int j = i + 1; j < veg.size(); j++) {
                if(veg.get(i).getCalories() < veg.get(j).getCalories()) {
                    Vegetable temp = vegetables.get(i);
                    veg.set(i, veg.get(j));
                    veg.set(j, temp);
                }
            }
        }
        for (Vegetable v: vegetables) {
            System.out.println(v);
        }
    }

    public void find(int min, int max) {
        for (Vegetable veg: vegetables) {
            if(veg.getCalories() > min && veg.getCalories() < max) {
                System.out.println(veg);
            }
        }
    }
}
