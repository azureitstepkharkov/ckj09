/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itstep.manytomanyjpatest;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.List;

@Entity 
@Table(name = "Departments") 
public class Department implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DepartmentsID", unique = true, nullable = false)
    private long departmentsID;
    @Column(name = "Name", unique = false, nullable = false, length = 100)
    private String name;
    //Constructors,  Accessors and mutators for all four fields 
     public Department() {
    }
    public Department(String name) {
        this.name = name;
    }
    public long getDepartmentID() {
        return departmentsID;
    }
    public void setDepartmentID(long employeesId) {
        this.departmentsID = employeesId;
    }
    public String getEmployees_Name() {
        return name;
    }
    public void setEmployees_Name(String name) {
        this.name = name;
    }
     @Override
    public String toString() {
        return "Department{"
                + "id=" + departmentsID
                + ", name='" + name + '\''
                + '}';
    }
    //
    @ManyToMany
    @JoinTable(name = "EmployeesToDepartments",//имя таблицы в базе данных, которая описывает отношение "многие-ко-многим"
    joinColumns = @JoinColumn(name = "EmployeesId"),//имя стоблца в базе данных
    inverseJoinColumns = @JoinColumn(name = "DepartmentsId"))//имя стоблца в базе данных
    //имя стоблца в базе данных
    private List<Employees> employees;
        public List<Employees> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employees> artists) {
        this.employees = artists;
    }
    //
}
