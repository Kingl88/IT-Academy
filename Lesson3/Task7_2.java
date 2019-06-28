// Вывести на экран все целые числа от a до b, кратные некоторому числу c.
package Academy.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число a = ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите число b = ");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("Введите число c = ");
        int c = Integer.parseInt(reader.readLine());
        if(b > a) {
            for (int i = a; i <= b; i++) {
                if(i%c == 0)
                    System.out.println(i);
            }
        } else {
            System.out.println("Неверный ввод, a должно быть меньше b");
        }
    }
}
