package Academy.Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11_34 {

    public static void AmountOfPrecipitationInFortnight(int[] mass){
        int firstPrecipitation = 0;
        int secondPrecipitation = 0;
        for (int i = 0; i < mass.length; i++) {
            if(i < mass.length/2) {
                firstPrecipitation += mass[i];
            } else {
                secondPrecipitation += mass[i];
            }
        }
        if(firstPrecipitation > secondPrecipitation) {
            System.out.println("Больше осадков выпало в первую половину месяца.");
        } else {
            System.out.println("Больше осадков выпало во вторую половину месяца.");
        }

    }

    public static void DecadaWithMaximumRainfall(int[] mass) {
        int sum_decada = 0;
        int number_decada = 0;
        int temp = 0;
        int count = 0;
        for (int i = 1; i <= mass.length; i++) {
            temp += mass[i - 1];
            if(i%10 == 0) {
                count++;
                if(temp > sum_decada) {
                    sum_decada = temp;
                    temp = 0;
                    number_decada = count;
                }
            }
        }
        System.out.println("Максимальное количество осадков равно " + sum_decada + " выпали в " + number_decada + " декаде месяца");
    }

    public static void main(String[] args) throws IOException {
        boolean flag = true;
        while (flag) {
            System.out.println("В массиве хранятся сведения о количестве осадков, выпавших за каждый\n" +
                    "день июня. Определить:\n" +
                    "а) в какой период выпало больше осадков: в первую половину июня или во\n" +
                    "вторую;\n" +
                    "б) в какую декаду месяца выпало больше всего осадков.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int[] junePrecipitation = new int[30];
            for (int i = 0; i < junePrecipitation.length; i++) {
                junePrecipitation[i] = (int)(Math.random()*100);
            }
            System.out.println("\nВведите номер вариант от 1 до 2");
            int n = Integer.parseInt(reader.readLine());
            switch (n) {
                case 1:
                    AmountOfPrecipitationInFortnight(junePrecipitation);
                    break;
                case 2:
                    DecadaWithMaximumRainfall(junePrecipitation);
                    break;
                case 0:
                    System.out.println("Программа завершилась");
                    flag = false;
                    reader.close();
                    break;
                default:
                    System.out.println("Варианта с такоим номером не существует");
            }
        }
    }
}
