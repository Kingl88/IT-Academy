package by.it_academy.Lesson14.student;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = -4948986733462109776L;
    private String name;
    private int age;
    private int averageMark;

    public Student(String name, int age, int averageMark) {
        setName(name);
        setAge(age);
        setAverageMark(averageMark);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Студент " +
                "имя = '" + name + '\'' +
                ", возраст = " + age +
                ", средняя оценка = " + averageMark;
    }
}
