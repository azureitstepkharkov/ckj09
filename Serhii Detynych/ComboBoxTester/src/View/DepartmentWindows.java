package View;

import Controller.EmployeeComboBoxModel;
import Model.DBHelper;
import Model.Department;
import Model.Employee;
import java.awt.FlowLayout;

import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class DepartmentWindows extends JFrame{
    
    Vector<Department> empls;
    JComboBox<Department> cbox;
    
    public DepartmentWindows(){
        setTitle("Работа с JComboBox");
        setSize(1100, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        //
        DBHelper db = new DBHelper();
        Vector<Department> empls1 = db.getDepartment();
        cbox = new JComboBox<Department>(empls);//этот конструктор, если используем 
         EmployeeComboBoxModel model 
                = new EmployeeComboBoxModel(empls1);
        cbox.setModel(model);
        //
        this.add(cbox);
    }
    
}
