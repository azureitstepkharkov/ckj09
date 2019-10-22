package controller;

import model.Emploee;
import model.Emploee;

import javax.swing.*;
import java.util.Vector;

public class EmployeeComboboxModel1 extends DefaultComboBoxModel {
    public EmployeeComboboxModel1(Vector<Emploee> Emploees) {
        super(Emploees);
    }
    public Emploee getSelectedItem(){
        Emploee selectedUser = (Emploee)super.getSelectedItem();
        return selectedUser;
    }
}