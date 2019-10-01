
package mywindowtester;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;


public class MyWindow extends JFrame implements ActionListener{
    private JLabel lblMessage;
    private JLabel lblResult;
    private JButton btnAction;
    private JButton btnWork;
    int counter;
      @Override
    public void actionPerformed(ActionEvent ae) {
        JButton btn = (JButton)ae.getSource();
        if(btn == null){
            this.lblResult.setText("Not Clickable");
        }
        else{
            if(btn == btnAction){
                counter++;
                String result = String.valueOf(counter);
                String str = String.format("Clicks %s", result);
                this.lblResult.setText(str);
            }
        }
        
      
    }
    public MyWindow(){
        this.setSize(200,100);
        this.setTitle("First Swing app");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        this.setLayout (new FlowLayout());
        //
        lblMessage = new JLabel();
        lblMessage.setText("Hello World");
        btnAction = new JButton("Press me");
        this.lblResult = new JLabel("Result is");
        this.add(lblMessage);
        this.add(btnAction);
        this.add(lblResult);
        this.btnAction.addActionListener(this);
        //
        this.btnWork = new JButton("Button №2");
        this.add(btnWork);
        this.btnWork.addActionListener(this);
        
    }

  
}
