package Academy.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите значение x = ");
        int x = Integer.parseInt(reader.readLine());
        int y;

        /* Вариант а*/

        if(x >= 2){
            y = 2;
        } else {
            y = x;
        }
        System.out.printf("Вариант а) y = %d\n", y);

        /*Вариант б*/

        if(x <= 3){
            y = -x;
        } else {
            y = -3;
        }
        System.out.printf("Вариант б) y = %d", y);

        reader.close();
    }
}
