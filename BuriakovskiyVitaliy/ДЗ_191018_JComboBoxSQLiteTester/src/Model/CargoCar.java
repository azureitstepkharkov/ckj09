package Model;


public class CargoCar extends Car{

    public CargoCar(int carrying, int bodyVolume, boolean driverInCar, boolean carStarted) {
        super(driverInCar, carStarted);
        this.carrying = carrying;
        this.bodyVolume = bodyVolume;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.carrying;
        hash = 97 * hash + this.bodyVolume;
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
        final CargoCar other = (CargoCar) obj;
        if (this.carrying != other.carrying) {
            return false;
        }
        if (this.bodyVolume != other.bodyVolume) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CargoCar{" + "carrying=" + carrying + ", bodyVolume=" + bodyVolume + "}  " + super.toString();
    }


    private int carrying;
    private int bodyVolume;
}
