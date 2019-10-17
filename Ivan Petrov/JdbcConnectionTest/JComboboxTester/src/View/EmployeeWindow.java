package View;

import Model.Book;
import Model.DbHelper;
import Model.Employee;
import java.awt.FlowLayout;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class EmployeeWindow extends JFrame
{
    Vector<String> empls;
    JComboBox<String> cbox;
    public EmployeeWindow()
    {
         //минимальная структура окна
        setTitle("Работа с JComboBox");
        setSize(360, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        //
        empls = new Vector<String>(1000);//количество элементов, которое не приведет к 
        DbHelper db = new DbHelper();
        Vector<Employee> v = db.getEmployees();
        for( Employee e : v)
        {
            empls.add(e.toString());
        }
        cbox = new JComboBox<String>(empls);//этот конструктор, если используем 
        this.add(cbox);
    }
}
