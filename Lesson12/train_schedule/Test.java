package by.it_academy.Lesson12.train_schedule;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Station> stations = new ArrayList<>();
        LocalDateTime departureStart = LocalDateTime.of(Year.now().getValue(), YearMonth.now().getMonth(), MonthDay.now().getDayOfMonth() + 1, 10, 17);
        ZonedDateTime arrival;
        LocalTime trainStop;
        stations.add(new Station("Россия", "Москва Белорусская", null, null, ZonedDateTime.of(departureStart, ZoneId.of("Europe/Moscow")), 0, null));

        stations.add(new Station("Россия", "Смоленск Центральный", arrival = getArrival(departureStart, "Europe/Moscow", 4, 21),
                trainStop = LocalTime.of(0, 2), arrival.plusMinutes(trainStop.getMinute()), 419, getTravelTime(departureStart, arrival)));

        stations.add(new Station("Белоруссия", "Орша-Центральная", arrival = getArrival(departureStart, "Europe/Minsk", 5, 31),
                trainStop = LocalTime.of(0, 15), arrival.plusMinutes(trainStop.getMinute()), 538, getTravelTime(departureStart, arrival)));

        stations.add(new Station("Белоруссия", "Минск-Пасс.", arrival = getArrival(departureStart, "Europe/Minsk", 7, 54),
                trainStop = LocalTime.of(0, 13), arrival.plusMinutes(trainStop.getMinute()), 750, getTravelTime(departureStart, arrival)));

        stations.add(new Station("Белоруссия", "Брест-Центральный", arrival = getArrival(departureStart, "Europe/Minsk", 11, 16),
                trainStop = LocalTime.of(0, 10), arrival.plusMinutes(trainStop.getMinute()), 1095, getTravelTime(departureStart, arrival)));

        stations.add(new Station("Польша", "Тересполь", arrival = getArrival(departureStart, "Poland", 12, 6),
                trainStop = LocalTime.of(0, 45), arrival.plusMinutes(trainStop.getMinute()), 1102, getTravelTime(departureStart, arrival)));

        stations.add(new Station("Польша", "Варшава Всходня", arrival = getArrival(departureStart, "Poland", 14, 32),
                trainStop = LocalTime.of(0, 20), arrival.plusMinutes(trainStop.getMinute()), 1311, getTravelTime(departureStart, arrival)));

        stations.add(new Station("Польша", "Познань-Главная", arrival = getArrival(departureStart, "Poland", 19, 15),
                trainStop = LocalTime.of(0, 3), arrival.plusMinutes(trainStop.getMinute()), 1495, getTravelTime(departureStart, arrival)));

        stations.add(new Station("Польша", "Жепин", arrival = getArrival(departureStart, "Poland", 20, 32),
                trainStop = LocalTime.of(0, 3), arrival.plusMinutes(trainStop.getMinute()), 1651, getTravelTime(departureStart, arrival)));

        stations.add(new Station("Германия", "Франкфурт-на-Одере", arrival = getArrival(departureStart, "Europe/Berlin", 20, 55),
                trainStop = LocalTime.of(0, 3), arrival.plusMinutes(trainStop.getMinute()), 1674, getTravelTime(departureStart, arrival)));

        stations.add(new Station("Германия", "Берлин Остбанхов", arrival = getArrival(departureStart, "Europe/Berlin", 22, 0),
                null, null, 1784, getTravelTime(departureStart, arrival)));

        System.out.printf("%10s%25s%20s%20s%20s%20s%20s%n", "Страна", "Станция", "Время прибытия", "Время стоянки", "Время отправления", "Расстояние", "Время в пути");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        for (Station st : stations) {
            System.out.printf("%10s%25s%20s%20s%20s%20dкм%20s%n", st.getCountry(), st.getStation(), ((st.getArrival() == null) ? "" : (st.getArrival().format(DateTimeFormatter.ofPattern("HH:mm")))),
                    ((st.getTrainStop() == null) ? "" : st.getTrainStop().format(DateTimeFormatter.ofPattern("mмин"))),
                    ((st.getDeparture() == null) ? "" : st.getDeparture().format(DateTimeFormatter.ofPattern("HH:mm"))), st.getKilometrage(),
                    ((st.getTravelTime() == null) ? "" : st.getTravelTime().format(DateTimeFormatter.ofPattern("Hчmмин"))));
        }
    }

    private static ZonedDateTime getArrival(LocalDateTime departureStart, String s, int hours, int minutes) {
        return ZonedDateTime.of(departureStart, ZoneId.of("Europe/Moscow")).withZoneSameInstant(ZoneId.of(s)).plusHours(hours).plusMinutes(minutes);
    }

    private static LocalDateTime getTravelTime(LocalDateTime departureStart, ZonedDateTime arrival) {
        return arrival.withZoneSameInstant(ZoneId.of("Europe/Moscow")).toLocalDateTime().minusMinutes(departureStart.getMinute()).minusHours(departureStart.getHour());
    }
}
