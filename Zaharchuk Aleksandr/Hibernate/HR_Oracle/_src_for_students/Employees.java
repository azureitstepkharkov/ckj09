

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import hibernatehroracleconnectiontest.yyyyMMddDateAdapter;

/**
 * To create ID generator sequence "EMPLOYEES_ID_SEQ_GEN":
 * CREATE SEQUENCE "EMPLOYEES_ID_SEQ_GEN" INCREMENT BY 50 START WITH 1000;
 */
public class Employees implements Serializable {


    private Double commissionPct;
    private String email;
    private Integer employeeId;
    private String firstName;
    private Date hireDate;
    private String jobId;
    private String lastName;
    private Integer managerId;
    private String phoneNumber;
    private Integer salary;
    private Departments departments;

    public Employees() {
    }

    public Employees(Double commissionPct, Departments departments, String email, Integer employeeId, String firstName,
                     Date hireDate, String jobId, String lastName, Integer managerId, String phoneNumber,
                     Integer salary) {
        this.commissionPct = commissionPct;
        this.departments = departments;
        this.email = email;
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.hireDate = hireDate;
        this.jobId = jobId;
        this.lastName = lastName;
        this.managerId = managerId;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Double getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(Double commissionPct) {
        this.commissionPct = commissionPct;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlJavaTypeAdapter(yyyyMMddDateAdapter.class)
    public Date getHireDate() {
        return hireDate;
    }
    @XmlJavaTypeAdapter(yyyyMMddDateAdapter.class)
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }
}
