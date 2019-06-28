// Гражданин 1 марта открыл счет в банке, вложив 1000 руб.
// Через каждый месяц размер вклада увеличивается на 2% от имеющейся суммы. Определить:
// а) прирост суммы вклада за первый, второй, ..., десятый месяц;
// б) сумму вклада через три, четыре, ..., двенадцать месяцев.
package Academy.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5_71 {
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        while (flag) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nВведите номер вариант от 1 до 2");
            int n = Integer.parseInt(reader.readLine());
            switch (n) {
                case 1: {
                    double deposit = 1000;
                    double interestRate = 2;
                    for (int i = 0; i < 10; i++) {
                        System.out.printf("Прирост суммы вклада в %d месяц равняется %.3f\n", i + 1, deposit * 2 / 100);
                        deposit += deposit * 2 / 100;
                    }
                }
                break;
                case 2: {
                    double deposit = 1000;
                    double interestRate = 2;
                    for (int i = 0; i < 12; i++) {
                        deposit += deposit * 2 / 100;
                        if (i > 2) {
                            System.out.printf("Сумма вклада в %d месяце равняется %.3f\n", i + 1, deposit);
                        }
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
