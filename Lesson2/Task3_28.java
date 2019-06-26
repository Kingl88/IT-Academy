package Academy.Lesson2;

public class Task3_28 {
    public static void main(String[] args) {
        int A = 77, B = 32, C = 32;
        System.out.println("Каждое из чисел А и В больше 100 = " + (A > 100 && B > 100));
        System.out.println("Только одно из чисел А и В четное = " + ((A%2 == 0) ^ (B%2 == 0)));
        System.out.println("Хотя бы одно из чисел А и В положительно = " + (A > 0 || B > 0));
        System.out.println("каждое из чисел А, В, С кратно трем = " + (A%3 == 0 && B%3 == 0 && C%3 == 0));
        System.out.println("Только одно из чисел А, В и С меньше 50 = "
                + ((A < 50 && B > 50 && C > 50) || (A > 50 && B < 50 && C > 50) || (A > 50 && B > 50 && C < 50)));
        System.out.println("Хотя бы одно из чисел А, В, С отрицательно = " + (A < 0 || B < 0 || C < 0));
    }
}
