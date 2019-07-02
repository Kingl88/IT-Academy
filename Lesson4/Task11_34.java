package com.Lesson4;

public class Task11_34 {
    public static void main(String[] args) {
        int[] mounth = new int[31];
        for (int i = 0; i < mounth.length; i++) {
            mounth[i] = (int)(Math.random()*100);
        }
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < mounth.length; i++) {
            if(i < mounth.length/2) {
                sum1 += mounth[i];
            } else {
                sum2 += mounth[i];
            }
        }
        if(sum1 > sum2) {
            System.out.println("Больше осадков выпало в первую половину месяца.");
        } else {
            System.out.println("Больше осадков выпало во вторую половину месяца.");
        }

        int sum_dec = 0;
        int dec = 0;
        int[] decada;
        if(mounth.length > 30) {
            decada = new int[mounth.length/10 + 1];
        } else {
            decada = new int[mounth.length/10];
        }

        for (int i = 1; i <= mounth.length; i++) {
            sum_dec += mounth[i - 1];
            if(i%10 == 0) {
                decada[dec] = sum_dec;
                sum_dec = 0;
                dec++;
            }
            if(mounth.length > 29) {
                decada[dec] = sum_dec;
            }
        }

        int max = decada[0];
        int period = 1;
        for (int i = 1; i < decada.length; i++) {
            if(max < decada[i]) {
                max = decada[i];
                period = i + 1;
            }
        }
        System.out.println("Максимальное количество осадков равно " + max + " выпали в " + period + " декаде месяца");
    }
}
