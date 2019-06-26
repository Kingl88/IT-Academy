package Academy.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_22 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        double y;
        int x = Integer.parseInt(reader.readLine());
        y = 7 * Math.pow(x, 2) - 3 * x + 6;
        System.out.printf("Вариант а) y = %.2e", y);
        y = 12 * Math.pow(x, 2) - 7 * x - 16;
        System.out.printf("\nВариант б) y = %.2e", y);
        reader.close();
    }
}