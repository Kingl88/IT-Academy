package com.Lesson4;

public class Task11_6 {
    public static void main(String[] args) {
        int[] mass = new int[12];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i + 1;
        }
        for (int i: mass) {
            System.out.println(i);
        }
    }
}
