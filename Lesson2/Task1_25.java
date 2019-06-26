package Academy.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_25 {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите размер стороны квадрата = ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sideOfSquare = Integer.parseInt(reader.readLine());
        int perimeter = sideOfSquare*4;
        System.out.println("Периметр квадрата равен " + perimeter);
        reader.close();
    }
}
