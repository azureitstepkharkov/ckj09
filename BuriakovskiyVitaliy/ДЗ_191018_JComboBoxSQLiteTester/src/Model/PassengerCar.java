package Model;

public class PassengerCar extends Car{

    public PassengerCar(int airbagCount, boolean raisedRoofMechanism, boolean driverInCar, boolean carStarted) {
        super(driverInCar, carStarted);
        this.airbagCount = airbagCount;
        this.raisedRoofMechanism = raisedRoofMechanism;
    }


    public int getAirbagCount() {
        return airbagCount;
    }

    public void setAirbagCount(int airbagCount) {
        this.airbagCount = airbagCount;
    }

    public boolean isRaisedRoofMechanism() {
        return raisedRoofMechanism;
    }

    public void setRaisedRoofMechanism(boolean raisedRoofMechanism) {
        this.raisedRoofMechanism = raisedRoofMechanism;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.airbagCount;
        hash = 59 * hash + (this.raisedRoofMechanism ? 1 : 0);
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
        final PassengerCar other = (PassengerCar) obj;
        if (this.airbagCount != other.airbagCount) {
            return false;
        }
        if (this.raisedRoofMechanism != other.raisedRoofMechanism) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PassengerCar{" + "airbagCount=" + airbagCount + ", raisedRoofMechanism=" + raisedRoofMechanism + "}  " + super.toString();
    }


    private int airbagCount;
    private boolean raisedRoofMechanism;
}
