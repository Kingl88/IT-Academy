package Academy.Lesson2;

public class Task1_60 {
    public static void main(String[] args) {
        int a = 4, b = 7, c = 1;
        System.out.printf("Значения a = %d, b = %d, c = %d\n", a ,b ,c);
        b = c;
        a = b;
        c = a;
        System.out.printf("Значения после присвоений №1 a = %d, b = %d, c = %d\n", a ,b ,c);
        a = 4;
        b = 7;
        c = 1;
        System.out.printf("Значения a = %d, b = %d, c = %d\n", a ,b ,c);
        b = a;
        c = b;
        a = c;
        System.out.printf("Значения после присвоений №2 a = %d, b = %d, c = %d\n", a ,b ,c);
    }
}
