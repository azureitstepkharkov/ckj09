package Model;

public class TankerCar extends CargoCar{

        public TankerCar(boolean hoseConnected, boolean hatchOpen, int carrying, int bodyVolume, boolean driverInCar, boolean carStarted) {
        super(carrying, bodyVolume, driverInCar, carStarted);
        this.hoseConnected = hoseConnected;
        this.hatchOpen = hatchOpen;
    }
    public boolean isHoseConnected() {
        return hoseConnected;
    }

    public void setHoseConnected(boolean hoseConnected) {
        this.hoseConnected = hoseConnected;
    }

    public boolean isHatchOpen() {
        return hatchOpen;
    }

    public void setHatchOpen(boolean hatchOpen) {
        this.hatchOpen = hatchOpen;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.hoseConnected ? 1 : 0);
        hash = 71 * hash + (this.hatchOpen ? 1 : 0);
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
        final TankerCar other = (TankerCar) obj;
        if (this.hoseConnected != other.hoseConnected) {
            return false;
        }
        if (this.hatchOpen != other.hatchOpen) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TankerCar{" + "hoseConnected=" + hoseConnected + ", hatchOpen=" + hatchOpen + "}  " + super.toString();
    }

    private boolean hoseConnected;
    private boolean hatchOpen; 
}
