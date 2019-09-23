package OOP.pak2;

import OOP.pak1.Car;

public class PassengerCar extends Car {
    private int airbagCount;
    private boolean raisedRoofMechanism;

    public PassengerCar() {
        this.airbagCount = 0;
        this.raisedRoofMechanism = false;
        System.out.format("Тип автомобиля - легково по умолчанию. Подушек безопасности %d. Механизм открывания крыши %b\n", airbagCount, raisedRoofMechanism);
    }

    public PassengerCar(boolean driverInCar, boolean carStarted, int airbagCount, boolean raisedRoofMechanism) {
        super(driverInCar, carStarted);
        this.airbagCount = airbagCount;
        this.raisedRoofMechanism = raisedRoofMechanism;
        System.out.format("Тип автомобиля - легково. Подушек безопасности %d. Механизм открывания крыши %b\n", airbagCount, raisedRoofMechanism);
    }

    public int getAirbagCount() {
        return airbagCount;
    }

    public void setAirbagCount(int airbagCount) {
        this.airbagCount = airbagCount;
    }

    public boolean isRaisedRoofMechanism() {
        return raisedRoofMechanism;
    }

    public void setRaisedRoofMechanism(boolean raisedRoofMechanism) {
        this.raisedRoofMechanism = raisedRoofMechanism;
    }

    public void raiseRoof(boolean roofOpen) {
        if (roofOpen && raisedRoofMechanism) {
            System.out.println("Крыша открывается");
        } else
            System.out.println("Крыша закрывается");
    }

    public void airbagActivation(int numberAirbags) {
        if (airbagCount >= numberAirbags) {
            System.out.format("Активируем пиропатрон в подушке безопасности № %d\n", numberAirbags);
        } else System.out.format("Подушки безопасности № %d в машине нет\n", numberAirbags);

    }
}
