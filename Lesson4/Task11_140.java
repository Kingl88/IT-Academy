package Academy.Lesson4;

import java.util.Arrays;

public class Task11_140 {
    static int min_temp1;
    static int min_temp2;
    static int dayOne = 1;
    static int dayTwo = 2;

    static void Exchange() {
        if (min_temp1 > min_temp2) {
            int tempday = dayOne;
            dayOne = dayTwo;
            dayTwo = tempday;
            int temp = min_temp1;
            min_temp1 = min_temp2;
            min_temp2 = temp;
        }
    }

    public static void main(String[] args) {
        int[] february = new int[28];
        for (int i = 0; i < february.length; i++) {
            february[i] = -20 + (int) (Math.random() * 30);
        }
        min_temp1 = february[0];
        min_temp2 = february[1];
        Exchange();
        for (int i = 2; i < february.length; i++) {
            if (min_temp2 > february[i]) {
                min_temp2 = february[i];
                dayTwo = i + 1;
                Exchange();
            }
        }
        System.out.println(Arrays.toString(february));
        System.out.printf("В феврале самые два холодные дня были %d и %d числа, равные %d и %d соответственно", dayOne, dayTwo, min_temp1, min_temp2);
    }
}
