package by.it_academy.Lesson9;

import by.it_academy.Lesson9.enums.CarBrand;
import by.it_academy.Lesson9.enums.Color;
import by.it_academy.Lesson9.enums.TypeEngine;
import by.it_academy.Lesson9.enums.TypeTransmission;
import by.it_academy.Lesson9.enums.brand_cars.*;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

import static by.it_academy.Lesson9.enums.CarBrand.*;
import static by.it_academy.Lesson9.enums.Color.*;
import static by.it_academy.Lesson9.enums.TypeEngine.*;
import static by.it_academy.Lesson9.enums.TypeTransmission.*;

public class Car implements Externalizable {
    private static int uid = 0;
    private int id;
    private CarBrand brand;
    private String model;
    private int startOfRelease;
    private int endOfRelease;
    private TypeEngine typeEngine;
    private TypeTransmission typeTransmission;
    private Color color;
    private int price;
    private boolean isNew;
    private int dateOfManufacture;
    private Date dateOfSold = null;
    private Date dateOfReceiptAtTheWarehouse;
    private boolean isSold = false;
    private int numberWarehouse;

    public Car(BufferedReader reader) {
        setId();
        setBrand(reader);
        setTypeEngine(reader);
        setTypeTransmission(reader);
        setColor(reader);
        setNew(reader);
        setDateOfManufacture(reader);
        setDateOfReceiptAtTheWarehouse(reader);
        setPrice(reader);
    }

    public Car(){}

    public int getNumberWarehouse() {
        return numberWarehouse;
    }

    public void setNumberWarehouse(int numberWarehouse) {
        this.numberWarehouse = numberWarehouse;
    }

    public static int getUid() {
        return uid;
    }

    public int getId() {
        return id;
    }

    private void setId() {
        id = ++uid;
    }

    public CarBrand getBrand() {
        return brand;
    }

