package main.com.ageev.controller;

import main.com.ageev.domain.Department;

import javax.swing.*;
import java.util.Vector;

public class DepartmentComboxModel extends DefaultComboBoxModel {
    public DepartmentComboxModel(Vector<Department> dep){
        super(dep);
    }
    public Department getSelectedItem(){
        Department selectedUser = (Department)super.getSelectedItem();
        return selectedUser;
    }
}
