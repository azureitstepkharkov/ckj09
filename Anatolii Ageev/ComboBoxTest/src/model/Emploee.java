package model;

import java.util.Date;
import java.util.Objects;

public class Emploee {
    @Override
    public String toString() {
        return "Emploee{" +
                "id=" + id +
                ", d=" + d +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", sal=" + sal +
                ", depName='" + depName + '\'' +
                ", managerName='" + managerName + '\'' +
                ", jobName='" + jobName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emploee emploee = (Emploee) o;
        return id == emploee.id &&
                Float.compare(emploee.sal, sal) == 0 &&
                Objects.equals(d, emploee.d) &&
                Objects.equals(fname, emploee.fname) &&
                Objects.equals(lname, emploee.lname) &&
                Objects.equals(depName, emploee.depName) &&
                Objects.equals(managerName, emploee.managerName) &&
                Objects.equals(jobName, emploee.jobName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, d, fname, lname, sal, depName, managerName, jobName);
    }

    private int id;
    private Date d;
    private String fname;
    private String lname;
    private float sal;
    private String depName;
    private String managerName;
    private String jobName;

    public Emploee(int id, Date d, String fname, String lname, float sal, String depName, String managerName, String jobName) {
        this.id = id;
        this.d = d;
        this.fname = fname;
        this.lname = lname;
        this.sal = sal;
        this.depName = depName;
        this.managerName = managerName;
        this.jobName = jobName;
    }

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
}
