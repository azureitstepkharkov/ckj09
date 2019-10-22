package Model;

public class SpecialCar extends  Car{

    public SpecialCar(int expenseSpecialEquipment, int wearSpecialEquipment, boolean driverInCar, boolean carStarted) {
        super(driverInCar, carStarted);
        this.expenseSpecialEquipment = expenseSpecialEquipment;
        this.wearSpecialEquipment = wearSpecialEquipment;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.expenseSpecialEquipment;
        hash = 67 * hash + this.wearSpecialEquipment;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SpecialCar other = (SpecialCar) obj;
        if (this.expenseSpecialEquipment != other.expenseSpecialEquipment) {
            return false;
        }
        if (this.wearSpecialEquipment != other.wearSpecialEquipment) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SpecialCar{" + "expenseSpecialEquipment=" + expenseSpecialEquipment + ", wearSpecialEquipment=" + wearSpecialEquipment + "}  " + super.toString();
    }

    private int expenseSpecialEquipment;
    private int wearSpecialEquipment;  
}
