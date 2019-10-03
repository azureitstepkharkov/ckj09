package OOP.pak1;

public class SpecialCar extends Car {
    private int expenseSpecialEquipment;
    private int wearSpecialEquipment;

    public SpecialCar() {
        this.expenseSpecialEquipment = 75;
        this.wearSpecialEquipment = 20;
        System.out.format("Тип автомобиля - спецмащина по умолчанию.\n");
    }

    public SpecialCar(Accumulator accumulator, boolean driverInCar, boolean carStarted, int expenseSpecialEquipment, int wearSpecialEquipment) {
        super(accumulator, driverInCar, carStarted);
        this.expenseSpecialEquipment = expenseSpecialEquipment;
        this.wearSpecialEquipment = wearSpecialEquipment;
        System.out.format("Тип автомобиля - спецмащина. Расходы навесного оборуд %d. Износ %d\n", this.expenseSpecialEquipment, this.wearSpecialEquipment);
    }

    public int getExpenseSpecialEquipment() {
        return expenseSpecialEquipment;
    }

    public void setExpenseSpecialEquipment(int expenseSpecialEquipment) {
        this.expenseSpecialEquipment = expenseSpecialEquipment;
    }

    public int getWearSpecialEquipment() {
        return wearSpecialEquipment;
    }

    public void setWearSpecialEquipment(int wearSpecialEquipment) {
        this.wearSpecialEquipment = wearSpecialEquipment;
    }

    public float calculatProfitableSpecialEquipment(int workTime, int workPrice) {
        float profitableSpecialEquipment = (workPrice - expenseSpecialEquipment) * workTime;
        System.out.format("Прибыльность произведенных работ навесным оборудованием %f\n", profitableSpecialEquipment);
        return profitableSpecialEquipment;
    }

    public float calculatAmortisationSpecialEquipment(int workTime) {
        float AmortisationSpecialEquipment = wearSpecialEquipment * workTime;
        System.out.format("Прибыльность произведенных работ навесным оборудованием %f\n", AmortisationSpecialEquipment);
        return AmortisationSpecialEquipment;
    }
}
