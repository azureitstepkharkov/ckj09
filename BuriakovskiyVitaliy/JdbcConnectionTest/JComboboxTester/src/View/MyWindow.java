package View;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.*;

public class MyWindow extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton btn = (JButton) ae.getSource();
        if (btn == btnSelect) {
            String selectedBook = (String) cbox.getSelectedItem();
            System.out.println("select ->" + selectedBook);
            JOptionPane.showMessageDialog(MyWindow.this,
                    selectedBook);
        }
        if (btn == btnRemove) {
            String selectedItem = (String) cbox.getSelectedItem();
            cbox.removeItem(selectedItem);
            System.out.println("remove ->" + selectedItem);
            //books.remove(selectedItem);//отображать перестали, но в коллекции все есть
            for (String book : books) {
                System.out.println(book);
            }
        }

    }
    //String[] books;
    Vector<String> books;
    JComboBox<String> cbox;
    private JButton btnSelect;
    private JButton btnRemove;

    public MyWindow() {
        //минимальная структура окна
        setTitle("Работа с JComboBox");
        setSize(360, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        //
        books = new Vector<String>(1000);//количество элементов, которое не приведет к 
        //запуску алгоритма "ресайзинга" массива
        books.add("Букварь");
        books.add("Азбука");
        books.add("Введение в программирование");
        books.add("Атлас дорог Украины");

        cbox = new JComboBox<String>(books);//этот конструктор, если используем 
        //стандартные коллекции и стандартные типы данных
        //cbox = new JComboBox<>();//Если будем использовать свою модель данных
        //размещаем компоненты на окне, используя выбранный менеджер размещения
        this.add(cbox);
        //
        this.add(cbox);
        btnSelect = new JButton("Выбрать");
        this.add(btnSelect);
        btnRemove = new JButton("Удалить");
        this.add(btnRemove);
        //добавим кнопки выбора и удаления элементов в список
        btnSelect.addActionListener(this);
        //btnRemove.addActionListener( e -> System.out.println("Click Detected by Lambda Listener") );
         btnRemove.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
               
            }
        });
        btnRemove.addActionListener(e -> {
            String selectedItem = (String) cbox.getSelectedItem();
            cbox.removeItem(selectedItem);
            System.out.println("remove ->" + selectedItem);
            //books.remove(selectedItem);//отображать перестали, но в коллекции все есть
            for (String book : books) {
                System.out.println(book);
            }
        });
        //
    }

}
