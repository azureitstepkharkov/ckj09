package myconventer;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class MyConventer extends JFrame 
{
    
    private JLabel lblKm;
    private JLabel lblMiles;
    private JTextField txtKm;
    private JTextField txtResult;
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
        this.txtKm = new JTextField("               ");
        this.txtResult = new JTextField("               ");
        this.add(lblKm);
        this.add(txtKm);
        this.add(btnConvert);
        this.add(lblMiles);
        this.add(txtResult);
        
        
        //вариант 1
        //Назначение обработчика клика - все окна реализует ActionListener
        //явно,каждая кнопка передает "свой" клик на общую 
        //this.btnAction.addActionListener(this);//назначение обработчиков клика
        //this.btnWork.addActionListener(this);
        //вариант 2
        //фактически стандарт чистой Java
        this.btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
              String str = txtKm.getText().replace(" ", "");
              float km = Integer.valueOf(str);
              float result = (float)(km/1.6);
              txtResult.setText(String.valueOf(result));
            }
            
        });
        
        
        
        
            
    
    }
            
    
}
