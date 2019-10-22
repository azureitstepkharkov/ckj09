package Model;

import java.util.Arrays;

public class Accumulator {

    public Accumulator(byte[] voltageSection, byte[] amperageSection) {
        this.voltageSection = voltageSection;
        this.amperageSection = amperageSection;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Arrays.hashCode(this.voltageSection);
        hash = 11 * hash + Arrays.hashCode(this.amperageSection);
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
        final Accumulator other = (Accumulator) obj;
        if (!Arrays.equals(this.voltageSection, other.voltageSection)) {
            return false;
        }
        if (!Arrays.equals(this.amperageSection, other.amperageSection)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Accumulator{" + "voltageSection=" + voltageSection + ", amperageSection=" + amperageSection + '}';
    }

    public byte[] getVoltageSection() {
        return voltageSection;
    }

    public void setVoltageSection(byte[] voltageSection) {
        this.voltageSection = voltageSection;
    }

    public byte[] getAmperageSection() {
        return amperageSection;
    }

    public void setAmperageSection(byte[] amperageSection) {
        this.amperageSection = amperageSection;
    }
    byte[] voltageSection;
    byte[] amperageSection;
}
