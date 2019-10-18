
package Controller;

import Model.Department;
import Model.Employee;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;


public class DepartmentBoxModel extends DefaultComboBoxModel<Department>{
    public DepartmentBoxModel(Vector<Department> deps)
    {
        super(deps);
    }
   
    @Override
    public Department getSelectedItem()
    {
        Department selectedDepartment = (Department) super.getSelectedItem();
        return selectedDepartment;
    }
}
