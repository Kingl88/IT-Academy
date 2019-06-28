package Academy.Lesson1;

public class Document {
    public static void main(String[] args) {
        String whoIsDevoloper = "Иванов";
        String whoIsCheck = "Петров";
        int documentNumber = 3;
        String documentType = "Чертеж";
        boolean isInWork = true;
        String documentName = "Звездочка";

        System.out.println("Название документа: " + documentName);
        System.out.println("Тип документа: " + documentType);
        System.out.println("Кто разработал: " + whoIsDevoloper);
        System.out.println("Кто проверил: " + whoIsCheck);
        System.out.println("Порядковый номер документа: " + documentNumber);
        if(isInWork) {
            System.out.println("Документ еще в работе");
        } else {
            System.out.println("Документ закончен");
        }

    }
}
