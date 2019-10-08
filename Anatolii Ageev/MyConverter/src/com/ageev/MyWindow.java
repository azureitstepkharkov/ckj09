package com.ageev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.text.DecimalFormat;

import static javax.swing.JOptionPane.showMessageDialog;
/*
public class MyWindow extends JFrame implements ActionListener {

    private JLabel lablKm;
    private JLabel labMiles;
    private JButton converter1;
    private JTextField kmValue;
    private JTextField mlValue;

        MyWindow(){
            this.setSize(2000,1000);
            this.setTitle("Converter");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel p = new JPanel();
            this.add(p);
            p.setLayout(new GridLayout(3,6));

           // this.setLayout(new BorderLayout());
            //--------------------------

            lablKm = new JLabel("Km");
            p.add(lablKm);

            kmValue = new JTextField("             ");
           // kmValue.setBounds(1,1,100,1);
          //  kmValue.
            kmValue.setEditable(true);
            p.add(kmValue);

            converter1 = new JButton("->");
            p.add(converter1,BorderLayout.AFTER_LINE_ENDS);

            mlValue  =new JTextField("              ");
            mlValue.setBounds(20,40,10,20);

            p.add(mlValue,BorderLayout.AFTER_LINE_ENDS);

            this.converter1.addActionListener(this);
            labMiles = new JLabel("Miles");
            p.add(labMiles,BorderLayout.AFTER_LINE_ENDS);

        }

    public void actionPerformed(ActionEvent e) {
        try {
            String str = kmValue.getText();
            Double km = Double.parseDouble(str);
            km *= 0.621371f;
            DecimalFormat f = new DecimalFormat("##.00");
            mlValue.setText(f.format(km).toString());
        } catch (NumberFormatException e1) {
            massageBox("Enter a digit value");
        }
    }

    public void massageBox(String str) {
        showMessageDialog(null, str);
    }

   */
//}
