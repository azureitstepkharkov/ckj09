package com.ageev;

import static javax.swing.GroupLayout.*;
import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.LEADING;
import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

public class GroupLayoutTest extends JFrame implements ActionListener {
    private JLabel lablKm = new JLabel("Km: ");
    private JLabel labMiles = new JLabel("ml");
    private JButton converter1 = new JButton("->");
    private JTextField kmValue = new JTextField();
    private JTextField mlValue = new JTextField();


    public GroupLayoutTest(JLabel lablKm, JLabel labMiles,JButton converter1, JTextField kmValue,JTextField mlValue ) {

         kmValue.setEditable(true);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        this.converter1.addActionListener(new ActionListener() {
            @Override
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
        });
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addComponent(lablKm)
                        .addComponent(kmValue)
                        .addComponent(converter1)
                        .addComponent(mlValue)
                        .addComponent(labMiles)
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lablKm)
                                .addComponent(kmValue)
                                .addComponent(converter1)
                                .addComponent(mlValue)
                                .addComponent(labMiles)
                        )
        );

        setTitle("Converter");
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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


}
