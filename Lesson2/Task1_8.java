package Academy.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Integer.parseInt(reader.readLine()) + " " + Integer.parseInt(reader.readLine())
                + " " + Integer.parseInt(reader.readLine()) + " " + Integer.parseInt(reader.readLine()));
        reader.close();
    }
}