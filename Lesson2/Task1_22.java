package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_22 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double y;
        int x = Integer.parseInt(reader.readLine());
        y = 7 * Math.pow(x, 2) - 3 * x + 6;
        System.out.printf("%.2e", y);
    }
}
