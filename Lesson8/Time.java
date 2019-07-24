package by.it_academy.Lesson8;

import java.util.Date;

public class Time {
    public static void main(String[] args) {
        long startTimer1 = System.nanoTime();
        String str = "Hi";
        for (int i = 0; i < 100000; i++) {
            str += "Hi";
        }
        long endTimer1 = System.nanoTime();
        long Timer1 = endTimer1 - startTimer1;
        System.out.println("Timer1 = " + Timer1);
        long startTimer2 = System.nanoTime();
        StringBuilder str1 = new StringBuilder("Hi");
        for (int i = 0; i < 100000; i++) {
            str1.append("Hi");
        }
        long endTimer2 = System.nanoTime();
        long Timer2 = endTimer2 - startTimer2;
        System.out.println("Timer2 = " + Timer2);
        System.out.println("Скорость выполнения append выше в " + Timer1/Timer2 + " раз.");
    }
}
