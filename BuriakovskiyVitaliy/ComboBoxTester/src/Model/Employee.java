package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Objects;

public class Employee {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Employee(int id, Date d, String fname, String lname, float sal, String depName, String managerName, String jobName) {
        this.id = id;
        this.d = d;
        this.fname = fname;
        this.lname = lname;
        this.sal = sal;
        this.depName = depName;
        this.managerName = managerName;
        this.jobName = jobName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.d);
        hash = 17 * hash + Objects.hashCode(this.fname);
        hash = 17 * hash + Objects.hashCode(this.lname);
        hash = 17 * hash + Float.floatToIntBits(this.sal);
        hash = 17 * hash + Objects.hashCode(this.depName);
        hash = 17 * hash + Objects.hashCode(this.managerName);
        hash = 17 * hash + Objects.hashCode(this.jobName);
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
        final Employee other = (Employee) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Float.floatToIntBits(this.sal) != Float.floatToIntBits(other.sal)) {
            return false;
        }
        if (!Objects.equals(this.fname, other.fname)) {
            return false;
        }
        if (!Objects.equals(this.lname, other.lname)) {
            return false;
        }
        if (!Objects.equals(this.depName, other.depName)) {
            return false;
        }
        if (!Objects.equals(this.managerName, other.managerName)) {
            return false;
        }
        if (!Objects.equals(this.jobName, other.jobName)) {
            return false;
        }
        if (!Objects.equals(this.d, other.d)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", d=" + d + ", fname=" + fname + ", lname=" + lname + ", sal=" + sal + ", depName=" + depName + ", managerName=" + managerName + ", jobName=" + jobName + '}';
    }

    private int id;
    private Date d;
    private String fname;
    private String lname;
    private float sal;
    private String depName;
    private String managerName;
    private String jobName;
    
    
    
}
