
package myconvertor;

import java.awt.FlowLayout;
import javax.swing.JPanel;


public class MyConvertor {

 
    public static void main(String[] args) {
        Window window = new Window();
        window.setVisible(true);
      
        Panell kmToMl = new Panell();
        JPanel jp1 = new JPanel();
        jp1 = kmToMl.creat("км","мили","convert",1);
        window.add(jp1);
        jp1.setLayout(new FlowLayout());
        
        Panell grRad = new Panell();
        JPanel jp2 = new JPanel();
        jp2 = kmToMl.creat("градусы","радианы","convert",2);
        window.add(jp2);
        jp1.setLayout(new FlowLayout());
        
        Panell grFar = new Panell();
        JPanel jp3 = new JPanel();
        jp3 = kmToMl.creat("градусы","фаренгейты","convert",3);
        window.add(jp3);
        jp3.setLayout(new FlowLayout());
        
        Panell grKel = new Panell();
        JPanel jp4 = new JPanel();
        jp4 = kmToMl.creat("градусы","Кельвины","convert",4);
        window.add(jp4);
        jp4.setLayout(new FlowLayout());
         
        Panell farKel = new Panell();
        JPanel jp5 = new JPanel();
        jp5 = kmToMl.creat("Фаренгейты","Кельвины","convert",5);
        window.add(jp5);
        jp5.setLayout(new FlowLayout());
        
        Panell dolar = new Panell();
        JPanel jp6 = new JPanel();
        jp6 = dolar.createDolar("dolar","грн","convert");
        window.add(jp6);
        jp6.setLayout(new FlowLayout());
    }
    
}
