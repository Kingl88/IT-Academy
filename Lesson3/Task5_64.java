// В области 12 районов. Известны количество жителей (в тысячах человек)  и площадь (в км2) каждого района.
// Определить среднюю плотность населения по области в целом
package Academy.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5_64 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double populationDensity = 0;
        for (int i = 0; i < 12; i++) {
            System.out.printf("Введите количество людей в районе №%d = ", i + 1);
            double numberOfPeople = Double.parseDouble(reader.readLine());
            populationDensity += numberOfPeople / (Math.random()*10);
        }
        System.out.printf("Средняя плотность населения по области равна %.2f", populationDensity / 12);
        reader.close();
    }
}
