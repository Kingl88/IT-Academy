package Academy.Lesson3;

public class Task5_12 {
    public static void main(String[] args) {
        double density; // Плотность
        int height = 1000; // Высота
        double density0 = 1.29;
        double z = 1.25 * Math.pow(10, -4);
        for (int i = 0; i <= height; i+=100) {
            density = density0 * Math.pow(Math.E, (-i) * z);
            System.out.printf("Плотность на высоте h = %d равняется %f\n", i, density);
        }
    }
}
