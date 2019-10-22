package View;


import Controller.WagonCarComboBoxModel;
import Model.DbHelper;
import Model.WagonCar;
import java.awt.FlowLayout;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class WagonCarWindow extends JFrame
{
    Vector<WagonCar> v;
    JComboBox<WagonCar> cbox;
    public WagonCarWindow()
    {
         //минимальная структура окна
        setTitle("Работа с JComboBox");
        setSize(1100, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        //
        DbHelper db = new DbHelper();
        Vector<WagonCar> wCar = db.getWagonCar();
        cbox = new JComboBox<WagonCar>(wCar);//этот конструктор, если используем 
         WagonCarComboBoxModel model 
                = new WagonCarComboBoxModel(wCar);
        cbox.setModel(model);
        //
        this.add(cbox);
    }
    
    
    
}