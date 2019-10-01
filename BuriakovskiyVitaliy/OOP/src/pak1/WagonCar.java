package OOP.pak1;

public class WagonCar extends CargoCar  {
    private boolean fasteningSystem;
    private boolean loaderSystemWorks;

    public WagonCar() {
        this.fasteningSystem = true;
        this.loaderSystemWorks = false;
        System.out.println("Инициирована фура с параметрами по умолчанию");
    }

    public WagonCar(Accumulator accumulator, boolean driverInCar, boolean carStarted, int carrying, int bodyVolume, boolean fasteningSystem, boolean loaderSystemWorks) {
        super(accumulator, driverInCar, carStarted, carrying, bodyVolume);
        this.fasteningSystem = fasteningSystem;
        this.loaderSystemWorks = loaderSystemWorks;
        System.out.println("Инициирована фура и готов к работе");
    }

    public boolean isFasteningSystem() {
        return fasteningSystem;
    }

    public void setFasteningSystem(boolean fasteningSystem) {
        this.fasteningSystem = fasteningSystem;
    }

    public boolean isLoaderSystemWorks() {
        return loaderSystemWorks;
    }

    public void setLoaderSystemWorks(boolean loaderSystemWorks) {
        this.loaderSystemWorks = loaderSystemWorks;
    }

    public void openingTent() {
        System.out.println("Отрытие тента");
    }

    public boolean closingTent() {
        if (fasteningSystem && !loaderSystemWorks) {
            System.out.println("Тент закрывается");
            return true;
        } else {
            System.out.println("Тент не может быть закрыт");
            return false;
        }
    }

//    @Override
//    public void load() {
//            System.out.println("Расставляем товар в фуре");
//    }
}
