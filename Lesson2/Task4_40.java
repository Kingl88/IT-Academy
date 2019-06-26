package Academy.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4_40 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число x = ");
        double x = Double.parseDouble(reader.readLine());
        double f;
        if(x >= -2.4 && x <= 5.7){
            f = Math.pow(x, 2);
        } else{
            f = 4;
        }
        System.out.printf("При x = %.2f функция f = %.2f", x, f);
        reader.close();
    }
}
