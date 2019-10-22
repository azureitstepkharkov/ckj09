package main.com.ageev.domain;

import java.util.Objects;

public class Employee extends LongID{
    private String firstName;
    private String lastName;
    private Long organizationID;
    private Long departmentID;

    public Employee(String firstName, String lastName, Long organizationID, Long departmentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.organizationID = organizationID;
        this.departmentID = departmentID;
    }

    public Employee(Long o, String firstName, String lastName, Long organizationID, Long departmentID) {
        super(o);
        this.firstName = firstName;
        this.lastName = lastName;
        this.organizationID = organizationID;
        this.departmentID = departmentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(Long organizationID) {
        this.organizationID = organizationID;
    }

    public Long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Long departmentID) {
        this.departmentID = departmentID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName) &&
                organizationID.equals(employee.organizationID) &&
                departmentID.equals(employee.departmentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, organizationID, departmentID);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", organizationID=" + organizationID +
                ", departmentID=" + departmentID +
                ", id=" + id +
                '}';
    }
}
