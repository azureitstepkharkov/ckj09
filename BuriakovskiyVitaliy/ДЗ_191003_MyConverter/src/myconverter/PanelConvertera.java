package myconverter;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class PanelConvertera implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton btn = (JButton) ae.getSource();
        if (btn == null) {
            this.nameParam2.setText("Мой конвертер");
        } else if (btn == this.button2) {
            countConvert(inputValue1.getText(), inputValue2.getText());
        }
    }

    private JPanel panel;
    private JPanel panel2;
    private JLabel nameParam1, nameParam2;
    private JTextField inputValue1, inputValue2, outputValue1;
    private JButton button;
    private JButton button2;

    public JPanel creat(String nameParam1, String textButton, String nameParam2, Boolean dopTextField) {
        panel = new JPanel();
        panel.setBackground(new java.awt.Color(127, 255, 0));
        panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        this.nameParam1 = (JLabel) addJLabel(nameParam1);
        this.nameParam2 = (JLabel) addJLabel(nameParam2);

        this.inputValue1 = (JTextField) addJTextField(7);
        this.inputValue2 = (JTextField) addJTextField(0);
        this.outputValue1 = (JTextField) addJTextField(10);

        this.button = new JButton(textButton+">>>");
      //  this.button.setPreferredSize(new Dimension(90, 12));
        this.button2 = new JButton("<<<"+textButton);
     //   this.button2.setPreferredSize(new Dimension(90, 12));

        //  this.nameParam1.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(this.nameParam1);
        panel.add(this.inputValue1);
        if (dopTextField) {
            this.inputValue1.setColumns(4);
            this.inputValue2.setColumns(3);
            panel.add(this.inputValue2);
        }
        panel2.add(this.button);
        panel2.add(this.button2);
        panel.add(panel2);
        panel.add(this.outputValue1);
        // this.nameParam2.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(this.nameParam2);

        this.button2.addActionListener(this);  
        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                countConvert(inputValue1.getText(), inputValue2.getText());
            }
        });

        return panel;
    }

    private Container addJLabel(String nameParam) {
        JLabel jLabel = new JLabel(nameParam);
        jLabel.setPreferredSize(new Dimension(30, 15));
        jLabel.setFont(new Font("Arial", 1, 15));
        return jLabel;
    }
    
    private Container addJTextField(int columnSize) {
        JTextField jTextField = new JTextField(" ",columnSize);
        jTextField.setPreferredSize(new Dimension(30, 55));
        jTextField.setFont(new Font("Arial", 1, 27));
        jTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        return jTextField;
    }

    private void countConvert(String inputValue1, String inputValue2) {
        this.outputValue1.setText(formula(textFieldToFloat(inputValue1), textFieldToFloat(inputValue2)));
    }

    private float textFieldToFloat(String s) {
        s = s.replaceAll(" ", "").replaceAll(",", ".");
        return Float.parseFloat((s.equals("")) ? "0" : s);
    }

    abstract public String formula(Float data1, Float data2);

}
