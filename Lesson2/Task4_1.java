package Academy.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите значение x = ");
        int x = Integer.parseInt(reader.readLine());
        double y;
        if(x > 0){
            y = Math.pow(Math.sin(x), 2);
        } else{
            y = 1 - Math.sin(Math.pow(x, 2));
        }
        System.out.printf("y = %.2f", y);
        reader.close();
    }
}
