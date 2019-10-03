package myconverter;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        } else if (btn == this.button) {
            countConvert(inputValue1.getText(), inputValue2.getText());
        }
    }

    private JPanel panel;
    private JLabel nameParam1, nameParam2;
    private JTextField inputValue1, inputValue2, outputValue1;
    private JButton button;

    public JPanel creat(String nameParam1, String textButton, String nameParam2, Boolean dopTextField) {
        panel = new JPanel();
        this.nameParam1 = new JLabel(nameParam1);
        this.nameParam2 = new JLabel(nameParam2);
        this.inputValue1 = new JTextField("               ");
        this.inputValue2 = new JTextField("               ");
        this.outputValue1 = new JTextField("                    ");
        this.button = new JButton(textButton);

       // panel.setBackground(Color.yellow);
        panel.add(this.nameParam1);
        panel.add(this.inputValue1);
        if (dopTextField) {
            panel.add(this.inputValue2);
        }
        panel.add(this.button);
        panel.add(this.outputValue1);
        panel.add(this.nameParam2);

        //       this.button.addActionListener(this);  
        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                countConvert(inputValue1.getText(), inputValue2.getText());
            }
        });

        return panel;
    }

    private void countConvert(String inputValue1, String inputValue2) {
     
        this.outputValue1.setText(formula(textFieldToFloat(inputValue1), textFieldToFloat(inputValue2)));
    }
    
    private float textFieldToFloat(String s){
        s = s.replaceAll(" ", "").replaceAll(",", ".");
        return Float.parseFloat((s.equals("")) ? "0" : s);
    }

    abstract public String formula(Float data1, Float data2);

}
