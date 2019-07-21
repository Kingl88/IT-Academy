package by.it_academy.Lesson7._87_a_5;

public enum TypeOfBinding {
    PAPERBACK("Мягкий"), HARD_COVER("Твердый");
    private String type;

    TypeOfBinding(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
