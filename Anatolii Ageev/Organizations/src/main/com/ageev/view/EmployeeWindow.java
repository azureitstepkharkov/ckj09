package main.com.ageev.view;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

import main.com.ageev.controller.DepartmentComboxModel;
import main.com.ageev.controller.EmployeeComboboxModel;
import main.com.ageev.controller.OrganizationComboBoxModel;
import main.com.ageev.domain.Department;
import main.com.ageev.domain.Employee;
import main.com.ageev.domain.Organization;
import main.com.ageev.repositories.DepartmentRepoImpl;
import main.com.ageev.repositories.EmployeeRepoImpl;
import main.com.ageev.repositories.OrganizationRepoImpl;

public class EmployeeWindow extends JFrame {
    Vector<Employee> empls;
    Vector<Department> dep;
    Vector<Organization> org;
    JComboBox<Employee> cbox;
    JComboBox<Department> cbox1;
    JComboBox<Organization> cbox2;
    public EmployeeWindow()
    {
        setTitle("Работа с JComboBox");
        setSize(1300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        EmployeeRepoImpl em = new EmployeeRepoImpl();
        empls = new Vector<>(em.getAll());
        cbox = new JComboBox<Employee>(empls);
        EmployeeComboboxModel model = new EmployeeComboboxModel(empls);
        cbox.setModel(model);

        DepartmentRepoImpl departmets = new DepartmentRepoImpl();
        dep = new Vector<>(departmets.getAll());
        cbox1 = new JComboBox<Department>(dep);
        DepartmentComboxModel modelDep = new DepartmentComboxModel(dep);
        cbox1.setModel(modelDep);

        OrganizationRepoImpl organizationRepo = new OrganizationRepoImpl();
        org = new Vector<>(organizationRepo.getAll());
        cbox2 = new JComboBox<Organization>(org);
        OrganizationComboBoxModel modelOrg = new OrganizationComboBoxModel(org);
        cbox2.setModel(modelOrg);

        this.add(cbox);
        this.add(cbox1);
        this.add(cbox2);
    }

}
