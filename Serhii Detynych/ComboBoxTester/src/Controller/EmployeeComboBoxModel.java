package Controller;

import Model.Department;
import Model.Employee;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class EmployeeComboBoxModel extends DefaultComboBoxModel<Employee>
{
    public EmployeeComboBoxModel(Vector<Employee> employees)
    {
        super(employees);
    }

    public EmployeeComboBoxModel(Vector<Department> empls) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //единственный обязательный, который должен реализовать
    //уточнить
    @Override
    public Employee getSelectedItem()
    {
        Employee selectedUser = (Employee) super.getSelectedItem();
        return selectedUser;
    }
}
