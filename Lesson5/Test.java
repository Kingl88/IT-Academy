package by.it_academy.Lesson5;

public class Test {
    public static void main(String[] args) throws Exception {
        FrequencyDrive fd = new FrequencyDrive(10, 1500, 10);
        System.out.println(fd.getCurrentCoordinate());
        fd.movement(1000, 10);
        System.out.println(fd.getCurrentCoordinate());
        fd.movement(50, 10);
        System.out.println(fd.getCurrentCoordinate());
    }
}
