package by.it_academy.Lesson5;

public class BallScrew {
    private final int MAX_STEP_SCREW = 30; //Максимальный шаг винта
    private final int MIN_STEP_SCREW = 5; //Минимальный шаг винта
    private int stepScrew;

    public BallScrew(int stepScrew) throws Exception {
        setStepScrew(stepScrew);
    }

    public int getStepScrew() {
        return stepScrew;
    }

    public void setStepScrew(int stepScrew) throws Exception {
        if (stepScrew > MIN_STEP_SCREW && stepScrew <= MAX_STEP_SCREW && stepScrew % 5 == 0) {
            this.stepScrew = stepScrew;
        } else {
            throw new Exception("Такого винта не существует");
        }
    }
}
