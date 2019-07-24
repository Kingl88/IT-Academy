package by.it_academy.Lesson6.carlib;

public class MechanicalTransmission extends Transmission {

    public MechanicalTransmission(byte numberOfGear) {
        super(numberOfGear);
    }

    @Override
    public<T> void positionBellCrank(T obj) {
        if(obj == "N") {
            System.out.println("Поставить рычаг в нейтральное положение");
        } else {
            try {
                    System.out.println("Включить передачу номер " + Integer.parseInt(String.valueOf(obj)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
