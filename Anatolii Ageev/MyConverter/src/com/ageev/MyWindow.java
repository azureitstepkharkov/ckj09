package com.ageev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.text.DecimalFormat;

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

            this.setLayout(new FlowLayout());
            //--------------------------

            lablKm = new JLabel("Km");
            this.add(lablKm);

            kmValue = new JTextField("             ");
            kmValue.setBounds(1,1,100,10);
          //  kmValue.
            kmValue.setEditable(true);
            this.add(kmValue);

            converter1 = new JButton("->");
            this.add(converter1);

            mlValue  =new JTextField("              ");
            mlValue.setBounds(20,40,10,20);

            this.add(mlValue);

            this.converter1.addActionListener(this);
            labMiles = new JLabel("Miles");
            this.add(labMiles);
        }

    public void actionPerformed(ActionEvent e) {
        String str = kmValue.getText();
        Double km = Double.parseDouble(str);
        km *= 0.621371f;
        DecimalFormat f = new DecimalFormat("##.00");
        mlValue.setText(f.format(km).toString());
    }


}
