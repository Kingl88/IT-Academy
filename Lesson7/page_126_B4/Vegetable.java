package by.it_academy.Lesson7._126_b_4;

import java.util.Objects;

public class Vegetable {

    private String name;
    private int caloriesInHundredGrams;
    private int gramms;
    private int calories;

    public Vegetable(String name, int caloriesInHundredGrams, int gramms) {
        setName(name);
        setCaloriesInHundredGrams(caloriesInHundredGrams);
        setGramms(gramms);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCaloriesInHundredGrams() {
        return caloriesInHundredGrams;
    }

    private void setCaloriesInHundredGrams(int caloriesInHundredGrams) {
        if(caloriesInHundredGrams >= 0) {
            this.caloriesInHundredGrams = caloriesInHundredGrams;
        }
    }

    public int getGramms() {
        return gramms;
    }

    public void setGramms(int gramms) {
        this.gramms = gramms;
        calories = (gramms * caloriesInHundredGrams) / 100;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable vegetable = (Vegetable) o;
        return caloriesInHundredGrams == vegetable.caloriesInHundredGrams &&
                gramms == vegetable.gramms &&
                calories == vegetable.calories &&
                Objects.equals(name, vegetable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, caloriesInHundredGrams, gramms, calories);
    }

    @Override
    public String toString() {
        return "Название овоща='" + name + '\'' +
                ", калорийность в 100 граммах=" + caloriesInHundredGrams +
                ", количество грамм в салате=" + gramms +
                ", каллорийность в салате=" + calories +
                '}';
    }
}
