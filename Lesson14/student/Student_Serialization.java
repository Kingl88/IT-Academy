package by.it_academy.Lesson14.student;

import java.io.*;
import java.util.ArrayList;

class Student_Serialization implements Serializable {
    private ArrayList<Student> students = new ArrayList<>();

    void menu() {
        boolean flag = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (flag) {
            try {
                System.out.println("Выберите необходимое действие из меню: ");
                System.out.println("1. Создать список учеников;\n" +
                        "2. Сохранить список учеников на диск;\n" +
                        "3. Загрузить список учеников с диска;\n" +
                        "4. Вывести на экран список учеников;\n" +
                        "0. Выход из программы.");
                switch (numberInput(reader)) {
                    case 1: {
                        addStudent(reader);
                        break;
                    }
                    case 2: {
                        serializable(students);
                        break;
                    }
                    case 3: {
                        students = open();
                        break;
                    }
                    case 4: {
                        for (Student st : students) {
                            System.out.println(st);
                        }
                        break;
                    }
                    case 0: {
                        reader.close();
                        flag = false;
                        break;
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Введено неверное число");
            }
        }
    }

    private void addStudent(BufferedReader reader) throws IOException {
        do {
            System.out.println("Введите имя:");
            String name = reader.readLine();
            System.out.println("Введите возраст:");
            int age = Integer.parseInt(reader.readLine());
            System.out.println("Введите среднюю оценку:");
            int averageMark = Integer.parseInt(reader.readLine());
            students.add(new Student(name, age, averageMark));
            System.out.println("Для продолжения добавления студентов введите слово \"да\"");
        } while (reader.readLine().equalsIgnoreCase("да"));
    }

    private int numberInput(BufferedReader reader) throws IOException {
        int number;
        while (true) {
            number = Integer.parseInt(reader.readLine());
            if (number >= 0 && number <= 4) {
                break;
            } else {
                System.out.println("Введите число от \"0\" до " + 4);
            }
        }
        return number;
    }

    private void serializable(ArrayList<Student> student) {
        File file = new File("src\\by\\it_academy\\Lesson14\\student\\student.txt").getAbsoluteFile();
        FileOutputStream outputStream;
        try {
            outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ArrayList<Student> open() {
        File file = new File("src\\by\\it_academy\\Lesson14\\student\\student.txt").getAbsoluteFile();
        FileInputStream fileInputStream;
        ArrayList<Student> students = null;
        try {
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                students = (ArrayList<Student>) objectInputStream.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}
