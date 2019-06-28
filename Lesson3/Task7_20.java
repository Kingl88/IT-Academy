//Даны натуральное число n и целые числа a1, a2, ..., an .Получить:
// а) a1-a2+a3- ...;
// б) a1+an;
// в) a1-a2.
package Academy.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7_20 {
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        while (flag) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nВведите номер вариант от 1 до 3");
            int n = Integer.parseInt(reader.readLine());
            switch (n) {
                case 1: {
                    System.out.println("\nКоличество целых чисел");
                    int number = Integer.parseInt(reader.readLine());
                    int i = 0;
                    int sum = 0;
                    while (i != number) {
                        if (i % 2 == 0) {
                            sum += (int) (Math.random() * 100);
                        } else {
                            sum -= (int) (Math.random() * 100);
                        }
                        i++;
                    }
                    System.out.println("Сумма равна " + sum);
                }
                break;
                case 2: {
                    System.out.println("\nКоличество целых чисел");
                    int number = Integer.parseInt(reader.readLine());
                    int i = 0;
                    int sum = 0;
                    do {
                        if (i == 0) {
                            sum += (int) (Math.random() * 100);
                        }
                        if (i == number) {
                            sum += (int) (Math.random() * 100);
                        }
                        i++;
                    } while (i != number);
                    System.out.println("Сумма равна " + sum);
                }
                break;
                case 3: {
                    System.out.println("\nКоличество целых чисел");
                    int number = Integer.parseInt(reader.readLine());
                    int i = 0;
                    int sum = 0;
                    do {
                        if (i == 0) {
                            sum += (int) (Math.random() * 100);
                        }
                        if (i == 1) {
                            sum -= (int) (Math.random() * 100);
                            break;
                        }
                        i++;
                    } while (i != number);
                    System.out.println("Сумма равна " + sum);
                }
                break;
                case 0:
                    System.out.println("Программа завершена");
                    flag = false;
                    reader.close();
                    break;
                default:
                    System.out.println("Повторите ввод от 1 до 2");
            }
        }
    }
}
