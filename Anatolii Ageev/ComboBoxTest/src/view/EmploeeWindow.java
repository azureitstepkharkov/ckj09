package view;

import controller.EmployeeComboboxModel1;
import model.DbHelper;
import model.Emploee;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;


public class EmploeeWindow extends JFrame {
    Vector<Emploee> empls;
    JComboBox<Emploee> cbox;
    public EmploeeWindow()
    {
        //минимальная структура окна
        setTitle("Работа с JComboBox");
        setSize(1100, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        //
        DbHelper db = new DbHelper();
        Vector<Emploee> empls = db.getEmploees();
        cbox = new JComboBox<Emploee>(empls);//этот конструктор, если используем 
        EmployeeComboboxModel1 model
                = new EmployeeComboboxModel1(empls);
        cbox.setModel(model);
        //
        this.add(cbox);
    }
}
