package by.it_academy.Lesson13;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String fileName = "C:\\Users\\siarh\\OneDrive\\IdeaProjects\\IT-Academy\\src\\by\\it_academy\\Lesson13\\students.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            while (reader.ready()) {
                String stroka = reader.readLine();
                String[] strTemp = stroka.split(" ");
                if(Integer.parseInt(strTemp[1]) > 7){
                    strTemp[0] = strTemp[0].toUpperCase();
                }
                list.add(strTemp[0] + " " + strTemp[1] + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName)))
        {
            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i));
            }
            } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
