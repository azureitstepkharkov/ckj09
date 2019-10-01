package OOP.pak1;

public class CargoCar extends Car {
    private int carrying;
    private int bodyVolume;

    public CargoCar() {
        this.carrying = 20_000;
        this.bodyVolume = 400;
        System.out.println("Тип автомобиля - грузовой автомобиль с параметрами по умолчанию.");
    }

    public CargoCar(Accumulator accumulator, boolean driverInCar, boolean carStarted, int carrying, int bodyVolume) {
        super(accumulator, driverInCar, carStarted);
        this.carrying = carrying;
        this.bodyVolume = bodyVolume;
        System.out.format("Тип автомобиля - грузовой автомобиль. Грузоподьемность %d, Обьем кузов %d\n", this.carrying, this.bodyVolume);
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public int getBodyVolume() {
        return bodyVolume;
    }

    public void setBodyVolume(int bodyVolume) {
        this.bodyVolume = bodyVolume;
    }

    public void unhookTrailer() {
        System.out.println("Прицеп отцеплен");
    }

    public void hookTrailer(int bodyLoadedVolume, int cargoWeight) {
        if (bodyLoadedVolume < bodyVolume && cargoWeight < carrying) {
            System.out.println("Прицеп зацеплен");
        } else System.out.println("Груз превышает допустимые параметры транспортного средства. Прицеп не может быть зацеплен");
    }

}
