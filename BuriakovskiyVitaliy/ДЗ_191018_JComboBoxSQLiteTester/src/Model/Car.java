package Model;

public class Car {

    public Car(boolean driverInCar, boolean carStarted) {
        this.driverInCar = driverInCar;
        this.carStarted = carStarted;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.driverInCar ? 1 : 0);
        hash = 97 * hash + (this.carStarted ? 1 : 0);
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
        final Car other = (Car) obj;
        if (this.driverInCar != other.driverInCar) {
            return false;
        }
        if (this.carStarted != other.carStarted) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Car{" + "driverInCar=" + driverInCar + ", carStarted=" + carStarted + '}';
    }
    private boolean driverInCar;
    private boolean carStarted;
}
