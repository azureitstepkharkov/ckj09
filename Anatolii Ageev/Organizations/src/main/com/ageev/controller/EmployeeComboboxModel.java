package main.com.ageev.controller;

import main.com.ageev.domain.Employee;

import javax.swing.*;
import java.util.Vector;

public class EmployeeComboboxModel extends DefaultComboBoxModel {
    public EmployeeComboboxModel(Vector<Employee> employees){
        super(employees);
    }
    public Employee getSelectedItem(){
        Employee selectedUser = (Employee)super.getSelectedItem();
        return selectedUser;
    }
}
