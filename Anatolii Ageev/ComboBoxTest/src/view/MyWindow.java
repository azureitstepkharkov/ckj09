package view;

import controller.BookComboboxModel;
import model.Book;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Vector;

public class MyWindow extends JFrame  implements ActionListener  {
    Vector<Book> books;//feeled from db
    JComboBox<Book> cbox; //
    private JButton btnSelect = new JButton("Select");
    private JButton btnDelete = new JButton("Delete");

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (btn==btnSelect){
            Book selectBook = (Book)cbox.getSelectedItem();
            System.out.println("select ->" + selectBook);
            JOptionPane.showMessageDialog(MyWindow.this,selectBook);
        }
        if (btn==btnDelete){
            Book selectBook = (Book)cbox.getSelectedItem();
            cbox.removeItem(selectBook);
            System.out.println("select ->" + selectBook);
            for (Book book:books){
                System.out.println(book);
            }
        }
    }

    public MyWindow() {
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My first combobox");
        this.setLayout(new FlowLayout());
        cbox = new JComboBox<Book>();
        books = new Vector<>(1000);
        Book b1 = new Book("Букварь");
        Book b2 = new Book("Азбука");
        Book b3 = new Book("Введение в програмирование");
        Book b4 = new Book("Атлас дорог украины");
        Book b5 = new Book("Букварь");
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        Collections.sort(books);
        BookComboboxModel model = new BookComboboxModel(books);

        cbox.setModel(model);

        //cbox = new JComboBox<Book>(books);

        this.add(cbox);
        this.add(btnDelete);
        this.add(btnSelect);
        btnSelect.addActionListener(this);
        //btnDelete.addActionListener(this);
        btnDelete.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            Book selectBook = (Book)cbox.getSelectedItem();
                                            cbox.removeItem(selectBook);
                                            System.out.println("select ->" + selectBook);
                                            for (Book book:books){
                                                System.out.println(book);
                                            }
                                        }
                                    }
        );


    }
}
