package Academy.Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task11_53 {

    public static void ReplaceNumbers(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]%10 == 0) {
                mass[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mass));
    }

    public static void EvenOdd(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]%2 == 0) {
                mass[i] /= 2;
            } else {
                mass[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(mass));
    }

    public static void IncreaseDecrease(int[] mass, BufferedReader reader) throws IOException {
        System.out.println("Введите значение n");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Введите значение m");
        int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]%2 != 0) {
                mass[i] -= m;
            }
            if(i%2 !=0) {
                mass[i] += n;
            }
        }
        System.out.println(Arrays.toString(mass));
    }

    public static void main(String[] args) throws IOException {
        boolean flag = true;
        while (flag) {
            int[] mass = new int[20];
            for (int i = 0; i < mass.length; i++) {
                mass[i] = (int) (Math.random() * 50);
            }
            System.out.println("Дан массив целых чисел. " + Arrays.toString(mass) +
                    "\nа) Все элементы, кратные числу 10, заменить нулем.\n" +
                    "б) Все нечетные элементы удвоить, а четные уменьшить вдвое.\n" +
                    "в) Нечетные элементы уменьшить на m, а элементы с нечетными номерами\n" +
                    "увеличить на n");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nВведите номер вариант от 1 до 3");
            int n = Integer.parseInt(reader.readLine());
            switch (n) {
                case 1:
                    ReplaceNumbers(mass);
                    break;
                case 2:
                    EvenOdd(mass);
                    break;
                case 3:
                    IncreaseDecrease(mass, reader);
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
