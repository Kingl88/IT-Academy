package by.it_academy.Lesson12;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class BirthDay {
    public static void main(String[] args) {
        birthDay();
    }

    private static void birthDay() {
        Locale locale = Locale.getDefault();
        LocalDate myBirthDay = LocalDate.of(1988, Month.AUGUST, 7);
        for (int i = 0; i < 81; i++) {
           String dow = myBirthDay.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
            System.out.printf("%s:%s\n", myBirthDay.getYear(), dow.substring(0, 1).toUpperCase() + dow.substring(1));
           myBirthDay = myBirthDay.plusYears(1);

        }
    }
}
