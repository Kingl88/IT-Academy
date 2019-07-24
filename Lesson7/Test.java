package by.it_academy.Lesson7;

import by.it_academy.Lesson7._124_a_4.Country;
import by.it_academy.Lesson7._126_b_4.Salad;
import by.it_academy.Lesson7._126_b_4.Vegetable;
import by.it_academy.Lesson7._87_a_5.Book;
import by.it_academy.Lesson7._90_b_5.Interval;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import static by.it_academy.Lesson7._87_a_5.TypeOfBinding.*;

public class Test {
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (flag) {
            System.out.println("Выберите вариант задания" + "\n\t1. Задание стр. 87 номер А5;" +
                    "\n\t2. Задание стр. 90 номер B5;" + "\n\t3. Задание стр. 124 номер А4;" + "\n\t4. Задание стр. 126 номер B4;" +
                    "\n\tДля выхода нажмите \"0\".");
            int number = Integer.parseInt(reader.readLine());
            switch (number) {
                case 1:
                    testBook(reader);
                    break;
                case 2:
                    testInterval(reader);
                    break;
                case 3:
                    newCountry(reader);
                    break;
                case 4:
                    newSalad(reader);
                    break;
                case 0:
                    flag = false;
                    reader.close();
                    break;
            }
        }
        System.out.println("Программа завершена.");
    }

    static void testBook(BufferedReader reader) throws IOException {
        boolean flag = true;
        Book[] books = new Book[5];
        books[0] = new Book("Мастер и Маргарита", "Михаил Булгаков", "Москва", 1986, 536, 25, PAPERBACK);
        books[1] = new Book("Война и мир", "Лев Толстой", "Санкт-Петербург", 1980, 1028, 35, HARD_COVER);
        books[2] = new Book("Преступление и наказание ", "Федор Достоевский", "Санкт-Петербург", 1974, 754, 30, PAPERBACK);
        books[3] = new Book("Собачье сердце", "Михаил Булгаков", "Москва", 1989, 425, 20, HARD_COVER);
        books[4] = new Book("Анна Каренина", "Лев Толстой", "Одесса", 1975, 574, 27, PAPERBACK);
        while (flag) {
            System.out.println("Выберите действие" + "\n\t1. Вывести список книг заданного автора;" +
                    "\n\t2. Вывести список книг, выпущенных заданным издательством;" + "\n\t3. Вывестисписок книг, выпущенных после заданного года." +
                    "\n\tДля выхода в предыдущее меню нажмите \"0\".");
            int number = Integer.parseInt(reader.readLine());
            switch (number) {
                case 1: {
                    String author = reader.readLine();
                    for (Book book : books) {
                        if (book.currentAuthor(author)) {
                            System.out.println(book);
                        }
                    }
                    break;
                }
                case 2: {
                    String publicher = reader.readLine();
                    for (Book book : books) {
                        if (book.currentPublisher(publicher)) {
                            System.out.println(book);
                        }
                    }
                    break;
                }
                case 3: {
                    int year = Integer.parseInt(reader.readLine());
                    for (Book book : books) {
                        if (book.afterYearOfPublication(year)) {
                            System.out.println(book);
                        }
                    }
                    break;
                }
                case 0:
                    flag = false;
                    break;
            }
        }
    } // Задание с книгами

    static void testInterval(BufferedReader reader) throws IOException {
        boolean flag = true;
        System.out.println("Укажите количество интервалов");
        int n = Integer.parseInt(reader.readLine());
        Interval[] intervals = new Interval[n];
        int i = 0;
        while (n > 0) {
            System.out.println("Введите начало интервала");
            int start = Integer.parseInt(reader.readLine());
            System.out.println("Введите значение конца интервала больше чем начало интервала равное " + start);
            int end = Integer.parseInt(reader.readLine());
            System.out.println("Включать концы в интервал: yes/no");
            String temp = reader.readLine();
            if (temp.equals("yes")) {
                intervals[i] = new Interval(start, end, true);
            } else {
                if (temp.equals("no")) {
                    intervals[i] = new Interval(start, end, false);
                }
            }
            i++;
            n--;
        }
        while (flag) {
            System.out.println("Выберите действие" + "\n\t1. Определить пересечение и объединение интервалов;" +
                    "\n\t2. Определить расстояние между самыми удаленными концами" + "\n\tДля выхода в предыдущее меню нажмите \"0\".");
            int number = Integer.parseInt(reader.readLine());
            switch (number) {
                case 1: {
                    for (int j = 0; j < intervals.length - 1; j++) {
                        intersectionAndIntegration(intervals[j], intervals[j + 1]);
                    }
                    break;
                }
                case 2: {
                    int max = intervals[0].getPointB();
                    int min = intervals[0].getPointA();
                    for (Interval inter : intervals) {
                        if (inter.getPointB() > max) {
                            max = inter.getPointB();
                        }
                        if (inter.getPointA() < min) {
                            min = inter.getPointA();
                        }
                    }
                    System.out.println("Расстояние между самыми удаленными концами равно " + (max - min));
                    break;
                }
                case 0:
                    flag = false;
                    break;
            }
        }
    } // Задание с интервалами

    static void intersectionAndIntegration(Interval a, Interval b) {
        boolean conditionOne = b.getPointA() >= a.getPointA();
        boolean conditionTwo = b.getPointB() <= a.getPointB();
        if (conditionOne && conditionTwo) {
            System.out.println("Интервалы " + a + " и " + b + " можно объединить");
        } else {
            if (a.isIncluded() && b.isIncluded()) {
                if (!(b.getPointA() > a.getPointB() || a.getPointA() > b.getPointB())) { //(b.getPointA() <= a.getPointB()) && (b.getPointB() >= a.getPointA())
                    System.out.println("Интервал " + a + " и " + b + " пересекаются.");
                } else {
                    System.out.println("Интервалы не пересекаются и не объединяются");
                }
            } else {
                if (!(b.getPointA() >= a.getPointB() || a.getPointA() >= b.getPointB())) {
                    System.out.println("Интервал " + a + " и " + b + " пересекаются.");
                } else {
                    System.out.println("Интервалы " + a + " и " + b + " не пересекаются и не объединяются");
                }
            }
        }
    } // Метод для определения пересечения или объединения интервалов.

    static void newCountry(BufferedReader reader) throws IOException {
        Country country = null;
        while (true) {
            System.out.println("Для создания нового государства введите название государства, " +
                    "\n для выхода в предыдущее меню нажмите \"0\"");
            String nameCountry = reader.readLine();
            if (!nameCountry.equals("0")) {
                country = new Country(nameCountry); //Создаем государство
                int i = 0;
                int j = 0;
                while (true) { // Добавляем области в государство
                    System.out.println("Для добавления в государство области введите название новой области," +
                            "\n для выхода в предыдущее меню нажмите \"0\"");
                    String nameRegion = reader.readLine();
                    if (!nameRegion.equals("0")) {
                        System.out.println("Введите площадь области ");
                        country.setRegions(nameRegion, Double.parseDouble(reader.readLine()));
                        while (true) {
                            System.out.println("Для добавления в область района введите название нового района," +
                                    "\n для выхода в предыдущее меню нажмите \"0\"");
                            String nameDistrict = reader.readLine();
                            if (!nameDistrict.equals("0")) {
                                country.getRegions().get(i).setDistrict(nameDistrict);
                                while (true) {
                                    System.out.println("Для добавления в район города введите название нового города," +
                                            "\n для выхода в предыдущее меню нажмите \"0\"");
                                    String nameCity = reader.readLine();
                                    if (!nameCity.equals("0")) {
                                        System.out.println("Город " + nameCity + " является столицей " + country.getName() + " да/нет");
                                        String temp = reader.readLine();
                                        if(temp.equals("да")) {
                                            country.addCity(nameCity, reader, i, j);
                                        } else {
                                            if(temp.equals("нет")) {
                                                country.addCity(nameCity, reader, i, j);
                                            }
                                        }
                                    } else {
                                        j++;
                                        break;
                                    }
                                }
                            } else {
                                i++;
                                j = 0;
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        country.theCapital();
        country.numberRegions();
        country.countryArea();
        country.regionalCentre();
    } // Задание создать страну

    static void newSalad(BufferedReader reader) throws IOException {
        boolean flag = true;
        Salad salad = new Salad("Винегрет", new ArrayList<>(Arrays.asList(new Vegetable("Свекла", 43, 400),
                new Vegetable("Морковь", 32, 300), new Vegetable("Картофель", 82, 400),
                new Vegetable("Квашенная капуста", 19, 200), new Vegetable("Маринованные огурцы", 16, 200),
                new Vegetable("Лук", 47, 150))));
        while (flag) {
            System.out.println("Выберите действие" + "\n\t1. Подсчитать калорийность салата" +
                    "\n\t2. Отсортировать ингредиенты по суммарной калорийности в салате" +
                    "\n\t3. Найти овощи в салате, соответствующие заданному диапазону калорийности." +
                    "\n\tДля выхода в предыдущее меню нажмите \"0\".");
            int number = Integer.parseInt(reader.readLine());
            switch (number) {
                case 1:
                    salad.calories();
                    break;
                case 2:
                    salad.sort();
                    break;
                case 3:
                    System.out.println("Введите минимальную каллорийность и максимальную");
                    salad.find(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }
    } // Задание сделать салат
}
