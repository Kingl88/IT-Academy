// Странный муж.
package Academy.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5_38 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        double commonWay = 0;
        double wayAfterStop = 0;
        for (int i = 1; i < n; i++) {
            commonWay += 1 / (double)i;
            if(i%2 != 0) {
                wayAfterStop += 1 / (double)i;
            } else {
                wayAfterStop -= 1 / (double)i;
            }
        }
        System.out.printf("Путь пройденный человеком равен %.2f\n", commonWay);
        System.out.printf("Растояние от дома после остановки %.2f", wayAfterStop);
        reader.close();
    }
}
