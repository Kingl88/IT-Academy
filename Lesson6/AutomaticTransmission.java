package by.it_academy.Lesson6.carlib;

public class AutomaticTransmission extends Transmission {


    public AutomaticTransmission(byte numberOfGear) {
        super(numberOfGear);
    }

    @Override
    public <T> void positionBellCrank(T obj) {
        {
            System.out.println("Перевести рычаг автоматической коробки передач в положение " + obj.toString());
        }
    }
}