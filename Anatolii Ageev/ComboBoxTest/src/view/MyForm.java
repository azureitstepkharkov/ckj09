package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class MyForm extends JFrame implements ActionListener {
    Vector<String> books;//feeled from db
    JComboBox<String> cbox; //
    private JButton btnSelect = new JButton("Select");
    private JButton btnDelete = new JButton("Delete");

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (btn==btnSelect){
            String selectBook = (String)cbox.getSelectedItem();
            System.out.println("select ->" + selectBook);
            JOptionPane.showMessageDialog(MyForm.this,selectBook);
        }
        if (btn==btnDelete){
            String selectBook = (String)cbox.getSelectedItem();
            cbox.removeItem(selectBook);
            System.out.println("select ->" + selectBook);
            for (String book:books){
                System.out.println(book);
            }
        }
    }

    public MyForm(){
        this.setSize(300,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My first combobox");
        this.setLayout(new FlowLayout());
        books = new Vector<>(1000);
        books.add("Букварь");
        books.add("Азбука");
        books.add("Введение в програмирование");
        books.add("Атлас дорог украины");
        cbox = new JComboBox<String>(books);

        this.add(cbox);
        this.add(btnDelete);
        this.add(btnSelect);
        btnSelect.addActionListener(this);
        //btnDelete.addActionListener(this);
        btnDelete.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            String selectBook = (String)cbox.getSelectedItem();
                                            cbox.removeItem(selectBook);
                                            System.out.println("select ->" + selectBook);
                                            for (String book:books){
                                                System.out.println(book);
                                            }
                                        }
                                    }
        );
    }
}
