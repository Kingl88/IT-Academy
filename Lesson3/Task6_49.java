// Дано натуральное число. Определить:
// а) есть ли в нем цифра 3;
// б) есть ли в нем цифры 2 и 5.
package Academy.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6_49 {
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        while (flag) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nВведите номер вариант от 1 до 2");
            int n = Integer.parseInt(reader.readLine());
            switch (n) {
                case 1: {
                    System.out.println("Введите натуральное число");
                    int number = Integer.parseInt(reader.readLine());
                    int temp = number;
                    int i = 0;
                    while (temp != 0) {
                        if (temp % 10 == 3) {
                            i++;
                            System.out.printf("В числе %d есть цифра 3", number);
                            break;
                        }
                        temp /= 10;
                    }
                    if (i == 0) {
                        System.out.printf("В числе %d нет цифры 3", number);
                    }
                }
                break;
                case 2: {
                    System.out.println("Введите натуральное число");
                    int number = Integer.parseInt(reader.readLine());
                    int temp = number;
                    int i2 = 0;
                    int i5 = 0;
                    while (temp != 0) {
                        if (temp % 10 == 2) {
                            i2 = 1;
                        }
                        if(temp % 10 == 5) {
                            i5 = 1;
                        }
                        temp /= 10;
                    }
                    if (i2 + i5 == 2) {
                        System.out.printf("В числе %d есть цифры 2 и 5", number);
                    } else {
                        System.out.printf("В числе %d нет цифр 2 и 5", number);
                    }
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
