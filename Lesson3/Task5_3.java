package Academy.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5_3 {
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        while (flag) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nВведите номер вариант от 1 до 4");
            int n = Integer.parseInt(reader.readLine());
            switch (n) {
                case 1: {
                    for (int i = 25; i < 36; i++) {
                        System.out.println(i);
                    }
                }
                    break;
                case 2: {
                    int b;
                    do {
                        System.out.println("Введите число b");
                        b = Integer.parseInt(reader.readLine());
                        if(b >= 10) {
                            for (int i = 0; i <= b; i++) {
                                System.out.println((int)(Math.pow(i, 2)));
                            }
                        } else {
                            System.out.println("Повторите ввод значения b");
                        }
                    } while (b < 10);
                }
                    break;
                case 3: {
                    int a;
                    do {
                        System.out.println("Введите число a");
                        a = Integer.parseInt(reader.readLine());
                        if(a <= 50 && a > 0) {
                            for (int i = a; i <= 50; i++) {
                                System.out.println((int)(Math.pow(i, 3)));
                            }
                        } else {
                            System.out.println("Повторите ввод значения a");
                        }
                    } while (a > 50 || a < 0);
                }
                    break;
                case 4: {
                    int a;
                    int b;
                    do {
                        System.out.println("Введите число a");
                        a = Integer.parseInt(reader.readLine());
                        System.out.println("Введите число b");
                        b = Integer.parseInt(reader.readLine());
                        if(b >= a) {
                            for (int i = a; i <= b; i++) {
                                System.out.println(i);
                            }
                        } else {
                            System.out.println("Повторите ввод значения a и b");
                        }
                    } while (a > b);
                }
                    break;
                case 0:
                    System.out.println("Программа завершена");
                    flag = false;
                    reader.close();
                    break;
                default:
                    System.out.println("Повторите ввод от 1 до 4");
            }
        }
    }
}
