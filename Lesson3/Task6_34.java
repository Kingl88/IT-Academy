// Найти 15 первых натуральных чисел, делящихся нацело на 19 и находящихся в интервале, левая граница которого равна 100.
package Academy.Lesson3;

public class Task6_34 {
    public static void main(String[] args) {
        int count = 1;
        int i = 100;
        while (count <= 15){
            if(i%19 == 0) {
                System.out.printf("%d число кратное 19 равно %d\n", count, i);
                count++;
            }
            i++;
        }
    }
}
