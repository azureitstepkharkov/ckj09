/**/
package mywindowstester;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;


public class MyWindow extends JFrame implements ActionListener
        
{
        int counter;
        private JLabel lblMessage;
        private JLabel lblResult;
        private JLabel btnAction;
        private JButton btnWork;
     
        
       
            
    public MyWindow () {
        
    this.setSize(300,100);
    this.setTitle("Моя превая программа");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
this.setLayout(new FlowLayout());
//
    lblMessage = new JLabel();
    lblMessage.setText("Hello world");
    btnAction = new JButton("push my");
    this.lblResult = new JLabel("");
    this.add(lblMessage);
    this.add(btnAction);
    this.add(lblResult);
    this.btnAction.addActionListener(this);
    this.btnWork
    
}

  
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        
        JButton btn =(JButton) ae.getSource();
                if (btn !=null)
                {
                    this.lblResult.setText("no klik");
                }
                else
                {
                    if (btn == btnAction)
                }
         counter ++;
         String result = String.copyValueOf(counter);
         String str String.format("Result %s", os);
         this.lblResult.setText("Result: "result);
         
    }
    }
   
}



