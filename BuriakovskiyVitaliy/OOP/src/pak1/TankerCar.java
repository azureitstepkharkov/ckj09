package OOP.pak1;

public class TankerCar extends CargoCar implements Cargo {
    private boolean hoseConnected;
    private boolean hatchOpen;

    public TankerCar() {
        this.hoseConnected = false;
        this.hatchOpen = false;
        System.out.println("Инициирован автоцистерна с параметрами по умолчанию");
    }

    public TankerCar(Accumulator accumulator, boolean driverInCar, boolean carStarted, int carrying, int bodyVolume, boolean hoseConnected, boolean hatchOpen) {
        super(accumulator, driverInCar, carStarted, carrying, bodyVolume);
        this.hoseConnected = hoseConnected;
        this.hatchOpen = hatchOpen;
        System.out.println("Инициирован автоцистерна и готов к работе");
    }

    public boolean isHoseConnected() {
        return hoseConnected;
    }

    public void setHoseConnected(boolean hoseConnected) {
        this.hoseConnected = hoseConnected;
    }

    public boolean isValveOpen() {
        return hatchOpen;
    }

    public void setValveOpen(boolean valveOpen) {
        this.hatchOpen = valveOpen;
    }

    public void openingTank() {
        if (hatchOpen && hoseConnected) {
            System.out.format("Система готова к сливу сырья \n");
        }else System.out.format("Система не готова \n");
    }

    public void closeTank() {
        hatchOpen = false;
        hoseConnected = false;
        System.out.format("Цистерна закрыта и гоотова к отправке\n");
    }

    @Override
    public void load() {
            System.out.println("Закачиваем сырье в цистерну");
    }
}

