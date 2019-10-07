package tictactoeui;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FormTicTacToe extends JFrame {

    public JFrame jFrame;
    public JPanel jpanSetting, jpanMatrix;
    public JComboBox<String> jCoBoxSetting;
    public JButton[] buttMatrix;
    public JPanel[] jpanButton;

    public Vector<String> vector;

    public FormTicTacToe() {
        jFrame = new JFrame();
        jFrame.setTitle("TicTacToe");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new BoxLayout(jFrame.getContentPane(), BoxLayout.Y_AXIS));

        jpanSetting = new JPanel();
        jpanSetting.setLayout(new BoxLayout(jpanSetting, BoxLayout.X_AXIS));

        jpanMatrix = new JPanel();
        jpanMatrix.setLayout(new GridLayout(3, 3, 5, 5));

        vector = new Vector<String>(2);
        vector.add("Scales Center");
        vector.add("Scales All");

        jCoBoxSetting = new JComboBox<String>(vector);
        jCoBoxSetting.setFont(new Font("Arial", 1, 18));
        jpanSetting.add(jCoBoxSetting);
        jCoBoxSetting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (((String) jCoBoxSetting.getSelectedItem()).equals("Scales Center")) {
                    for (int i = 0; i < jpanButton.length; i++) {
                        if (i != 4) {
                            jpanButton[i].setLayout(new GridBagLayout());
                        } else {
                            jpanButton[i].setLayout(new CardLayout());
                        }
                    }

                }
                
                if (((String) jCoBoxSetting.getSelectedItem()).equals("Scales All")) {
                    for (int i = 0; i < jpanButton.length; i++) {
                        jpanButton[i].setLayout(new GridBagLayout());
                    }
                }
            }
        });

        buttMatrix = new JButton[9];
        jpanButton = new JPanel[9];

        jFrame.add(jpanSetting);
        jFrame.add(jpanMatrix);
        for (int i = 0; i < buttMatrix.length; i++) {
            buttMatrix[i] = new JButton(String.valueOf(i));
            buttMatrix[i].setPreferredSize(new Dimension(70, 70));
            buttMatrix[i].setFont(new Font("Arial", 1, 30));

            jpanButton[i] = new JPanel();

            if (i != 4) {
                jpanButton[i].setLayout(new GridBagLayout());
            } else {
                jpanButton[i].setLayout(new CardLayout());
            }
            jpanButton[i].add(buttMatrix[i]);
            jpanMatrix.add(jpanButton[i]);
        }

        jFrame.pack();
        tipSize();
    }

    public void tipSize() {
        jCoBoxSetting.setMaximumSize(jCoBoxSetting.getSize());
    }
}
