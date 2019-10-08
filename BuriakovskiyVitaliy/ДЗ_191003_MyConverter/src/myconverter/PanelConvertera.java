package myconverter;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class PanelConvertera implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton btn = (JButton) ae.getSource();
        if (btn == null) {
            this.nameParam2.setText("Мой конвертер");
        } else if (btn == this.button2) {
            countConvertRevers(inputValue3.getText(), inputValue2.getText());
        }
    }

    private JPanel panel1;
    private JPanel panel2;
    private JLabel nameParam1, nameParam2;
    private JTextField inputValue1, inputValue2, inputValue3;
    private JButton button;
    private JButton button2;

    public JPanel creat(String nameParam1, String textButton, String nameParam2, Boolean dopTextField) {
        panel1 = new JPanel();
        panel1.setBackground(new java.awt.Color(127, 255, 0));
        panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        this.nameParam1 = (JLabel) addJLabel(nameParam1);
        this.nameParam2 = (JLabel) addJLabel(nameParam2);

        this.inputValue1 = (JTextField) addJTextField(7);
        this.inputValue2 = (JTextField) addJTextField(0);
        this.inputValue3 = (JTextField) addJTextField(10);

        this.button = new JButton(textButton + ">>>");
        this.button2 = new JButton("<<<" + textButton);

        panel1.add(this.nameParam1);
        panel1.add(this.inputValue1);
        if (dopTextField) {
            this.inputValue1.setColumns(3);
            this.inputValue2.setColumns(3);
            panel1.add(new JLabel("    "));
            panel1.add(this.inputValue2);
        }
        panel2.add(this.button);
        panel2.add(this.button2);
        panel1.add(panel2);
        panel1.add(this.inputValue3);
        // this.nameParam2.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel1.add(this.nameParam2);

        this.button2.addActionListener(this);
        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                countConvert(inputValue1.getText(), inputValue2.getText());
            }
        });

        return panel1;
    }

    private Container addJLabel(String nameParam) {
        JLabel jLabel = new JLabel(nameParam);
        jLabel.setPreferredSize(new Dimension(30, 15));
        jLabel.setFont(new Font("Arial", 1, 15));
        return jLabel;
    }

    private Container addJTextField(int columnSize) {
        JTextField jTextField = new JTextField(" ", columnSize);
        jTextField.setPreferredSize(new Dimension(30, 55));
        jTextField.setFont(new Font("Arial", 1, 27));
        jTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        return jTextField;
    }

    private void countConvert(String inputValue1, String inputValue2) {
        try {
            Float f = formula(textFieldToFloat(inputValue1), textFieldToFloat(inputValue2));
            this.inputValue3.setText(String.valueOf(new DecimalFormat("#0.00").format(f)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Формат ввода значения не поддерживается. Введите значение заново!", "Ошибка!", 2);
        }

    }

    private void countConvertRevers(String outputValue1, String inputValue2) {
        try {
            Float f = formulaRevers(textFieldToFloat(outputValue1), textFieldToFloat(inputValue2));
            this.inputValue1.setText(String.valueOf(new DecimalFormat("#0.00").format(f)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Формат ввода значения не поддерживается. Введите значение заново!", "Ошибка!", 2);
        }
    }

    private float textFieldToFloat(String s) {
        s = s.replaceAll(" ", "").replaceAll(",", ".");
        return Float.parseFloat((s.equals("")) ? "0" : s);
    }

    abstract public float formula(Float data1, Float data2);

    abstract public float formulaRevers(Float data1, Float data2);

}
