package Academy.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_15 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число x = ");
        int x = Integer.parseInt(reader.readLine());
        System.out.print("Введите число a = ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите число b = ");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("Введите число c = ");
        int c = Integer.parseInt(reader.readLine());
        System.out.print("Введите число m = ");
        int m = Integer.parseInt(reader.readLine());
        System.out.print("Введите число n = ");
        int n = Integer.parseInt(reader.readLine());
        double res = ((-1)/(Math.pow(x, 2)));
        System.out.printf("Вариант а) результат = %.2f", res);
        res = a / (b * c);
        System.out.printf("\nВариант б) результат = %.2f", res);
        res = (a / b) * c;
        System.out.printf("\nВариант в) результат = %.2f", res);
        res = (a + b) / 2;
        System.out.printf("\nВариант г) результат = %.2f", res);
        res = 5.45 * ((a + 2 * b)/ (2 - a));
        System.out.printf("\nВариант д) результат = %.2f", res);
        res = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.printf("\nВариант е) результат = %.2f", res);
        res = (-b + 1 / a) / ( 2 / c);
        System.out.printf("\nВариант ж) результат = %.2f", res);
        res = 1 / (1 + ((a + b) / 2));
        System.out.printf("\nВариант з) результат = %.2f", res);
        res = 1/(1 + (1 / (2 + (1 / (2 + 3 / 5)))));
        System.out.printf("\nВариант и) результат = %.2f", res);
        res = Math.pow(2, Math.pow(m, n));
        System.out.printf("\nВариант к) результат = %.2f", res);
        reader.close();
    }
}