

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


public class Departments implements Serializable {
     
    private Integer departmentId;
    private String departmentName;
    private Integer locationId;
    private Integer managerId;
    private List<Employees> employeeList;

    public Departments() {
    }

    public Departments(Integer departmentId, String departmentName, Integer locationId, Integer managerId) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.locationId = locationId;
        this.managerId = managerId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public List<Employees> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employees> employeesList1) {
        this.employeeList = employeesList1;
    }

    public Employees addEmployees(Employees employees) {
        getEmployeeList().add(employees);
        employees.setDepartments(this);
        return employees;
    }

    public Employees removeEmployees(Employees employees) {
        getEmployeeList().remove(employees);
        employees.setDepartments(null);
        return employees;
    }
}

