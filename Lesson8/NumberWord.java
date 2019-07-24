package by.it_academy.Lesson8;

public class NumberWord {
    public static void main(String[] args) {
        String str = "    hhjh iuiuiui     iuyiuiu привет.здрасте   iuuhhjkdsh\tfsd dshf js.hdf sd f sfewu   wefwe     ";
        String[] str1 = str.trim().split("[^A-Za-zА-Яа-я]+");
        System.out.println("Количество слов в строке равно " + str1.length);
    }
}
