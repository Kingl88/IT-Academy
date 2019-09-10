package by.it_academy.Lesson15;

public class Car extends Thread {
    private boolean isEnd = false;
    private int numberParking;

    public Car(String name) {
        super(name);
    }

    public int getNumberParking() {
        return numberParking;
    }

    public void setNumberParking(int numberParking) {
        this.numberParking = numberParking;
    }

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " заехал на парковочное место " + getNumberParking());
            Thread.sleep((long) (Math.random() * 2000));
            isEnd = true;
            System.out.println(Thread.currentThread().getName() + " выехал с парковки " + getNumberParking());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    boolean isEnd() {
        return isEnd;
    }
}
