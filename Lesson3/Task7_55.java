//В компьютер по очереди поступают результаты спортсменов-участников соревнований по лыжным гонкам,
// уже пришедших к финишу (время, затраченное на прохождение дистанции гонки).
// Выводить на экран лучший результат после ввода результата очередного спортсмена.
package Academy.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7_55 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int time = 0; // Условно примем то, что значения времени финиша записывается с помощью int.
        for (int i = 0; i < 10; i++) { // Будем счиать что всего 10 спортсменов.
            int temp = Integer.parseInt(reader.readLine());
            if(temp > time){
                time = temp;
                System.out.println("Лучшее время равно " + time);
            } else {
                System.out.println("Лучшее время равно " + time);
            }
        }
        reader.close();
    }
}
