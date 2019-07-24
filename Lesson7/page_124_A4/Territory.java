package by.it_academy.Lesson7._124_a_4;

public abstract class Territory {
    private String name;

    public Territory(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
