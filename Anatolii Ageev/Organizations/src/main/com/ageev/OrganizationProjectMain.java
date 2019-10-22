package main.com.ageev;


import main.com.ageev.repositories.EmployeeRepoImpl;
import main.com.ageev.view.EmployeeWindow;

public class OrganizationProjectMain {

    public static void main(String[] args) {
        EmployeeWindow form = new EmployeeWindow();
        form.setVisible(true);
    }

}
