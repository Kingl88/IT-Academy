package by.it_academy.Lesson17.tunnels;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Train implements Runnable {

    ArrayList<Tunnel> tunnels;
    boolean isIn;
    Semaphore sem;

    public Train(ArrayList<Tunnel> tunnels, Semaphore sem, boolean isIn) {
        this.tunnels = tunnels;
        this.isIn = isIn;
        this.sem = sem;
        addTrain(this.tunnels, this.isIn);
    }

    private void addTrain(ArrayList<Tunnel> tunnels, boolean isIn) { // Метод добавления поезда в очередь
        if (isIn) { // если поезд становится в очередь на входе в туннель
            int min = tunnels.stream().mapToInt(Tunnel::getNumberIn).min().orElse(0);// Находим минимальное число поездов в очередяя во всех туннелях
            for (int i = 0; i < tunnels.size(); i++) {
                if (tunnels.get(i).getNumberIn() == min) { // добавляем поезд в очередь с минимальным числом поездов в очереди
                    tunnels.get(i).setNumberIn();
                    break;
                }
            }
        } else {
            int min = tunnels.stream().mapToInt(Tunnel::getNumberOut).min().orElse(0); // аналогично что в предыдущем блоке кода но на выходе из туннеля
            for (int i = 0; i < tunnels.size(); i++) {
                if (tunnels.get(i).getNumberOut() == min) {
                    tunnels.get(i).setNumberOut();
                    break;
                }
            }
        }
    }

    @Override
    public void run() {
        try {
            sem.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean flag = true;

        while (flag) { // смотрим на туннели и заезжаем в первый освободившийся.

            for (Tunnel tunnel : tunnels) {
                System.out.println("Поезд " + Thread.currentThread().getName() + " хочет заехать в " + tunnel.getName());
                if (!tunnel.isUses()) { // если туннель не занят запускаем поезд.
                    flag = tunnel.drive(); // поезд проехал.
                    break;
                }
            }

        }
        sem.release();
    }
}
