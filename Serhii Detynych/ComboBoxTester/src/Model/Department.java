package Model;

import java.util.Date;
import java.util.Objects;

public class Department {
    
    private int depId;
    private String depName;

    @Override
    public String toString() {
        return "Department{" + "depId=" + depId + ", depName=" + depName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.depId;
        hash = 83 * hash + Objects.hashCode(this.depName);
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
        final Department other = (Department) obj;
        if (this.depId != other.depId) {
            return false;
        }
        if (!Objects.equals(this.depName, other.depName)) {
            return false;
        }
        return true;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Department(int depId, String depName) {
        this.depId = depId;
        this.depName = depName;
    }
}
