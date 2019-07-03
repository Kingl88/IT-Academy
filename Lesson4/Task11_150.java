package Academy.Lesson4;

import java.util.Arrays;

public class Task11_150 {
    public static void main(String[] args) {
        int[] product = new int[20];
        for (int i = 0; i < product.length; i++) {
            product[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(product));
        int n = 6;
        for (int i = 0; i < product.length; i++) {
            if(i >= n && i < product.length - 1) {
                product[i] = product[i + 1];
            }
            if(i == product.length - 1){
                product[i] = 0;
            }
        }
        System.out.println(Arrays.toString(product));
    }
}
