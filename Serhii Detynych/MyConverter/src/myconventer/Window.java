package myconventer;

import java.awt.FlowLayout;
import javax.swing.JFrame;


public class Window extends JFrame{
       
    public Window(){
        this.setSize(710,700);
        this.setTitle("Converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout (new FlowLayout());
    }
    
}
