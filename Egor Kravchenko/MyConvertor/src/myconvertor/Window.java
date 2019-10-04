
package myconvertor;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener{
    private JLabel lblKm;
    private JLabel lblMiles;
    private JButton btnConvert;
    private JTextField fieldMiles; 
    private JTextField fieldKm; 
    
    
    public Window(){
        
        this.setSize(2000,1000);
        this.setTitle("Converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout (new FlowLayout());
        
        lblKm = new JLabel();
        this.lblKm.setText("km");
        fieldKm = new JTextField(10);
        btnConvert = new JButton("Convert from km to miles");
        fieldMiles = new JTextField(25);
        lblMiles = new JLabel();
        this.lblMiles.setText("miles");
        
        
        
        this.add(lblKm);
        this.add(fieldKm);
        this.add(btnConvert);
        this.add(fieldMiles);
        this.add(lblMiles);
        
        
         this.btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String a = fieldKm.getText();
                float num = Float.parseFloat(a);
                num = (float)(num*0.621371);
                a = Float.toString(num);
                fieldMiles.setText(a);
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
    
    
}
