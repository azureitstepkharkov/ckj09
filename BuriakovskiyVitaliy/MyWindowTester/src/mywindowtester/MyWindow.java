package mywindowtester;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class MyWindow extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton btn = (JButton) ae.getSource();
        if (btn == null) {
            this.lblResult.setText("Некликабельный компонент");
        } else if (btn == btnAction) {
            counter++;
            String result = String.valueOf(counter);
            String str = String.format("Результат: %s", result);
            this.lblResult.setText(str);
        }

    }

    int counter;
    private JLabel lblMessage;
    private JLabel lblResult;
    private JButton btnAction;
    private JButton btnWork;

    public MyWindow() {
        this.setSize(300, 100);
        this.setTitle("Первая программа swing");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        this.setLayout(new FlowLayout());
        // 
        lblMessage = new JLabel();
        lblMessage.setText("Нажми на кнопку!");

        lblResult = new JLabel("Результат!");

        btnAction = new JButton("Нажми меня!");

        this.add(lblMessage);
        this.add(btnAction);
        this.add(lblResult);
        this.btnAction.addActionListener(this);

        btnWork = new JButton("Кнопка 2");
        this.add(btnWork);
        this.btnWork.addActionListener(this);
    }

}
