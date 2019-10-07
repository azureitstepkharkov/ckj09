/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myconvertor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author arkal
 */
public class Panell implements ActionListener{
    private JPanel panel;
    private JLabel lbl1, lbl2;
    private JTextField field1, field2, field3;
    private JButton convert;

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public JPanel creat(String lbl1Name, String lbl2Name, String btnName, int num) {
        lbl1 = new JLabel();
        this.lbl1.setText(lbl1Name);
        field1 = new JTextField(10);
        convert = new JButton(btnName);
        field2 = new JTextField(25);
        lbl2 = new JLabel();
        this.lbl2.setText(lbl2Name);
        
        
        panel = new JPanel();
        panel.add(lbl1);
        panel.add(field1);
        panel.add(convert);
        panel.add(field2);
        panel.add(lbl2);
        
        if(num == 1){
        //мили
        this.convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String a = field1.getText();
                float num = Float.parseFloat(a);
                num = (float)(num*0.621371);
                a = Float.toString(num);
                field2.setText(a);
            }
        });
        }
        else if(num == 2){
             //радианы
        this.convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String a = field1.getText();
                float num = Float.parseFloat(a);
                num = (float)(num*0.0174533);
                a = Float.toString(num);
                field2.setText(a);
            }
        });
        }
        
        else if(num == 3){
            //фарингейты
        this.convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String a = field1.getText();
                float num = Float.parseFloat(a);
                num = (float)(((num*9)/5)+32);
                a = Float.toString(num);
                field2.setText(a);
            }
        });
        }
       
        else if(num == 4){
            //кельвины
         this.convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String a = field1.getText();
                float num = Float.parseFloat(a);
                num = (float)(num+275.15);
                a = Float.toString(num);
                field2.setText(a);
            }
        });
        }
        
        else if(num == 5){
            //фарингейты в кельвины
         this.convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String a = field1.getText();
                float num = Float.parseFloat(a);
                num = (float)(((num+459.67)*5)/9);
                a = Float.toString(num);
                field2.setText(a);
            }
        });
        }
        
         
         return panel;
    }
    
    public JPanel createDolar(String lbl1Name, String lbl2Name, String btnName){
        lbl1 = new JLabel();
        this.lbl1.setText(lbl1Name);
        field1 = new JTextField(10);
        convert = new JButton(btnName);
        field2 = new JTextField(25);
        field3 = new JTextField(6);
        lbl2 = new JLabel();
        this.lbl2.setText(lbl2Name);
       
        
        
        panel = new JPanel();
        panel.add(lbl1);
        panel.add(field1);
        panel.add(field3);
        panel.add(convert);
        panel.add(field2);
        panel.add(lbl2);
        
        this.convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String a = field1.getText();
                float num1 = Float.parseFloat(a);
                String b = field3.getText();
                float num2 = Float.parseFloat(b);
                num1 = (float)(num1*num2);
                a = Float.toString(num1);
                field2.setText(a);
            }
        });
        return panel;
    }

    
}
