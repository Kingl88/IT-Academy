// Имеется список учащихся класса с указанием роста каждого из них.
// Выяснить, перечислены ли ученики в списке в порядке убывания их роста.
package Academy.Lesson3;

public class Task6_71 {
    public static void main (String[] args) {
        int[] pupil = new int[]{189, 187, 187, 179, 179, 173, 172};
        boolean flag = true;
        for(int i = 0; i < pupil.length - 1; i++) {
            if(pupil[i] < pupil[i + 1])
            {
                flag = false;
                System.out.println("Список учеников составлен не в порядке убывания их роста.");
                break;
            }
        }
        if(flag) {
            System.out.println("Список учеников составлен в порядке убывания их роста.");
        }
    }
}
