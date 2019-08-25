package by.it_academy.Lesson12.train_schedule;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Station {
    private String country;
    private String station;
    private ZonedDateTime arrival;
    private LocalTime trainStop;
    private ZonedDateTime departure;
    private int kilometrage;
    private LocalDateTime travelTime;

    public Station(String country, String station, ZonedDateTime arrival, LocalTime trainStop, ZonedDateTime departure, int kilometrage, LocalDateTime travelTime) {
        this.country = country;
        this.station = station;
        this.arrival = arrival;
        this.trainStop = trainStop;
        this.departure = departure;
        this.kilometrage = kilometrage;
        this.travelTime = travelTime;
    }

    public String getCountry() {
        return country;
    }

    public String getStation() {
        return station;
    }

    public ZonedDateTime getArrival() {
        return arrival;
    }

    public LocalTime getTrainStop() {
        return trainStop;
    }

    public ZonedDateTime getDeparture() {
        return departure;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public LocalDateTime getTravelTime() {
        return travelTime;
    }

    @Override
    public String toString() {
        return  country + "\t\t" + station + "\t\t" + ((arrival == null) ? "     ": arrival.format(DateTimeFormatter.ofPattern("HH:mm")))
                + "\t\t" + ((trainStop == null) ? "     ": trainStop.format(DateTimeFormatter.ofPattern("m"))) + "\t\t"
                + ((departure == null) ? "     ": departure.format(DateTimeFormatter.ofPattern("HH:mm"))) + "\t\t" + kilometrage + "км" + "\t\t"
                + ((travelTime == null) ? "     ": travelTime.format(DateTimeFormatter.ofPattern("Hчmмин")));
    }
}
