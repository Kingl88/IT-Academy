package Academy.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число x = ");
        int number =Integer.parseInt(reader.readLine());
        System.out.println("Вы ввели число " + number);
        reader.close();
    }
}