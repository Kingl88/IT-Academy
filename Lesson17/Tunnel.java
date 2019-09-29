package by.it_academy.Lesson17.tunnels;

public class Tunnel {

    private int numberIn;
    private int numberOut;
    private String name;
    private boolean isUses;

    public Tunnel(String name) {
        this.name = name;
    }

    public boolean drive() {

        if (numberIn >= numberOut) { // Запускаем в туннель поезд с очереди с наибольшим числом поездов.
            isUses = true;
            System.out.println("Поезд " + Thread.currentThread().getName() + " заехал на вход в " + getName());
            try {
                Thread.sleep((long) (Math.random() * 2000)); // время нахождения поезда в туннеле.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поезд " + Thread.currentThread().getName() + " выехал из " + getName());
            numberIn--; // убирам из очереди уехавший поезд
            isUses = false; // освобождаем туннель
        } else {
            isUses = true;
            System.out.println("Поезд " + Thread.currentThread().getName() + " заехал с выхода " + getName());
            try {
                Thread.sleep((long) (Math.random() * 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поезд " + Thread.currentThread().getName() + " выехал из " + getName());
            numberOut--;
            isUses = false;
        }
        return false;
    }

    public boolean isUses() {
        return isUses;
    }

    public synchronized int getNumberIn() {
        return numberIn;
    }

    public synchronized void setNumberIn() {
        this.numberIn++;
    }

    public synchronized int getNumberOut() {
        return numberOut;
    }

    public synchronized void setNumberOut() {
        this.numberOut++;
    }

    public String getName() {
        return name;
    }
}
