package main.com.ageev.domain;

import java.util.Objects;

public class Department extends LongID {
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department(Long o, String departmentName) {
        super(o);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(departmentName, that.departmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName);
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", id=" + id +
                '}';
    }
}
