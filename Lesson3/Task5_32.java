package Academy.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5_32 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        double sum = 0;
        for (int i = 1; i < n; i++) {
            sum += 1 / (double)i;
        }
        System.out.printf("Сумма равна = %.3f", sum);
        reader.close();
    }
}
