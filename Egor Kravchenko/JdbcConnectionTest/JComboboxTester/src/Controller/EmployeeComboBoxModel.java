package Controller;

import Model.Employee;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class EmployeeComboBoxModel extends DefaultComboBoxModel<Employee>
{
    public EmployeeComboBoxModel(Vector<Employee> employees)
    {
        super(employees);
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
