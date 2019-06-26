package Academy.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4_85 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число x = ");
        int x = Integer.parseInt(reader.readLine());
        int y;
        if(x < -1){
            y = -1;
            System.out.printf("При x = %d функция y = %d", x, y);
        } else{
            if(x > -1){
                y = x;
                System.out.printf("При x = %d функция y = %d", x, y);
            } else{
                if(x == -1){
                    y = 1;
                    System.out.printf("При x = %d функция y = %d", x, y);
                }
            }
        }
        reader.close();
    }
}
