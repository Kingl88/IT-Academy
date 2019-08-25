package by.it_academy.Lesson13;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    public static void main(String[] args) {
        List<String> listIn;
        ArrayList<String> listOut = new ArrayList<>();
        String fileName = "C:\\Users\\siarh\\OneDrive\\IdeaProjects\\IT-Academy\\src\\by\\it_academy\\Lesson13\\students.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            while (reader.ready()) {
                String stroka = reader.readLine();//Считываем строку.
                String[] result = stroka.replaceAll("[\\D*&&[\\S]]", "").trim().split(" ");//Получаем массив только цифр без пробелов.
                listIn = Arrays.asList(result);//Преобразуем массив к списку.
                double average = listIn.stream().mapToInt(Integer::parseInt).average().orElseGet(() -> 0.0);//Находим среднее арифметическое.
                if(average > 7){
                    listOut.add(stroka.toUpperCase());
                } else {
                    listOut.add(stroka);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName)))
        {
            for (int i = 0; i < listOut.size(); i++) {
                writer.write(listOut.get(i) + "\n");
            }
            } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
