package by.it_academy.Lesson6.carlib;

public class MechanicalTransmission extends Transmission {

    public MechanicalTransmission(byte numberOfGear) {
        super(numberOfGear);
    }

    @Override
    public void positionBellCrank(Object obj) {
        if(obj instanceof String && obj.toString() == "N") {
            System.out.println("Поставить рычаг в нейтральное положение");
        } else {
            try {
                if(Integer.valueOf(String.valueOf(obj)) instanceof Integer) {
                    System.out.println("Включить передачу номер " + Integer.parseInt(String.valueOf(obj)));
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
