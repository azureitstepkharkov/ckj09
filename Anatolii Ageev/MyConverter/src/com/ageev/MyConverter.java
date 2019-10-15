package com.ageev;

import feature.Find;
import javax.swing.*;

public class MyConverter {
    public static void main(String[] args) {
       //  MyWindow w = new MyWindow();
       //  w.setVisible(true);
        // GroupLayoutTest glt = new GroupLayoutTest();
        // glt.setVisible(true);

//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    UIManager.setLookAndFeel(
//                            "javax.swing.plaf.metal.MetalLookAndFeel");
//                    //  "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//                    //UIManager.getCrossPlatformLookAndFeelClassName());
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
//                new GroupLayoutTest().setVisible(true);
//            }
//        });
         JLabel l = new JLabel("Kmss: ");
         JLabel m = new JLabel("mlss");
         JButton c = new JButton("sss->");
        JTextField f1  = new JTextField();
        JTextField f2  = new JTextField();

        GroupLayoutTest t1 = new GroupLayoutTest(l, m, c, f1, f2);
            t1.setVisible(true);
        GroupLayoutTest t2 =   new GroupLayoutTest(l, m, c, f1, f2);
            t2.setVisible(true);

    }
}

