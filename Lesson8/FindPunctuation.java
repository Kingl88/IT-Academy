package by.it_academy.Lesson8;

public class FindPunctuation {
    public static void main(String[] args) {
        int number = 0;
        String str = "HKJhuihkjhk? sfsd,  esf.fsdf !! df ds,,   ..  sdfdsf,";
        char symbol;
        char[] ch = {'.', ',', '!', '?', ':', ';'};
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                symbol = str.charAt(j);
                if(symbol == ch[i]) {
                    number++;
                }
            }
        }
        System.out.println("Количество знаков препинания в строке равно " + number);
    }
}
