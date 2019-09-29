package by.it_academy.Lesson16.tunnels;

import java.util.ArrayList;

public class Train implements Runnable {

    ArrayList<Tunnel> tunnels;
    boolean isIn;

    public Train(ArrayList<Tunnel> tunnels, boolean isIn) {
        this.tunnels = tunnels;
        this.isIn = isIn;
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
        boolean flag = true;
        while (flag) { // смотрим на туннели и заезжаем в первый освободившийся.
        for (Tunnel tunnel : tunnels) {
            if(!tunnel.isUses()){ // если туннель не занят запускаем поезд.
               flag = tunnel.drive(); // поезд проехал.
                break;
            }
        }
        }

    }
}
