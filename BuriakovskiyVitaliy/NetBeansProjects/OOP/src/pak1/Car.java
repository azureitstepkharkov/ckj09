package OOP.pak1;

public abstract class Car {
    private boolean driverInCar;
    private boolean carStarted;

    public Car() {
        this.driverInCar = false;
        this.carStarted = false;
        System.out.format("Создан автомобиль по умолчанию. Машина заведена %b. Водитель в машине %b\n", carStarted, driverInCar);
    }

    public Car(boolean driverInCar, boolean carStarted) {
        this.driverInCar = driverInCar;
        this.carStarted = carStarted;
        System.out.format("Создан автомобиль. Машина заведена %b. Водитель в машине %b\n", carStarted, driverInCar);
    }

    public boolean isDriverInCar() {
        return driverInCar;
    }

    public void setDriverInCar(boolean driverInCar) {
        this.driverInCar = driverInCar;
    }

    public boolean isCarStarted() {
        return carStarted;
    }

    public void setCarStarted(boolean carStarted) {
        this.carStarted = carStarted;
    }

    public void run() {
        if (driverInCar && carStarted) {
            System.out.println("Поехали");
        } else System.out.println("Машина не готова к езде");
    }

    public void stop() {
        System.out.println("Остановились");
    }
}
