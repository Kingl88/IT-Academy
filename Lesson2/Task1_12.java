package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        int v = Integer.parseInt(reader.readLine());
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        System.out.println("5 10" + "\t100 " + t + "\t" + x + " 25" + "\n7 см" + "\t1949 " + v + "\t" + x +" " + y);
    }
}