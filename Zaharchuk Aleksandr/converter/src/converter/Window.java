
package converter;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
public class Window extends JFrame implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
       JButton btn = (JButton) ae.getSource();
       if (btn == null)
       {
          
       }
       else
       {
           
           {
       counter++;
       String result = String.valueOf(counter);
       String str = String.format("Результат %s", result);
       //System.ou.printf
       
           }
       }
    }
    int counter;
    
    private JLabel lblKm;
    public JTextField lblKmFiald;
    private JLabel lblMile;
   
    private JButton btnAction;
    private JButton btnWork;
    public Window() 
    {
        this.setSize(600,100);
        this.setTitle("Конвертер");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        this.setLayout(  new FlowLayout()    );
        //
        lblKm = new JLabel();
        lblKm.setText("Километры");
        lblKmFiald = new JTextField("                           ");
        btnAction = new JButton("Конвертировать");
       
        this.add(lblKm);
        this.add(lblKmFiald);
        this.add(btnAction);
        
      
        
        //
       
        
    }

    
}
