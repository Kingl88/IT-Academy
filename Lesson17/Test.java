package by.it_academy.Lesson17.tunnels;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Tunnel> tunnels = new ArrayList<>();
        tunnels.add(new Tunnel("Тунель 1"));
        tunnels.add(new Tunnel("Тунель 2"));
        Semaphore sem = new Semaphore(2, true);
        for (int i = 0; i < 10; i++) {
            if(Math.round(Math.random()) == 0){ // если "0" то поезд становится в очередь на вход в тунель с наименьшим числом поездов в очереди.
                new Thread(new Train(tunnels, sem, true)).start();
            } else {
                new Thread(new Train(tunnels, sem, false)).start();
            }
        }
    }
}
