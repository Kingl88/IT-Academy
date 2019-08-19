package by.it_academy.Lesson11;

import by.it_academy.Lesson11.enums.CarBrand;
import by.it_academy.Lesson11.enums.TypeEngine;
import by.it_academy.Lesson11.enums.TypeTransmission;
import by.it_academy.Lesson11.enums.brand_cars.*;
import by.it_academy.Lesson11.my_exception.MyException;
import by.it_academy.Lesson11.my_interface.InterfaceForEnum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

public class CarShowroom implements Serializable {
    private static final long serialVersionUID = -7302649736461098397L;
    private static final int MAX_COUNT_CAR_IN_WAREHOUSE = 50;
    private ArrayList<Warehouse> warehouses;
    private String name;
    private String address;

    CarShowroom(String name, String address) {
        setWarehouses();
        setName(name);
        setAddress(address);
    }

    private void setWarehouses() {

        this.warehouses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    void addCar(BufferedReader reader) {
        Car car = new Car(reader);
        if (warehouses.size() > 0) {
            for (int i = 0; i < warehouses.size(); i++) {
                if (warehouses.get(i).isTradIn() && !car.isNew()) {
                    if (!warehouses.get(i).isFull() && warehouses.get(i).getCars().size() < MAX_COUNT_CAR_IN_WAREHOUSE) {
                        car.setNumberWarehouse(i + 1);
                        warehouses.get(i).getCars().add(car);
                        break;
                    } else {
                        warehouses.get(i).setFull(true);
                        car.setNumberWarehouse(i + 1);
                        warehouses.add(warehouses.size() - 1, new Warehouse(true));
                        warehouses.get(warehouses.size() - 1).getCars().add(car);
                        break;
                    }
                } else {
                    if (!warehouses.get(i).isTradIn() && car.isNew()) {
                        if (warehouses.get(i).getCars().size() < MAX_COUNT_CAR_IN_WAREHOUSE) {
                            car.setNumberWarehouse(i + 1);
                            warehouses.get(i).getCars().add(car);
                            break;
                        } else {
                            car.setNumberWarehouse(i + 1);
                            warehouses.add(warehouses.size() - 1, new Warehouse(false));
                            warehouses.get(warehouses.size() - 1).getCars().add(car);
                            break;
                        }
                    }
                }
            }
            if (car.getNumberWarehouse() == 0) {
                newWarehouse(car);
            }
        } else {
            newWarehouse(car);
        }
    }

    private void newWarehouse(Car car) {
        if (car.isNew()) {
            warehouses.add(new Warehouse(false));
            car.setNumberWarehouse(warehouses.size());
            warehouses.get(warehouses.size() - 1).getCars().add(car);
        } else {
            warehouses.add(new Warehouse(true));
            car.setNumberWarehouse(warehouses.size());
            warehouses.get(warehouses.size() - 1).getCars().add(car);
        }
    }

    void listCarAll() {
        System.out.println("Список всех автомобилей находящихся у дилера на складах");
        for (Warehouse warehouse : warehouses) {
            for (int j = 0; j < warehouse.getCars().size(); j++) {
                System.out.println(warehouse.getCars().get(j));
            }
        }
    }

    void listCarNewOrOld(boolean isNew) {
        if (isNew) {
            System.out.println("Список всех новых автомобилей находящихся у дилера на складах");
            for (Warehouse warehouse : warehouses) {
                if (!warehouse.isTradIn()) {
                    for (int j = 0; j < warehouse.getCars().size(); j++) {
                        System.out.println(warehouse.getCars().get(j));
                    }
                }
            }
        } else {
            System.out.println("Список всех поддержаных автомобилей находящихся у дилера на складах");
            for (Warehouse warehouse : warehouses) {
                if (warehouse.isTradIn()) {
                    for (int j = 0; j < warehouse.getCars().size(); j++) {
                        System.out.println(warehouse.getCars().get(j));
                    }
                }
            }
        }
    }

    void listCar(boolean isNew, BufferedReader reader) {
        if (isNew) {
            ArrayList<Car> tempCar = new ArrayList<>();
            for (Warehouse warehouse : warehouses) {
                if (!warehouse.isTradIn()) {
                    tempCar.addAll(warehouse.getCars());
                }
            }
            findCar(reader, tempCar);
        } else {
            ArrayList<Car> tempCar = new ArrayList<>();
            for (Warehouse warehouse : warehouses) {
                if (warehouse.isTradIn()) {
                    tempCar.addAll(warehouse.getCars());
                }
            }
            findCar(reader, tempCar);
        }
    }

    void removeCar(BufferedReader reader) {
        int count = 0;
        for (Warehouse value : warehouses) {
            for (int j = 0; j < value.getCars().size(); j++) {
                count++;
            }
        }
        if (count != 0) {
            listCarAll();
            System.out.println("\nНапишите \"Уникальный номер автомобиля\", который желаете удалить из базы:");
            int number;
            while (true) {
                try {
                    number = Integer.parseInt(reader.readLine());
                    if (number > 0 && number <= Car.getUid()) {
                        break;
                    }
                    throw new MyException();
                } catch (NumberFormatException | IOException ignored) {
                } catch (MyException e) {
                    System.out.println("Брошено собственное исключение, введен недопустимый номер");
                } finally {
                    System.out.println("Введите уникальный адрес автомобиля от 0 до " + Car.getUid());
                }
            }
            boolean isRemove = false;
            for (Warehouse warehouse : warehouses) {
                for (int j = 0; j < warehouse.getCars().size(); j++) {
                    if (warehouse.getCars().get(j).getId() == number) {
                        warehouse.getCars().remove(j);
                        isRemove = true;
                    }
                }
            }
            if (isRemove) {
                System.out.println("Автомобиль удален из базы данных");
            } else {
                System.out.println("Автомобиль с уникальным номером " + number + " был удален из базы данных ранее.");
            }
        } else {
            System.out.println("В безе отсутствуют автомобили.");
        }
    }

    private int findBrand(BufferedReader reader, CarBrand[] carBrands) {
        System.out.println("Выберите марку автомобиля из списка");
        int tempCount = 1;
        for (CarBrand car : carBrands) {
            System.out.println(tempCount++ + ". " + car.getName());
        }
        return find(reader, carBrands);
    }

    private <T> int find(BufferedReader reader, T[] carModel) {
        int number;
        while (true) {
            try {
                number = Integer.parseInt(reader.readLine());
                if (number > 0 && number <= carModel.length) {
                    break;
                }
                System.out.println("Введите число от \"1\" до \"" + carModel.length + "\"");
            } catch (IOException | NumberFormatException e) {
                System.out.println("Введите число от \"1\" до \"" + carModel.length + "\"");
            }
        }
        return number;
    }

    private <T> int streamFindBrand(T[] car, ArrayList<Car> temp, BufferedReader reader) {
        int numberBrand = findBrand(reader, (CarBrand[]) car);
        temp.stream().filter(x -> (x.getBrand()).equals(car[numberBrand - 1])).forEach(System.out::println);
        return (int) temp.stream().filter(x -> (x.getBrand()).equals(car[numberBrand - 1])).count();
    }

    private int streamFindBrandAndType(CarBrand car, ArrayList<Car> temp, BufferedReader reader, InterfaceForEnum[] type) {
        System.out.println("Выберите модель автомобиля из списка");
        int tempCount = 1;
        for (InterfaceForEnum t : type) {
            System.out.println(tempCount++ + ". " + t.getName());
        }
        int numberModel = find(reader, type);
        temp.stream().
                filter(x -> (x.getBrand()).equals(car) && x.getModel().equals(type[numberModel - 1].getName())).forEach(System.out::println);
        return (int) temp.stream().
                filter(x -> (x.getBrand()).equals(car) && x.getModel().equals(type[numberModel - 1].getName())).count();
    }

    private void findCar(BufferedReader reader, ArrayList<Car> tempCar) {
        System.out.println("\n Варианты работы со списком автомобилей" +
                "\n 1. Вывести список по определенной марке;" +
                "\n 2. Вывести список по определенной марке и модели;" +
                "\n 3. Вывести список по типу двигателя;" +
                "\n 4. Вывести список по типу коробки передач;" +
                "\n 5. Вывести список одинаковых автомобилей с указанием их количества.");
        int number;
        while (true) {
            try {
                number = Integer.parseInt(reader.readLine());
                if (number > 0 && number <= 5) {
                    break;
                }
                System.out.println("Введите число от \"1\" до \"5\"");
            } catch (IOException | NumberFormatException e) {
                System.out.println("Введите число от \"1\" до \"5\"");
            }
        }
        CarBrand[] carBrands = CarBrand.values();
        int count = 0;
        switch (number) {
            case 1: {
                count = streamFindBrand(carBrands, tempCar, reader);
                System.out.println("Найдено " + count + " автомобилей.");
                break;
            }
            case 2: {
                int numberBrand = findBrand(reader, carBrands);
                CarBrand brand = carBrands[numberBrand - 1];
                switch (brand) {
                    case AUDI: {
                        count = streamFindBrandAndType(brand, tempCar, reader, Audi.values());
                        break;
                    }
                    case BMW: {
                        count = streamFindBrandAndType(brand, tempCar, reader, Bmw.values());
                        break;
                    }
                    case MERCEDES: {
                        count = streamFindBrandAndType(brand, tempCar, reader, Mercedes.values());
                        break;
                    }
                    case OPEL: {
                        count = streamFindBrandAndType(brand, tempCar, reader, Opel.values());
                        break;
                    }
                    case PORSCHE: {
                        count = streamFindBrandAndType(brand, tempCar, reader, Porsche.values());
                        break;
                    }
                    case VOLKSWAGEN: {
                        count = streamFindBrandAndType(brand, tempCar, reader, Volkswagen.values());
                        break;
                    }
                }
                System.out.println("Найдено " + count + " автомобилей.");
                break;
            }
            case 3: {
                TypeEngine[] typeEngines = TypeEngine.values();
                System.out.println("Выберите тип двигателя автомобиля из списка");
                int tempCount = 1;
                for (TypeEngine engine : typeEngines) {
                    System.out.println(tempCount++ + ". " + engine.getName());
                }
                int finalNumber = find(reader, typeEngines);
                tempCar.stream().filter(x -> x.getTypeEngine().equals(typeEngines[finalNumber - 1])).forEach(System.out::println);
                count = (int) tempCar.stream().filter(x -> x.getTypeEngine().equals(typeEngines[finalNumber - 1])).count();
                System.out.println("Количество автомобилей с двигателем типа \"" + typeEngines[finalNumber - 1].getName() + " \" " + count + " штук.");
                break;
            }
            case 4: {
                TypeTransmission[] typeTransmissions = TypeTransmission.values();
                System.out.println("Выберите тип коробки передач автомобиля из списка");
                int tempCount = 1;
                for (TypeTransmission transmission : typeTransmissions) {
                    System.out.println(tempCount++ + ". " + transmission.getName());
                }
                int finalNumber = find(reader, typeTransmissions);
                tempCar.stream().filter(x -> x.getTypeEngine().equals(typeTransmissions[finalNumber - 1])).forEach(System.out::println);
                count = (int) tempCar.stream().filter(x -> x.getTypeEngine().equals(typeTransmissions[finalNumber - 1])).count();
                System.out.println("Количество автомобилей с КПП типа \"" + typeTransmissions[finalNumber - 1].getName() + " \" " + count + " штук.");
                break;
            }
            case 5: {
                count = 0;
                HashMap<Car, Integer> mapCar = new HashMap<>();
                for (int i = 0; i < tempCar.size(); i++) {
                    Car temp = tempCar.get(i);
                    for (int j = i; j < tempCar.size(); j++) {
                        if (temp.equals(tempCar.get(j))) {
                            count++;
                        }
                    }
                    if (!mapCar.containsKey(temp)) {
                        mapCar.put(temp, count);
                    }
                    count = 0;
                }
                for (HashMap.Entry<Car, Integer> entry : mapCar.entrySet()) {
                    System.out.println(entry.getKey());
                    System.out.println("Количество таких автомобилей " + entry.getValue() + " шт.");
                }
            }
        }
    }
}
