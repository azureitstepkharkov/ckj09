package View;

import Controller.BookComboboxModel;
import Controller.EmployeeComboBoxModel;
import Model.Book;
import Model.DbHelper;
import Model.Employee;
import java.awt.FlowLayout;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class EmployeeWindow extends JFrame
{
    Vector<Employee> empls;
    JComboBox<Employee> cbox;
    public EmployeeWindow()
    {
         //минимальная структура окна
        setTitle("Работа с JComboBox");
        setSize(1100, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        //
        DbHelper db = new DbHelper();
        Vector<Employee> empls = db.getEmployees();
        cbox = new JComboBox<Employee>(empls);//этот конструктор, если используем 
         EmployeeComboBoxModel model 
                = new EmployeeComboBoxModel(empls);
        cbox.setModel(model);
        //
        this.add(cbox);
    }
    
    
    
}
