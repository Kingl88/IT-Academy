package by.it_academy.Lesson7._124_a_4;

public class City extends Territory {

    private static boolean isTheCapital = false;
    private boolean isCapital;
    private boolean isRegionalCentr;

    public City(String name, boolean isCapital, boolean isRegionalCentr) {
        super(name);
        if(!isTheCapital && isCapital) {
            isTheCapital = true;
            this.isCapital = true;
        } else {
            this.isCapital = false;
        }
        this.isRegionalCentr = isRegionalCentr;
    }

    public boolean isRegionalCentr() {
        return isRegionalCentr;
    }

    public void setRegionalCentr(boolean regionalCentr) {
        isRegionalCentr = regionalCentr;
    }

    public boolean isCapital() {
        return isCapital;
    }

    @Override
    public String toString() {
        return getName();
    }
}
