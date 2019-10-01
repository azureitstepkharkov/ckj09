package OOP.pak1;

public abstract class Car {
    private boolean driverInCar;
    private boolean carStarted;
    private Accumulator accumulator;

    public Car() {
        this.driverInCar = false;
        this.carStarted = false;
        accumulator = new Accumulator.AKB(new byte[]{2, 1, 6},new byte[]{1, 8, 5});
        System.out.format("Создан автомобиль по умолчанию. Машина заведена %b. Водитель в машине %b\n", carStarted, driverInCar);
    }

    public Car(Accumulator accumulator, boolean driverInCar, boolean carStarted) {
        this.driverInCar = driverInCar;
        this.carStarted = carStarted;
        this.accumulator = accumulator;
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
        accumulator.charge();
        if (driverInCar && carStarted) {
            accumulator.charge();
            System.out.println("Поехали");
        } else System.out.println("Машина не готова к езде");
    }

    public void stop() {
        System.out.println("Остановились");
    }
}
