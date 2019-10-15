package myconventer;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class MyConverter implements ActionListener
{
    private JPanel jp;
    private JLabel lbl1;
    private JLabel lbl2;
    private JTextField txtField1;
    private JTextField txtField2;
    private JTextField txtField3;
    private JButton btnConvert;
    
    
    
    public JPanel create(String lbl1Name, String lbl2Name, String btnName,int numOfFormula)
    {
        lbl1 = new JLabel();
        this.lbl1.setText(lbl1Name);
        txtField1 = new JTextField(10);
        btnConvert = new JButton(btnName);
        txtField2 = new JTextField(25);
        lbl2 = new JLabel();
        this.lbl2.setText(lbl2Name);
        
        jp = new JPanel();
        jp.add(lbl1);
        jp.add(txtField1);
        jp.add(btnConvert);
        jp.add(txtField2);
        jp.add(lbl2);
        //вариант 1
        //Назначение обработчика клика - все окна реализует ActionListener
        //явно,каждая кнопка передает "свой" клик на общую 
        
        
        //this.btnAction.addActionListener(this);//назначение обработчиков клика
        //this.btnWork.addActionListener(this);
        
        
        //вариант 2
        //фактически стандарт чистой Java
        if(numOfFormula == 1){
        this.btnConvert.addActionListener(new ActionListener() {
            @Override
            //km-->miles
            public void actionPerformed(ActionEvent ae)
                {
                   String str = txtField1.getText();
                   float num = Float.parseFloat(str);
                   num = (float)(num/1.6);
                   str = Float.toString(num);
                   txtField3.setText(str);
                }
            
            });
        }else if(numOfFormula == 2){
        this.btnConvert.addActionListener(new ActionListener() {
            @Override
            //grad-->rad
            public void actionPerformed(ActionEvent ae)
                {
                   String str = txtField1.getText();
                   float num = Float.parseFloat(str);
                   num = (float)(num*0.0174533);
                   str = Float.toString(num);
                   txtField3.setText(str);
                }
            
            });
        }else if(numOfFormula == 3){
        this.btnConvert.addActionListener(new ActionListener() {
            @Override
            //grad-->F
            public void actionPerformed(ActionEvent ae)
                {
                   String str = txtField1.getText();
                   float num = Float.parseFloat(str);
                   num = (float)(((num*9)/5)+32);
                   str = Float.toString(num);
                   txtField3.setText(str);
                }
            
            });
        }else if(numOfFormula == 4){
        this.btnConvert.addActionListener(new ActionListener() {
            @Override
            //grad-->K
            public void actionPerformed(ActionEvent ae)
                {
                   String str = txtField1.getText();
                   float num = Float.parseFloat(str);
                   num = (float)(num+275.15);
                   str = Float.toString(num);
                   txtField3.setText(str);
                }
            
            });
        }else if(numOfFormula == 5){
        this.btnConvert.addActionListener(new ActionListener() {
            @Override
            //F-->K
            public void actionPerformed(ActionEvent ae)
                {
                   String str = txtField1.getText();
                   float num = Float.parseFloat(str);
                   num = (float)(((num+459.67)*5)/9);
                   str = Float.toString(num);
                   txtField3.setText(str);
                }
            
            });
        }
        return jp;
    }
    public JPanel createDolar(String lbl1Name, String lbl2Name, String btnName){
        lbl1 = new JLabel();
        this.lbl1.setText(lbl1Name);
        txtField1 = new JTextField(10);
        btnConvert = new JButton(btnName);
        txtField2 = new JTextField(25);
        txtField3 = new JTextField(6);
        lbl2 = new JLabel();
        this.lbl2.setText(lbl2Name);
       
        
        
        jp = new JPanel();
        jp.add(lbl1);
        jp.add(txtField1);
        jp.add(txtField3);
        jp.add(btnConvert);
        jp.add(txtField2);
        jp.add(lbl2);
        
        this.btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String a = txtField1.getText();
                float num1 = Float.parseFloat(a);
                String b = txtField3.getText();
                float num2 = Float.parseFloat(b);
                num1 = (float)(num1*num2);
                a = Float.toString(num1);
                txtField2.setText(a);
            }
        });
        return jp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
            
    
}
