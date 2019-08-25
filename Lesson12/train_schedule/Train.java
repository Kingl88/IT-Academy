package by.it_academy.Lesson12.train_schedule;

import java.util.ArrayList;

public class Train {
    private int id;
    private ArrayList<Station> stations;

    public Train(int id, ArrayList<Station> stations) {
        this.id = id;
        this.stations = stations;
    }
}
