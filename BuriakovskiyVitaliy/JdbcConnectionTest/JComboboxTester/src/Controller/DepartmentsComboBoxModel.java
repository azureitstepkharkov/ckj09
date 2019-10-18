package Controller;

import Model.Departments;
import Model.Employee;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class DepartmentsComboBoxModel extends DefaultComboBoxModel<Departments>
{
    public DepartmentsComboBoxModel(Vector<Departments> departments)
    {
        super(departments);
    }
    //единственный обязательный, который должен реализовать
    //уточнить
    @Override
    public Departments getSelectedItem()
    {
        Departments selectedUser = (Departments) super.getSelectedItem();
        return selectedUser;
    }
}