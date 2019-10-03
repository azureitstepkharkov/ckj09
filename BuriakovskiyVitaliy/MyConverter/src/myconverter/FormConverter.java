/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myconverter;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author asp
 */
public class FormConverter extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton btn = (JButton) ae.getSource();
        if (btn == null) {
            this.lblML.setText("Мой конвертер");
        } else if (btn == btnConvert) {
            String s = t_filKM.getText().replaceAll(" ", "");
            System.out.println(s);
            float f = Integer.valueOf(s);
            f = (float) (f / 1.6);

            t_filML.setText(String.valueOf(f));
        }

    }

    int counter;
    private JLabel lblKM;
    private JTextField t_filKM;
    private JLabel lblML;
    private JTextField t_filML;
    private JButton btnConvert;

    public FormConverter() {
        this.setSize(300, 100);
        this.setTitle("Конвертер");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        this.setLayout(new FlowLayout());
        // 
        lblKM = new JLabel("КМ");
        t_filKM = new JTextField("               ");
        lblML = new JLabel("ML");
        t_filML = new JTextField("               ");

        btnConvert = new JButton("Конверт!");

        this.add(lblKM);
        this.add(t_filKM);
        this.add(btnConvert);
        this.add(t_filML);
        this.add(lblML);

        //       this.btnConvert.addActionListener(this);  
        this.btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                String s = t_filKM.getText().replaceAll(" ", "");
                System.out.println(s);
                float f = Integer.valueOf(s);
                f = (float) (f / 1.6);

                t_filML.setText(String.valueOf(f));
            }
        });

    }

}
