package Academy.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4_21 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите целое число а = ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите целое число b = ");
        int b = Integer.parseInt(reader.readLine());
        if(b%a == 0){
            System.out.printf("Число a = %d является делителем числа b = %d", a, b);
        } else{
            System.out.printf("Число a = %d неявляется делителем числа b = %d", a, b);
        }
        reader.close();
    }
}
