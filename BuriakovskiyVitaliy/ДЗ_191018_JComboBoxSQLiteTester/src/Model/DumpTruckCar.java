package Model;

public class DumpTruckCar extends CargoCar{

    public DumpTruckCar(int angleRaiseBody, boolean BoardBack, int carrying, int bodyVolume, boolean driverInCar, boolean carStarted) {
        super(carrying, bodyVolume, driverInCar, carStarted);
        this.angleRaiseBody = angleRaiseBody;
        this.BoardBack = BoardBack;
    }
    
    public int getAngleRaiseBody() {
        return angleRaiseBody;
    }

    public void setAngleRaiseBody(int angleRaiseBody) {
        this.angleRaiseBody = angleRaiseBody;
    }

    public boolean isBoardBack() {
        return BoardBack;
    }

    public void setBoardBack(boolean BoardBack) {
        this.BoardBack = BoardBack;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.angleRaiseBody;
        hash = 83 * hash + (this.BoardBack ? 1 : 0);
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
        final DumpTruckCar other = (DumpTruckCar) obj;
        if (this.angleRaiseBody != other.angleRaiseBody) {
            return false;
        }
        if (this.BoardBack != other.BoardBack) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DumpTruckCar{" + "angleRaiseBody=" + angleRaiseBody + ", BoardBack=" + BoardBack + "}  " + super.toString();
    }

    private int angleRaiseBody;
    private boolean BoardBack; 
}
