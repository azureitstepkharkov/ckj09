package View;
import Controller.BookComboBoxModel;
import Model.Book;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Vector;
import javax.swing.*;

public class MyWindow extends JFrame implements ActionListener{

    Vector<Book> books;//то что заполняем из базы данных
    JComboBox<Book> cbox;//компонент для отображения
    private JButton btnSelect;
    private JButton btnRemove;
    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton btn = (JButton) ae.getSource();
        if (btn == btnSelect) 
        {
            String selectedBook = (String) cbox.getSelectedItem();
            System.out.println("select ->" + selectedBook);
            JOptionPane.showMessageDialog(MyWindow.this,
                    selectedBook);
        }
        
        if (btn == btnRemove) {
            
        }
    }
    public MyWindow(){
        this.setSize(300,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setTitle("Пример работы с JComboBox для класса Book");
        
        cbox = new JComboBox<>();
        books = new Vector<>();
        Book b = new Book("Мойдодыр");
        Book b1 = new Book("Азбука");
        Book b2 = new Book("Атлас");
        Book b3 = new Book("Книга");
        books.add(b);
        books.add(b1);
        books.add(b2);
        books.add(b3);
        Collections.sort(books);
        BookComboBoxModel model = new BookComboBoxModel(books);
        
        this.add(cbox);
        cbox.setModel(model);
        //
        btnSelect = new JButton("Выбрать");
        this.add(btnSelect);
        btnRemove = new JButton("Удалить");
        this.add(btnRemove);
        //добавим кнопки выбора и удаления элементов в список
        btnSelect.addActionListener(this);
        btnRemove.addActionListener(this);
        
    }
    
}
