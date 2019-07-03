package Academy.Lesson4;

import java.util.Arrays;

public class Task11_101 {
    public static void main(String[] args) {
        int[] mass= new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random()*40);
        }
        System.out.println(Arrays.toString(mass));
        boolean flag = true;

        int count_number = 0;
        int number = 0;
        for (int i = 0; i < mass.length; i++) {
            int count = 0;
            for (int j = i + 1; j < mass.length; j++) {
                if(mass[i] == mass[j]) {
                    count++;
                }
                if(count == 1) {
                    number = mass[i];
                    flag = false;
                    count_number++;
                    break;
                }
            }
        }
        if(count_number == 1) {
            System.out.println("В массиве имеется только 2 одинаковых элемента равные " + number + ".");
        }
        if(flag){
            System.out.println("Элементов встречающихся два раза в массиве нету.");
        }
    }
}
