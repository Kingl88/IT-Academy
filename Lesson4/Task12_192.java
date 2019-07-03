package Academy.Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task12_192 {

    public static void Left(int[][] mass) {
        int temp = mass[0][0];
        mass[0][0] = mass[mass.length - 1][0];
        mass[mass.length - 1][0] = temp;
        Print(mass);
    }

    public static void Right(int[][] mass) {
        int temp = mass[mass.length - 1][mass[0].length - 1];
        mass[mass.length - 1][mass[0].length - 1] = mass[0][mass[0].length - 1];
        mass[0][mass[0].length - 1] = temp;
        Print(mass);
    }

    public static void Print(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        while (flag) {
            System.out.println("Дан двумерный массив.");
            int[][] mass = new int[3][3];
            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < mass[i].length; j++) {
                    mass[i][j] = (int)(Math.random()*100);
                }
            }
            Print(mass);
            System.out.println(" Поменять местами элементы:\n" +
                    "  а) расположенные в левом верхнем и левом нижнем углах массива;\n" +
                    "  б) расположенные в правом нижнем и правом верхнем углах массива.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nВведите номер вариант от 1 до 2");
            int n = Integer.parseInt(reader.readLine());
            switch (n) {
                case 1:
                    Left(mass);
                    break;
                case 2:
                    Right(mass);
                    break;
                case 0:
                    System.out.println("Программа завершилась");
                    flag = false;
                    reader.close();
                    break;
                default:
                    System.out.println("Варианта с такоим номером не существует");
            }
        }
    }
}
