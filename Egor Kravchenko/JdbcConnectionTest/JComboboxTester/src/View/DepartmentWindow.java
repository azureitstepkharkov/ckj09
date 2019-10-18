
package View;

import Controller.DepartmentBoxModel;
import Controller.EmployeeComboBoxModel;
import Model.DbHelper;
import Model.Department;
import Model.Employee;
import java.awt.FlowLayout;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class DepartmentWindow extends JFrame{
    Vector<Department> deps;
    JComboBox<Department> cboxDep;
    public DepartmentWindow()
    {
         //минимальная структура окна
        setTitle("department");
        setSize(1100, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        //
        DbHelper db1 = new DbHelper();
        Vector <Department> deps = db1.getDepartments();
        cboxDep = new JComboBox<Department>(deps);//этот конструктор, если используем 
        DepartmentBoxModel modell  = new DepartmentBoxModel(deps);
        cboxDep.setModel(modell);
        //
        this.add(cboxDep);
    }
}
