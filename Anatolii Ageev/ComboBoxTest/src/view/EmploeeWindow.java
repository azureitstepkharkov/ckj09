package view;

import model.DbHelper;
import model.Emploee;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class EmploeeWindow extends JFrame {
    Vector<String> empls;
    JComboBox<String> cbox;
    public EmploeeWindow()
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
        Vector<Emploee> v = db.getEmploee();
        for( Emploee e : v)
        {
            empls.add(e.toString());
        }
        cbox = new JComboBox<String>(empls);//этот конструктор, если используем
        this.add(cbox);
    }
}
