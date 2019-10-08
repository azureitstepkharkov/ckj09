
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
 
    
    
    public Window(){
        
        this.setSize(710,700);
        this.setTitle("Converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout (new FlowLayout());
        
        
        
        
        
        
         
         
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
    
    
}
