/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onetomanyjpatest;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column; 
import javax.persistence.Entity; //@Entity
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; //@Id
import javax.persistence.OneToMany;
import javax.persistence.Table; 
import javax.persistence.UniqueConstraint; 

@Entity
public class Departments {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DepartmentsId", unique = true, nullable = false)
     private long departmentsId;
     
     @Column(name = "Name", unique = false, nullable = false, length = 100 )
     private String name;

    public Departments() {
    }

    public Departments(String name) {
        this.name = name;
    }

    public long getDepartmentsId() {
        return departmentsId;
    }

    public void setDepartmentsId(long departmentsId) {
        this.departmentsId = departmentsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Departments{" + "departmentsId=" + departmentsId + ", name=" + name + '}';
    }
     
     
    
}
