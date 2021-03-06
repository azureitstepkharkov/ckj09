package View;

import Controller.BookComboboxModel;
import Controller.DepartmentsComboBoxModel;
import Controller.EmployeeComboBoxModel;
import Model.Book;
import Model.DbHelper;
import Model.Departments;
import Model.Employee;
import java.awt.FlowLayout;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class DepartmentsWindows extends JFrame
{
    Vector<Departments> dptms;
    JComboBox<Departments> cbox;
    public DepartmentsWindows()
    {
         //минимальная структура окна
        setTitle("Работа с JComboBox");
        setSize(1100, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        //
        DbHelper db = new DbHelper();
        Vector<Departments> dptms = db.getDepartments();
        cbox = new JComboBox<Departments>(dptms);//этот конструктор, если используем 
         DepartmentsComboBoxModel model = new DepartmentsComboBoxModel(dptms);
        cbox.setModel(model);
        //
        this.add(cbox);
    }
}
