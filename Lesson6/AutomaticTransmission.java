package by.it_academy.Lesson6.carlib;

public class AutomaticTransmission extends Transmission {


    public AutomaticTransmission(byte numberOfGear) {
        super(numberOfGear);
    }

    @Override
    public void positionBellCrank(Object obj) {
        if(obj instanceof String && !(Integer.valueOf(String.valueOf(obj)) instanceof Integer)) {
            System.out.println("Перевести рычаг автоматической коробки передач в положение " + obj.toString());
        }
    }
}