package Academy.Lesson2;

public class Task3_6 {
    public static void main(String[] args) {
        boolean X = false, Y = false, Z = true;
        System.out.println("(X или Y и не Z) = " + ((X || Y && !Z)));
        System.out.println("(не X и не Y) = " + (!X && !Y));
        System.out.println("(не (X и Z) или Y) = " + (!(X && Z) || Y));
        System.out.println("(X и не Y или Z) = " + (X && !Y || Z));
        System.out.println("(X и (не Y или Z)) = " + (X && (!Y || Z)));
        System.out.println("(X или (не (Y или Z))) = " + (X || (!(Y || Z))));
    }
}
