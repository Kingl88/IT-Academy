package by.it_academy.Lesson6.carlib;

public class Main {

    public static void main(String[] args) throws Exception {
	    Transmission transmission = new AutomaticTransmission((byte) 5);
        Transmission transmission1 = new MechanicalTransmission((byte) 5);
	    PetrolEngine petrolEngine = new PetrolEngine(130, 1700,"AI-95",8);
        DieselEngine dieselEnginelEngine = new DieselEngine(130, 1700);
        PassengerCar car = new PassengerCar(4,2,5,2000, petrolEngine,transmission,"Sedan");
        PassengerCar car1 = new PassengerCar(4,2,5,2000, petrolEngine,transmission1,"Sedan");
        PassengerCar car2 = new PassengerCar(4,2,5,2000, dieselEnginelEngine,transmission1,"Sedan");
        Truck truck = new Truck(6, 3,3,5000,dieselEnginelEngine, transmission, 10000);
//        car.onElectric();
//        car.getTransmission().positionBellCrank("D");
//        car.currentSpeed(60);
//        car.currentSpeed(20);
//        car.currentSpeed(0);
//        car.getTransmission().positionBellCrank("N");
//        car.off();
//        car1.onElectric();
//        car1.getTransmission().positionBellCrank("1");
//        car1.currentSpeed(60);
//        car1.currentSpeed(20);
//        car1.currentSpeed(0);
//        car1.getTransmission().positionBellCrank("N");
//        car1.off();
//        car2.onElectric();
//        car2.getTransmission().positionBellCrank("1");
//        car2.currentSpeed(60);
//        car2.currentSpeed(20);
//        car2.currentSpeed(0);
//        car2.getTransmission().positionBellCrank("N");
//        car2.off();
//        car2.openTrunk();
        truck.onElectric();
        truck.getTransmission().positionBellCrank("D");
        truck.currentSpeed(60);
        truck.currentSpeed(20);
        truck.currentSpeed(0);
        truck.getTransmission().positionBellCrank("N");
        truck.off();
        truck.attachTrailer();
    }
}
