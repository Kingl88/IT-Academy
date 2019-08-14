package by.it_academy.Lesson10;

import by.it_academy.Lesson10.enums.CarBrand;
import by.it_academy.Lesson10.enums.TypeEngine;
import by.it_academy.Lesson10.enums.TypeTransmission;
import by.it_academy.Lesson10.enums.brand_cars.*;
import by.it_academy.Lesson10.my_exception.MyException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class CarShowroom implements Serializable {
    private static final long serialVersionUID = -7302649736461098397L;
    private static final int MAX_COUNT_CAR_IN_WAREHOUSE = 50;
    private ArrayList<Warehouse> warehouses;
    private String name;
    private String address;

    public CarShowroom(String name, String address) {
        setWarehouses();
        setName(name);
        setAddress(address);
    }

    public ArrayList<Warehouse> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses() {

        this.warehouses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addCar(BufferedReader reader) {
        Car car = new Car(reader);
        if (warehouses.size() > 0 && warehouses != null) {
            for (int i = 0; i < warehouses.size(); i++) {
                if (warehouses.get(i).isTradIn() && !car.isNew()) {
                    if (warehouses.get(i).getCars().size() < MAX_COUNT_CAR_IN_WAREHOUSE) {
                        car.setNumberWarehouse(i + 1);
                        warehouses.get(i).getCars().add(car);
                        break;
                    } else {
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

    public void listCarAll() {
        System.out.println("Список всех автомобилей находящихся у дилера на складах");
        for (int i = 0; i < warehouses.size(); i++) {
            for (int j = 0; j < warehouses.get(i).getCars().size(); j++) {
                System.out.println(warehouses.get(i).getCars().get(j));
            }
        }
    }

    public void listCarNewOrOld(boolean isNew) {
        if (isNew) {
            System.out.println("Список всех новых автомобилей находящихся у дилера на складах");
            for (int i = 0; i < warehouses.size(); i++) {
                if (!warehouses.get(i).isTradIn()) {
                    for (int j = 0; j < warehouses.get(i).getCars().size(); j++) {
                        System.out.println(warehouses.get(i).getCars().get(j));
                    }
                }
            }
        } else {
            System.out.println("Список всех поддержаных автомобилей находящихся у дилера на складах");
            for (int i = 0; i < warehouses.size(); i++) {
                if (warehouses.get(i).isTradIn()) {
                    for (int j = 0; j < warehouses.get(i).getCars().size(); j++) {
                        System.out.println(warehouses.get(i).getCars().get(j));
                    }
                }
            }
        }
    }

    public void listCar(boolean isNew, BufferedReader reader) {
        if (isNew) {
            ArrayList<Car> tempCar = new ArrayList<>();
            for (int i = 0; i < warehouses.size(); i++) {
                if (!warehouses.get(i).isTradIn()) {
                    for (int j = 0; j < warehouses.get(i).getCars().size(); j++) {
                        tempCar.add(warehouses.get(i).getCars().get(j));
                    }
                }
            }
            findCar(reader, tempCar);
        } else {
            ArrayList<Car> tempCar = new ArrayList<>();
            for (int i = 0; i < warehouses.size(); i++) {
                if (warehouses.get(i).isTradIn()) {
                    for (int j = 0; j < warehouses.get(i).getCars().size(); j++) {
                        tempCar.add(warehouses.get(i).getCars().get(j));
                    }
                }
            }
            findCar(reader, tempCar);
        }
    }

    public void removeCar(BufferedReader reader) {
        int count = 0;
        for (int i = 0; i < warehouses.size(); i++) {
            for (int j = 0; j < warehouses.get(i).getCars().size(); j++) {
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
                } catch (NumberFormatException e) {
                } catch (IOException e) {
                } catch (MyException e) {
                    System.out.println("Брошено собственное исключение, введен недопустимый номер");
                } finally {
                    System.out.println("Введите уникальный адрес автомобиля от 0 до " + Car.getUid());
                }
            }
            boolean isRemove = false;
            for (int i = 0; i < warehouses.size(); i++) {
                for (int j = 0; j < warehouses.get(i).getCars().size(); j++) {
                    if (warehouses.get(i).getCars().get(j).getId() == number) {
                        warehouses.get(i).getCars().remove(j);
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
            } catch (IOException e) {
                System.out.println("Введите число от \"1\" до \"" + carModel.length + "\"");
            } catch (NumberFormatException e) {
                System.out.println("Введите число от \"1\" до \"" + carModel.length + "\"");
            }
        }
        return number;
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
            } catch (IOException e) {
                System.out.println("Введите число от \"1\" до \"5\"");
            } catch (NumberFormatException e) {
                System.out.println("Введите число от \"1\" до \"5\"");
            }
        }
        String model = null;
        switch (number) {
            case 1: {
                CarBrand[] carBrands = CarBrand.values();
                number = findBrand(reader, carBrands);
                for (Car car : tempCar) {
                    if (car.getBrand().equals(carBrands[number - 1])) {
                        System.out.println(car);
                    }
                }
                break;
            }
            case 2: {
                CarBrand[] carBrands = CarBrand.values();
                int numberBrand = findBrand(reader, carBrands);
                CarBrand brand = carBrands[numberBrand - 1];
                switch (brand) {
                    case AUDI: {
                        Audi[] audis = Audi.values();
                        System.out.println("Выберите модель автомобиля из списка");
                        int tempCount = 1;
                        for (Audi car : audis) {
                            System.out.println(tempCount++ + ". " + car.getName());
                        }
                        int numberModel = find(reader, audis);
                        model = audis[numberModel - 1].getName();
                        break;
                    }
                    case BMW: {
                        Bmw[] bmws = Bmw.values();
                        System.out.println("Выберите модель автомобиля из списка");
                        int tempCount = 1;
                        for (Bmw car : bmws) {
                            System.out.println(tempCount++ + ". " + car.getName());
                        }
                        int numberModel = find(reader, bmws);
                        model = bmws[numberModel - 1].getName();
                        break;
                    }
                    case MERCEDES: {
                        Mercedes[] mercedes = Mercedes.values();
                        System.out.println("Выберите модель автомобиля из списка");
                        int tempCount = 1;
                        for (Mercedes car : mercedes) {
                            System.out.println(tempCount++ + ". " + car.getName());
                        }
                        int numberModel = find(reader, mercedes);
                        model = mercedes[numberModel - 1].getName();
                        break;
                    }
                    case OPEL: {
                        Opel[] opels = Opel.values();
                        System.out.println("Выберите модель автомобиля из списка");
                        int tempCount = 1;
                        for (Opel car : opels) {
                            System.out.println(tempCount++ + ". " + car.getName());
                        }
                        int numberModel = find(reader, opels);
                        model = opels[numberModel - 1].getName();
                        break;
                    }
                    case PORSCHE: {
                        Porsche[] porsches = Porsche.values();
                        System.out.println("Выберите модель автомобиля из списка");
                        int tempCount = 1;
                        for (Porsche car : porsches) {
                            System.out.println(tempCount++ + ". " + car.getName());
                        }
                        int numberModel = find(reader, porsches);
                        model = porsches[numberModel - 1].getName();
                        break;
                    }
                    case VOLKSWAGEN: {
                        Volkswagen[] volkswagens = Volkswagen.values();
                        System.out.println("Выберите модель автомобиля из списка");
                        int tempCount = 1;
                        for (Volkswagen car : volkswagens) {
                            System.out.println(tempCount++ + ". " + car.getName());
                        }
                        int numberModel = find(reader, volkswagens);
                        model = volkswagens[numberModel - 1].getName();
                        break;
                    }
                }
                for (Car car : tempCar) {
                    if (model != null && car.getBrand().equals(carBrands[numberBrand - 1]) && car.getModel().equals(model)) {
                        System.out.println(car);
                    }
                }
                break;
            }
            case 3: {
                TypeEngine[] typeEngines = TypeEngine.values();
                System.out.println("Выберите тип двигателя автомобиля из списка");
                int tempCount = 1;
                for (TypeEngine engine : typeEngines) {
                    System.out.println(tempCount++ + ". " + engine.getName());
                }
                number = find(reader, typeEngines);
                for (Car car : tempCar) {
                    if (car.getTypeEngine().equals(typeEngines[number - 1])) {
                        System.out.println(car);
                    }
                }
                break;
            }
            case 4: {
                TypeTransmission[] typeTransmissions = TypeTransmission.values();
                System.out.println("Выберите тип коробки передач автомобиля из списка");
                int tempCount = 1;
                for (TypeTransmission transmission : typeTransmissions) {
                    System.out.println(tempCount++ + ". " + transmission.getName());
                }
                number = find(reader, typeTransmissions);
                for (Car car : tempCar) {
                    if (car.getTypeEngine().equals(typeTransmissions[number - 1])) {
                        System.out.println(car);
                    }
                }
                break;
            }
            case 5:{
                int count = 0;
                HashMap<Car, Integer> mapCar = new HashMap<>();
                for (int i = 0; i < tempCar.size(); i++) {
                    Car temp = tempCar.get(i);
                    for (int j = i; j < tempCar.size(); j++) {
                        if(temp.equals(tempCar.get(j))) {
                            count++;
                        }
                    }
                    if(!mapCar.containsKey(temp)) {
                        mapCar.put(temp, count);
                    }
                    count = 0;
                }
                for(HashMap.Entry<Car, Integer> entry : mapCar.entrySet()) {
                    System.out.println(entry.getKey());
                    System.out.println("Количество таких автомобилей " + entry.getValue() + " шт.");
                }
            }
        }
    }
}
