package myconventer;

import java.awt.FlowLayout;
import java.awt.Panel;
import javax.swing.JPanel;

public class MyConverterTest {

    public static void main(String[] args) {
       Window w = new Window();
       w.setVisible(true);
       
       MyConverter kmToMl = new MyConverter();
       JPanel jp1 = new JPanel();
       jp1 = kmToMl.create("km","miles","convert",1);
       w.add(jp1);
       jp1.setLayout(new FlowLayout());
       
       MyConverter gradToRad = new MyConverter();
       JPanel jp2 = new JPanel();
       jp2 = kmToMl.create("°","r","convert",2);
       w.add(jp2);
       jp2.setLayout(new FlowLayout());
       
       MyConverter gradToF = new MyConverter();
       JPanel jp3 = new JPanel();
       jp3 = kmToMl.create("°C","F","convert",3);
       w.add(jp3);
       jp3.setLayout(new FlowLayout());
       
       MyConverter gradToK = new MyConverter();
       JPanel jp4 = new JPanel();
       jp4 = kmToMl.create("°C","K","convert",4);
       w.add(jp4);
       jp4.setLayout(new FlowLayout());
       
       MyConverter FToK = new MyConverter();
       JPanel jp5 = new JPanel();
       jp5 = kmToMl.create("F","K","convert",5);
       w.add(jp5);
       jp5.setLayout(new FlowLayout());
       
       MyConverter dollarToGrn = new MyConverter();
       JPanel jp6 = new JPanel();
       jp6 = kmToMl.createDolar("$","UAH","convert");
       w.add(jp6);
       jp6.setLayout(new FlowLayout());
    }
    
}