    private void setBrand(BufferedReader reader) {
        boolean flag = true;
        int number;
        try {
            while (flag) {
                System.out.println("Выберите марку автомобиля:" +
                        "\n 1. " + AUDI.getName() + ";" +
                        "\n 2. " + BMW.getName() + ";" +
                        "\n 3. " + MERCEDES.getName() + ";" +
                        "\n 4. " + VOLKSWAGEN.getName() + ";" +
                        "\n 5. " + PORSCHE.getName() + ";" +
                        "\n 6. " + OPEL.getName() + ";");
                number = Integer.parseInt(reader.readLine());
                switch (number) {
                    case 1:
                        this.brand = AUDI;
                        setModel(reader, number);
                        flag = false;
                        break;
                    case 2:
                        this.brand = BMW;
                        setModel(reader, number);
                        flag = false;
                        break;
                    case 3:
                        this.brand = MERCEDES;
                        setModel(reader, number);
                        flag = false;
                        break;
                    case 4:
                        this.brand = VOLKSWAGEN;
                        setModel(reader, number);
                        flag = false;
                        break;
                    case 5:
                        this.brand = PORSCHE;
                        setModel(reader, number);
                        flag = false;
                        break;
                    case 6:
                        this.brand = OPEL;
                        setModel(reader, number);
                        flag = false;
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Введите число от 1 до 6");
        }
    }

    private void setModel(BufferedReader reader, int number) {
        switch (number) {
            case 1: {
                Audi[] audis = Audi.values();
                Audi temp = model(audis, reader);
                model = temp.getName();
                startOfRelease = temp.getStartOfRelease();
                endOfRelease =  temp.getEndOfRelease();
                price = temp.getPrice();
                break;
            }
            case 2: {
                Bmw[] bmw = Bmw.values();
                Bmw temp = model(bmw, reader);
                model = temp.getName();
                startOfRelease = temp.getStartOfRelease();
                endOfRelease = temp.getEndOfRelease();
                price = temp.getPrice();
                break;
            }
            case 3: {
                Mercedes[] mercedes = Mercedes.values();
                Mercedes temp = model(mercedes, reader);
                model = temp.getName();
                startOfRelease = temp.getStartOfRelease();
                endOfRelease = temp.getEndOfRelease();
                price = temp.getPrice();
                break;
            }
            case 4: {
                Volkswagen[] volkswagens = Volkswagen.values();
                Volkswagen temp = model(volkswagens, reader);
                model = temp.getName();
                startOfRelease = temp.getStartOfRelease();
                endOfRelease = temp.getEndOfRelease();
                price = temp.getPrice();
                break;
            }
            case 5: {
                Porsche[] porsches = Porsche.values();
                Porsche temp = model(porsches, reader);
                model = temp.getName();
                startOfRelease = temp.getStartOfRelease();
                endOfRelease = temp.getEndOfRelease();
                price = temp.getPrice();
                break;
            }
            case 6: {
                Opel[] opels = Opel.values();
                Opel temp = model(opels, reader);
                model = temp.getName();
                startOfRelease = temp.getStartOfRelease();
                endOfRelease = temp.getEndOfRelease();
                price = temp.getPrice();
                break;
            }
        }
    }

    private <T> T model(T[] cars, BufferedReader reader) {
        int num;
        System.out.println("Доступные модели автомобилей:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + ". " + cars[i]);
        }
        System.out.println("Выберите необходимую модель:");
        while (true) {
            try {
                num = Integer.parseInt(reader.readLine());
                if (num > 0 && num <= cars.length) {
                    break;
                }
                System.out.println("Введите число от 1 до " + cars.length);
            } catch (IOException e) {
                System.out.println("Введите число от 1 до " + cars.length);
            }
        }
        return cars[num - 1];
    }

    public TypeEngine getTypeEngine() {
        return typeEngine;
    }

    private void setTypeEngine(BufferedReader reader) {
        boolean flag = true;
        try {
            while (flag) {
                System.out.println("Выберите тип двигателя:" +
                        "\n 1. " + PETROL.getName() + ";" +
                        "\n 2. " + DISEL.getName() + ";" +
                        "\n 3. " + ELECTRIC.getName() + ";");
                switch (Integer.parseInt(reader.readLine())) {
                    case 1:
                        this.typeEngine = PETROL;
                        flag = false;
                        break;
                    case 2:
                        this.typeEngine = DISEL;
                        flag = false;
                        break;
                    case 3:
                        this.typeEngine = ELECTRIC;
                        flag = false;
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Введите число от 1 до 3");
        }
    }

    public TypeTransmission getTypeTransmission() {
        return typeTransmission;
    }

    private void setTypeTransmission(BufferedReader reader) {
        boolean flag = true;
        try {
            while (flag) {
                System.out.println("Выберите тип коробки передач:" +
                        "\n 1. " + MKPP.getName() + ";" +
                        "\n 2. " + AKPP.getName() + ";" +
                        "\n 3. " + RKPP.getName() + ";" +
                        "\n 4. " + VARIATOR.getName() + ";");
                switch (Integer.parseInt(reader.readLine())) {
                    case 1:
                        this.typeTransmission = MKPP;
                        flag = false;
                        break;
                    case 2:
                        this.typeTransmission = AKPP;
                        flag = false;
                        break;
                    case 3:
                        this.typeTransmission = RKPP;
                        flag = false;
                        break;
                    case 4:
                        this.typeTransmission = VARIATOR;
                        flag = false;
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Введите число от 1 до 4");
        }
    }

    public Color getColor() {
        return color;
    }

    private void setColor(BufferedReader reader) {
        boolean flag = true;
        try {
            while (flag) {
                System.out.println("Выберите цвет автомобиля:" +
                        "\n 1. Красный;" +
                        "\n 2. Синий;" +
                        "\n 3. Зеленый;" +
                        "\n 4. Серый;" +
                        "\n 5. Черный.");
                switch (Integer.parseInt(reader.readLine())) {
                    case 1:
                        this.color = RED;
                        flag = false;
                        break;
                    case 2:
                        this.color = BLUE;
                        flag = false;
                        break;
                    case 3:
                        this.color = GREEN;
                        flag = false;
                        break;
                    case 4:
                        this.color = GRAY;
                        flag = false;
                        break;
                    case 5:
                        this.color = BLACK;
                        flag = false;
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Введите число от 1 до 5");
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(BufferedReader reader) {
        if (isNew()) {
            this.price = this.price + typeEngine.getPrice() + typeTransmission.getPrice() + color.getPrice();
        } else {
            System.out.println("Автомобиль б/у, установите необходимую стоимость:");
            try {
                this.price = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Введите число а не строку.");
            }
        }
    }

    public boolean isNew() {
        return isNew;
    }

    private void setNew(BufferedReader reader) {
        System.out.println("Данная марка автомобиля выпускалась с " + getStartOfRelease() + " по " + getEndOfRelease() + " год.");
        if (Calendar.getInstance().get(Calendar.YEAR) > getEndOfRelease() + 1) {
            System.out.println("Данный автомобиль является б/у");
        } else {
            System.out.println("Машина новая или trad-in? да/нет");
            try {
                while (true) {
                    String str = reader.readLine();
                    if (str.equals("да")) {
                        isNew = true;
                        break;
                    }
                    if (str.equals("нет")) {
                        isNew = false;
                        break;
                    }
                    System.out.println("Введите слово \"да\" или \"нет\"");
                }
            } catch (IOException e) {
                System.out.println("Введите слово \"да\" или \"нет\"");
            }
        }
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    private void setDateOfManufacture(BufferedReader reader) {
        int num;
        if (isNew) {
            while (true) {
                try {
                    System.out.println("Если автомобиль текущего года выпуска нажмите \"1\"," +
                            " если предыдущего нажмите \"2\".");
                    num = Integer.parseInt(reader.readLine());
                    if (num > 0 && num <= 2) {
                        break;
                    }
                } catch (IOException e) {
                    System.out.println("Введите число 1 или 2");
                }
            }
            if (num == 1) {
                dateOfManufacture = Calendar.getInstance().get(Calendar.YEAR);
            } else {
                dateOfManufacture = Calendar.getInstance().get(Calendar.YEAR) - 1;
            }

        } else {
            System.out.println("Автомобиль " + getBrand().getName() + " модель " + getModel() + " выпускался с " + getStartOfRelease() + " до " + getEndOfRelease());
            System.out.println("Введите дату выпуска данного автомобиля");
            while (true) {
                try {
                    dateOfManufacture = Integer.parseInt(reader.readLine());
                    if (dateOfManufacture >= getStartOfRelease() && dateOfManufacture <= getEndOfRelease()) {
                        break;
                    }
                    System.out.println("Введите год от " + getStartOfRelease() + " до " + getEndOfRelease());
                } catch (IOException e) {
                    System.out.println("Введите год от " + getStartOfRelease() + " до " + getEndOfRelease());
                }
            }
        }
    }

    public int getStartOfRelease() {
        return startOfRelease;
    }

    public int getEndOfRelease() {
        return endOfRelease;
    }

    public String getModel() {
        return model;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        if (!isSold() && sold) {
            setDateOfSold(new Date());
            isSold = sold;
        }
    }

    public Date getDateOfSold() {
        return dateOfSold;
    }

    private void setDateOfSold(Date dateOfSold) {

        this.dateOfSold = dateOfSold;
    }

    public Date getDateOfReceiptAtTheWarehouse() {
        return dateOfReceiptAtTheWarehouse;
    }

    private void setDateOfReceiptAtTheWarehouse(BufferedReader reader) {
        short year = 0;
        byte month = 0;
        byte day = 0;
        System.out.println("Введите дату поступления машины на склад");
        System.out.println("Введите год");
        while (true) {
            try {

                year = Short.parseShort(reader.readLine());
                if (year >= getDateOfManufacture() && year <= Calendar.getInstance().get(Calendar.YEAR)) {
                    break;
                }
                System.out.println("Данная марка автомобиля выпускалась с " + getStartOfRelease() + " по " + getEndOfRelease() + " год.");
                System.out.println("Данный автомобиль был произведен в " + getDateOfManufacture());
                System.out.println("Введите год ");
            } catch (IOException e) {
                System.out.println("Введите год");
            } catch (NumberFormatException e) {
                System.out.println("Введите год");
            }
        }
        System.out.println("Введите месяц");
        while (true) {
            try {
                month = Byte.parseByte(reader.readLine());
                if ((month >= 1 && month <= 12 && year < (Calendar.getInstance().get(Calendar.YEAR))) ||
                        (month >= 1 && month <= (Calendar.getInstance().get(Calendar.MONTH) + 1))) {
                    break;
                }
                System.out.println("Месяц введен некорректно, повторите ввод");
            } catch (IOException e) {
                System.out.println("Месяц введен некорректно, повторите ввод");
            } catch (NumberFormatException e) {
                System.out.println("Месяц введен некорректно, повторите ввод");
            }
        }
        System.out.println("Введите день");
        while (true) {
            try {
                day = Byte.parseByte(reader.readLine());
                Calendar calendar = new GregorianCalendar();
                calendar.set(Calendar.MONTH, (month - 1));
                if ((day >= 1 && day <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH) && year < (Calendar.getInstance().get(Calendar.YEAR))) ||
                        day >= 1 && day <= Calendar.getInstance().get(Calendar.DAY_OF_MONTH)) {
                    break;
                }
                System.out.println("День введен некорректно, повторите ввод");
            } catch (IOException e) {
                System.out.println("День введен некорректно, повторите ввод");
            } catch (NumberFormatException e) {
                System.out.println("День введен некорректно, повторите ввод");
            }
        }
        this.dateOfReceiptAtTheWarehouse = (new GregorianCalendar(year, month - 1, day)).getTime();
    }
//
//    public static void serializeStatic(ObjectOutputStream oos) throws IOException {
//        oos.writeInt(uid);
//    }
//
//    public static void deserializeStatic(ObjectInputStream ois) throws IOException {
//        uid = ois.readInt();
//    }
//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return startOfRelease == car.startOfRelease &&
                endOfRelease == car.endOfRelease &&
                price == car.price &&
                isNew == car.isNew &&
                dateOfManufacture == car.dateOfManufacture &&
                isSold == car.isSold &&
                numberWarehouse == car.numberWarehouse &&
                brand == car.brand &&
                Objects.equals(model, car.model) &&
                typeEngine == car.typeEngine &&
                typeTransmission == car.typeTransmission &&
                color == car.color &&
                Objects.equals(dateOfSold, car.dateOfSold) &&
                Objects.equals(dateOfReceiptAtTheWarehouse, car.dateOfReceiptAtTheWarehouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, startOfRelease, endOfRelease, typeEngine, typeTransmission, color, price, isNew, dateOfManufacture, dateOfSold, dateOfReceiptAtTheWarehouse, isSold, numberWarehouse);
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy");
        return "\nУникальный номер автомобиля = " + id +
                ", \nмарка автомобиля = " + brand +
                ", \nмодель = " + model +
                ", \nтип двигателя = " + typeEngine.getName() +
                ", \nтип коробки передач = " + typeTransmission.getName() +
                ", \nцвет кузова = " + color.getName() +
                ", \nстоимость = " + price +
                ", \nдата выпуска = " + dateOfManufacture +
                ", \nдата продажи = " + ((dateOfSold == null) ? ("автомобиль на складе № " + getNumberWarehouse()) : ("Автомобиль продан " + dateOfSold)) +
                ", \nдата поступления на склад = " +dateFormat.format(dateOfReceiptAtTheWarehouse);
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(uid);
        out.writeInt(id);
        out.writeInt(startOfRelease);
        out.writeInt(endOfRelease);
        out.writeInt(price);
        out.writeInt(dateOfManufacture);
        out.writeInt(numberWarehouse);
        out.writeObject(brand);
        out.writeObject(model);
        out.writeObject(typeEngine);
        out.writeObject(typeTransmission);
        out.writeObject(color);
        out.writeObject(dateOfSold);
        out.writeObject(dateOfReceiptAtTheWarehouse);
        out.writeBoolean(isNew);
        out.writeBoolean(isSold);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        uid = in.readInt();
        id = in.readInt();
        startOfRelease = in.readInt();
        endOfRelease = in.readInt();
        price = in.readInt();
        dateOfManufacture = in.readInt();
        numberWarehouse = in.readInt();
        brand = (CarBrand) in.readObject();
        model = (String) in.readObject();
        typeEngine = (TypeEngine) in.readObject();
        typeTransmission = (TypeTransmission) in.readObject();
        color = (Color)in.readObject();
        dateOfSold = (Date)in.readObject();
        dateOfReceiptAtTheWarehouse = (Date)in.readObject();
        isNew = in.readBoolean();
        isSold = in.readBoolean();
    }
}