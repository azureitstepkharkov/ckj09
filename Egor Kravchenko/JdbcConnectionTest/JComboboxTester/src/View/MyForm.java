
package View;

import java.util.Arrays;
import Controller.BookComboboxModel;
import Model.Book;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MyForm extends JFrame implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
         JButton btn = (JButton)ae.getSource();
        if (btn == btnSelect)
        {
             Book selectedBook = (Book)cbox.getSelectedItem();
             System.out.println("select ->"+selectedBook);
             JOptionPane.showMessageDialog(MyForm.this ,
                                           selectedBook);
                /*
                JOptionPane.showConfirmDialog(ComboBoxWindow1.this ,
                                              selectedBook);
                */
        }
        if (btn == btnRemove)
        {
             Book selectedItem = (Book)cbox.getSelectedItem();
               cbox.removeItem(selectedItem);
               System.out.println("remove ->"+selectedItem);
               
               //books.remove(selectedItem);
               /*
               for(String book : books)
                System.out.println(book);   
               */
               
               books.remove(selectedItem);
               System.out.println();
                for(Book book : books)
                System.out.println(book); 
                System.out.println();
        }
    }
    Vector<Book> books;
    JComboBox<Book> cbox;
    private JButton btnSelect;
    private JButton btnRemove;
    public MyForm()
    {
        //минимальная структура окна
        setTitle("Работа с JComboBox");
        setSize(360, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
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
        
        Collections.sort(books);
        //Arrays.sort(books);
        BookComboboxModel model 
                = new BookComboboxModel(books);

        cbox.setModel(model);
        //
        this.add(cbox);
        //
        btnSelect = new JButton("Выбрать");
        this.add(btnSelect);
        btnRemove = new JButton("Удалить");
        this.add(btnRemove);
        btnSelect.addActionListener(this);
        btnRemove.addActionListener(this);
        
    }

    
}
