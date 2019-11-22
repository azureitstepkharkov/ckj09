
package onetomanyjpatest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //!! 
@Table(name = "Departments") 
public class Departments {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "DepartmentsID", unique = true, nullable = false) 
    private int DepartmentsID;
    @Column(name = "Name", unique = false, nullable = false, length = 100) 
    private String Name;

    public Departments() {
    }

    public int getDepartmentsID() {
        return DepartmentsID;
    }

    public void setDepartmentsID(int DepartmentsID) {
        this.DepartmentsID = DepartmentsID;
    }

    public Departments(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "Departments{" + "DepartmentsID=" + DepartmentsID + ", Name=" + Name + '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
}
