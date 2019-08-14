package by.it_academy.Lesson10;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        CarShowroom carShowroom;
        System.out.println("\t Данная программа предназначена для сотрудников автосалона," +
                "\n с помощью нее можно работать с базой данных автомобилей и выполнять такие операции как:" +
                "\n добавление, удаление, редактирование и вывод информации о автомобиле.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        carShowroom = createCarShowroom();
        boolean flag = true;
        int number;
        while (flag) {
            System.out.println("\n Для добавления автомобиля в базу данных автосалона нажмите \"1\";" +
                    "\n Для удаления автомобиля из базы данных нажмите \"2\";" +
                    "\n Для поиска автомобиля в базе данных нажмите \"3\";" +
                    "\n Для выхода из программы нажмите \"0\"");
            number = Number(reader);
            switch (number) {
                case 1: {
                    carShowroom.addCar(reader);
                    break;
                }
                case 2:{
                    carShowroom.removeCar(reader);
                    break;
                }
                case 3:{
                    System.out.println("\n Для вывода полного списка автомобилей нажмите 1" +
                            "\n для работы со списком новых автомобилей нажмите 2" +
                            "\n для работы со списком поддержанных автомобилей нажмите 3" +
                            "\n для возврата в предыдущее меню нажмите 0");
                    number = Number(reader);
                    switch (number) {
                        case 1:
                            carShowroom.listCarAll();
                            break;
                        case 2:
                            carShowroom.listCarNewOrOld(true);
                            carShowroom.listCar(true, reader);
                            break;
                        case 3:
                            carShowroom.listCarNewOrOld(false);
                            carShowroom.listCar(false, reader);
                            break;
                        case 0:
                            break;
                    }
                    break;
                }
                case 0: {
                    serializable(carShowroom);
                    reader.close();
                    flag = false;
                    break;
                }
            }
        }
    }

    static int Number(BufferedReader reader){
        int number;
        while (true) {
            try {
                number = Integer.parseInt(reader.readLine());
                if (number >= 0 && number <= 3) {
                    break;
                }
                System.out.println("Введите число от \"0\" до \"3\"");
            } catch (IOException e) {
                System.out.println("Введите число от \"0\" до \"3\"");
            }
            catch (NumberFormatException e) {
                System.out.println("Введите число от \"0\" до \"3\"");
            }
        }
        return number;
    }

    static CarShowroom createCarShowroom() {
        File file = new File("src\\by\\it_academy\\Lesson9\\carShowroom.txt").getAbsoluteFile();
        FileInputStream fileInputStream;
        CarShowroom carShowroom = null;
        try {
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                carShowroom = (CarShowroom) objectInputStream.readObject();
            } else {
                carShowroom = new CarShowroom("АвтоМир", " г. Минск, проспект Мира, 29");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return carShowroom;
    }

    static void serializable(CarShowroom carShowroom) {
        File file = new File("src\\by\\it_academy\\Lesson9\\carShowroom.txt").getAbsoluteFile();
        FileOutputStream outputStream;
        try {
            outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(carShowroom);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
