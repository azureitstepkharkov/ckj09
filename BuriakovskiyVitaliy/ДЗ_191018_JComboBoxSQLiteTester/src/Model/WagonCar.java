package Model;

public class WagonCar extends CargoCar{

    public WagonCar(boolean fasteningSystem, boolean loaderSystemWorks, int carrying, int bodyVolume, boolean driverInCar, boolean carStarted) {
        super(carrying, bodyVolume, driverInCar, carStarted);
        this.fasteningSystem = fasteningSystem;
        this.loaderSystemWorks = loaderSystemWorks;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + (this.fasteningSystem ? 1 : 0);
        hash = 73 * hash + (this.loaderSystemWorks ? 1 : 0);
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
        final WagonCar other = (WagonCar) obj;
        if (this.fasteningSystem != other.fasteningSystem) {
            return false;
        }
        if (this.loaderSystemWorks != other.loaderSystemWorks) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WagonCar{" + "fasteningSystem=" + fasteningSystem + ", loaderSystemWorks=" + loaderSystemWorks + "}  " + super.toString();
    }

    private boolean fasteningSystem;
    private boolean loaderSystemWorks;  
}
