package by.it_academy.Lesson7._90_b_5;

import java.util.Objects;

public class Interval {

    private static int id = 1;
    private int idInterval;
    private int pointA;
    private int pointB;
    private boolean isIncluded;

    public Interval(int pointA, int pointB, boolean isIncluded) {
        idInterval = id;
        id++;
        this.pointA = pointA;
        this.pointB = pointB;
        this.isIncluded = isIncluded;
    }

    public int getIdInterval() {
        return idInterval;
    }

    public int getPointA() {
        return pointA;
    }

    public void setPointA(int pointA) {
        this.pointA = pointA;
    }

    public int getPointB() {
        return pointB;
    }

    public void setPointB(int pointB) {
        this.pointB = pointB;
    }

    public boolean isIncluded() {
        return isIncluded;
    }

    public void setIncluded(boolean included) {
        isIncluded = included;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        return pointA == interval.pointA &&
                pointB == interval.pointB &&
                isIncluded == interval.isIncluded;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointA, pointB, isIncluded);
    }

    @Override
    public String toString() {
        if(isIncluded()) {
            return "number " + getIdInterval() + " [" + pointA + ", " + pointB + ']';
        } else return "number " + getIdInterval() +" (" + pointA + ", " + pointB +')';
    }
}
