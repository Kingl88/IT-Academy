// Даны натуральное число n и вещественные числа a1, a2, ..., an.
// Определить среднее арифметическое вещественных чисел.
package Academy.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5_51 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.random()*10; // Случайное число от 0 до 10
        }
        System.out.printf("Среднее арифметическое чисел равно %.2f", sum / n);
        reader.close();
    }
}
