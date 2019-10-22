package main.com.ageev.controller;

import javax.swing.*;
import java.util.Vector;
import main.com.ageev.domain.Organization;

public class OrganizationComboBoxModel extends DefaultComboBoxModel {

    public OrganizationComboBoxModel(Vector<Organization> org){
        super(org);
    }
    public Organization getSelectedItem(){
        Organization selectedUser = (Organization)super.getSelectedItem();
        return selectedUser;
    }
}
