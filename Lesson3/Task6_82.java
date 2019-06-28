// Дано натуральное число. Определить, является ли разность его максимальной и минимальной цифр четным числом.
package Academy.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6_82 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        int number = Integer.parseInt(reader.readLine());
        int max = 0;
        int min = 9;
        while(number != 0) {
            if(number%10 > max) {
                max = number%10;
            }
            if(number%10 < min) {
                min = number%10;
            }
            number /= 10;
        }
        if((max - min)%2 == 0) {
            System.out.printf("Максимальная цифра %d, минимальная цифра %d, разность max и min равна %d, разность кратна 2", max, min, max - min);
        } else {
            System.out.printf("Максимальная цифра %d, минимальная цифра %d, разность max и min равна %d, разность не кратна 2", max, min, max - min);
        }
        reader.close();
    }
}
