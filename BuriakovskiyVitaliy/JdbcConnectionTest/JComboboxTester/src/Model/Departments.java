
package Model;

import java.util.Date;
import java.util.Objects;


public class Departments {

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Departments(int idDepartment, String dname) {
        this.idDepartment = idDepartment;
        this.dname = dname;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.idDepartment;
        hash = 79 * hash + Objects.hashCode(this.dname);
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
        final Departments other = (Departments) obj;
        if (this.idDepartment != other.idDepartment) {
            return false;
        }
        if (!Objects.equals(this.dname, other.dname)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Departments{" + "idDepartment=" + idDepartment + ", dname=" + dname + '}';
    }

    private int idDepartment;
    private String dname;
}
