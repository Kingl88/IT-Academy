package by.it_academy.Lesson8;

public class EndWord {
    public static void main(String[] args) {
        String str = "  ddgdfgdf d   fghdfgdf df dddd d  ueir  ds gsdfwe df    fgkdsh g   dfh  ";
        String[] str1 = str.trim().split("[^A-Za-zА-Яа-я]+");
        for(String str2 : str1) {
                System.out.print(str2.charAt(str2.length() - 1));
        }
    }
}
