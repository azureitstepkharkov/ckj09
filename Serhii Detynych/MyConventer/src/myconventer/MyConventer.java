package myconventer;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class MyConventer extends JFrame implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private JLabel lblKm;
    private JLabel lblMiles;
    private JTextField txtKm;
    private JButton btnConvert;
    
    
    public MyConventer()
    {
        this.setSize(600, 200);
        this.setTitle("Конвентер");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        this.setLayout( new FlowLayout() );
        //
        //
        lblKm = new JLabel();
        lblKm.setText("Км");
        btnConvert = new JButton("Конвертация");
        this.lblMiles = new JLabel("Результат: ");
        this.txtKm = new JTextField(20, 50);
        this.add(lblKm);
        this.add(txtKm);
        this.add(btnConvert);
        this.add(lblMiles);
    }
            
    
}
