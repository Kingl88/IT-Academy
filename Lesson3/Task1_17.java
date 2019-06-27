package com.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import static java.lang.Math.*;

public class Task1_17 {
    public static void A(BufferedReader reader) throws IOException {
        System.out.print("Введите число x1 = ");
        int x1 = Integer.parseInt(reader.readLine());
        System.out.print("Введите число x2 = ");
        int x2 = Integer.parseInt(reader.readLine());
        System.out.printf("Значение выражения равно %.2f", sqrt(Math.pow(x1, 2) + pow(x2, 2)));
    }
    public static void B(BufferedReader reader) throws IOException {
        System.out.print("Введите число x1 = ");
        int x1 = Integer.parseInt(reader.readLine());
        System.out.print("Введите число x2 = ");
        int x2 = Integer.parseInt(reader.readLine());
        System.out.print("Введите число x3 = ");
        int x3 = Integer.parseInt(reader.readLine());
        System.out.printf("Значение выражения равно %d", x1*x2 + x1 * x3 + x2 * x3);
    }
    public static void C(BufferedReader reader) throws IOException {
        System.out.print("Введите число v0 = ");
        int v0 = Integer.parseInt(reader.readLine());
        System.out.print("Введите число t = ");
        int t = Integer.parseInt(reader.readLine());
        System.out.print("Введите число a = ");
        int a = Integer.parseInt(reader.readLine());
        System.out.printf("Значение выражения равно %.2f", (double)(v0 * t + (a * pow(t, 2))/2));
    }
    public static void D(BufferedReader reader) throws IOException {
        System.out.print("Введите число v = ");
        int v = Integer.parseInt(reader.readLine());
        System.out.print("Введите число m = ");
        int m = Integer.parseInt(reader.readLine());
        System.out.print("Введите число g = ");
        int g = Integer.parseInt(reader.readLine());
        System.out.print("Введите число h = ");
        int h = Integer.parseInt(reader.readLine());
        System.out.printf("Значение выражения равно %.2f", (m * pow(v, 2))/2 + m *g *h);
    }
    public static void E(BufferedReader reader) throws IOException {
        System.out.print("Введите число R1 = ");
        int R1 = Integer.parseInt(reader.readLine());
        System.out.print("Введите число R2 = ");
        int R2 = Integer.parseInt(reader.readLine());
        System.out.printf("Значение выражения равно %.2f", (double)(1.0 / R1 + 1.0 / R2));
    }
    public static void F(BufferedReader reader) throws IOException {
        System.out.print("Введите число m = ");
        int m = Integer.parseInt(reader.readLine());
        System.out.print("Введите число g = ");
        int g = Integer.parseInt(reader.readLine());
        System.out.print("Введите угол  = ");
        int a = Integer.parseInt(reader.readLine());
        PrintStream printf = System.out.printf("Значение выражения равно %.2f", m * g * cos(a));
    }
    public static void G(BufferedReader reader) throws IOException {
        System.out.print("Введите радиус R = ");
        int r = Integer.parseInt(reader.readLine());
        System.out.printf("Значение выражения равно %.2f", (double)(2 * PI * r));
    }
    public static void H(BufferedReader reader) throws IOException {
        System.out.print("Введите число a = ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите число b = ");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("Введите число c = ");
        int c = Integer.parseInt(reader.readLine());
        System.out.printf("Значение выражения равно %.2f", pow(b, 2) - 4 * a * c);
    }
    public static void I(BufferedReader reader) throws IOException {
        System.out.print("Введите число m1 = ");
        int m1 = Integer.parseInt(reader.readLine());
        System.out.print("Введите число m2 = ");
        int m2 = Integer.parseInt(reader.readLine());
        System.out.print("Введите число y = ");
        int y = Integer.parseInt(reader.readLine());
        System.out.print("Введите число r = ");
        int r = Integer.parseInt(reader.readLine());
        System.out.printf("Значение выражения равно %.2f", y * (m1 * m2) / (pow(r, 2)));
    }
    public static void J(BufferedReader reader) throws IOException {
        System.out.print("Введите число I = ");
        int i = Integer.parseInt(reader.readLine());
        System.out.print("Введите число R = ");
        int r = Integer.parseInt(reader.readLine());
        System.out.printf("Значение выражения равно %.2f", pow(i, 2) * r);
    }
    public static void K(BufferedReader reader) throws IOException {
        System.out.print("Введите число a = ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите число b = ");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("Введите число c = ");
        int c = Integer.parseInt(reader.readLine());
        System.out.printf("Значение выражения равно %.2f", a * b * sin(c));
    }
    public static void L(BufferedReader reader) throws IOException {
        System.out.print("Введите число a = ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите число b = ");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("Введите число c = ");
        int c = Integer.parseInt(reader.readLine());
        System.out.printf("Значение выражения равно %.2f", sqrt(pow(a, 2) + pow(b, 2) - 2 * a * b * cos(c)));
    }
    public static void M(BufferedReader reader) throws IOException {
        System.out.print("Введите число a = ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите число b = ");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("Введите число c = ");
        int c = Integer.parseInt(reader.readLine());
        System.out.print("Введите число d = ");
        int d = Integer.parseInt(reader.readLine());
        System.out.printf("Значение выражения равно %.2f", (double)(a * d + b * c) / (a * d));
    }
    public static void N(BufferedReader reader) throws IOException {
        System.out.print("Введите число x = ");
        int x = Integer.parseInt(reader.readLine());
        System.out.printf("Значение выражения равно %.2f", sqrt(1 - pow(sin(x), 2)));
    }
    public static void O(BufferedReader reader) throws IOException {
        System.out.print("Введите число a = ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите число b = ");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("Введите число c = ");
        int c = Integer.parseInt(reader.readLine());
        System.out.print("Введите число x = ");
        int x = Integer.parseInt(reader.readLine());
        System.out.printf("Значение выражения равно %.2f", 1 / (sqrt(a * pow(x, 2) + b * x + c)));
    }
    public static void P(BufferedReader reader) throws IOException {
        System.out.print("Введите число x = ");
        double x = Double.parseDouble(reader.readLine());
        System.out.printf("Значение выражения равно %.2f", (sqrt(x + 1) + sqrt(x - 1))/(2.0 * sqrt(x)));
    }
    public static void Q(BufferedReader reader) throws IOException {
        System.out.print("Введите число x = ");
        int x = Integer.parseInt(reader.readLine());
        System.out.printf("Значение выражения равно %.2f", (double)(abs(x) + abs(x + 1)));
    }
    public static void R(BufferedReader reader) throws IOException {
        System.out.print("Введите число x = ");
        int x = Integer.parseInt(reader.readLine());
        System.out.printf("Значение выражения равно %.2f", (double)(abs(1 - abs(x))));
    }

    public static void main(String[] args) throws IOException {
        boolean flag = true;
        while (flag){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nВведите номер вариант от 1 до 18");
            int n = Integer.parseInt(reader.readLine());
            switch (n){
                case 1:
                    A(reader);
                    break;
                case 2:
                    B(reader);
                    break;
                case 3: {
                    C(reader);
                    break;
                }
                case 4: {
                    D(reader);
                    break;
                }
                case 5: {
                    E(reader);
                    break;
                }
                case 6: {
                    F(reader);
                    break;
                }
                case 7: {
                    G(reader);
                    break;
                }
                case 8: {
                    H(reader);
                    break;
                }
                case 9: {
                    I(reader);
                    break;
                }
                case 10: {
                    J(reader);
                    break;
                }
                case 11: {
                    K(reader);
                    break;
                }
                case 12: {
                    L(reader);
                    break;
                }
                case 13: {
                    M(reader);
                    break;
                }
                case 14: {
                    N(reader);
                    break;
                }
                case 15: {
                    O(reader);
                    break;
                }
                case 16: {
                    P(reader);
                    break;
                }
                case 17: {
                    Q(reader);
                    break;
                }
                case 18: {
                    R(reader);
                    break;
                }
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
