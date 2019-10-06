package View;
import Controller.BookComboboxModel;
import Model.Book;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Vector;
import javax.swing.*;

public class MyWindow extends JFrame implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
       JButton btn = (JButton)ae.getSource();
        if (btn == btnSelect)
        {
             Book selectedBook = (Book)cbox.getSelectedItem();
             System.out.println("select ->"+selectedBook);
             JOptionPane.showMessageDialog(MyWindow.this ,
                                           selectedBook);
        }  
    }
    Vector<Book> books;
    JComboBox<Book> cbox;
    private JButton btnSelect;
    private JButton btnRemove;
    
    public MyWindow()
    {
        this.setSize(300,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setTitle("Пример работы с JComboBox для класса Book");
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        //
        cbox = new JComboBox<>();
        books = new Vector<>();
        Book b = new Book("Мойдодыр");
        Book b1 = new Book("Азбука");        
        Book b2 = new Book("Букварь");
        Book b3 = new Book("Атлас дорог Украины");
        books.add(b);
        books.add(b1);
        books.add(b2);
        books.add(b3);
        //
        Collections.sort(books);
        //
        BookComboboxModel model 
                = new BookComboboxModel(books);
        cbox.setModel(model);
        //
        this.add(cbox);
        btnSelect = new JButton("Выбрать");
        this.add(btnSelect);
        btnRemove = new JButton("Удалить");
        this.add(btnRemove);
        btnSelect.addActionListener(this);
        btnRemove.addActionListener(this);
    }
}
