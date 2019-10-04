package View;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.*;

public class MyForm extends JFrame implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
       JButton btn = (JButton) ae.getSource();
        if (btn == btnSelect) 
        {
            String selectedBook = (String) cbox.getSelectedItem();
            System.out.println("select ->" + selectedBook);
            JOptionPane.showMessageDialog(MyForm.this,
                    selectedBook);
        }
        
        if (btn == btnRemove) {
            String selectedItem = (String) cbox.getSelectedItem();
            //отображать перестали, но в коллекции все есть
            cbox.removeItem(selectedItem);
            System.out.println("remove ->" + selectedItem);
            //books.remove(selectedItem);
            for (String book : books) {
                System.out.println(book);
            }
        }
    }
    Vector<String> books;//то что заполняем из базы данных
    JComboBox<String> cbox;//компонент для отображения
    private JButton btnSelect;
    private JButton btnRemove;
    public MyForm()
    {
        this.setSize(300,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        //
        books = new Vector<String>(1000);//количество элементов,
        //которое не приведет к запуску алгоритма "ресайзинга" массива
        books.add("Букварь");
        books.add("Азбука");
        books.add("Введение в программирование");
        books.add("Атлас дорог Украины");
        cbox = new JComboBox<String>(books);
        //этот конструктор, если используем 
        //стандартные коллекции и стандартные типы данных
        //cbox = new JComboBox<>();
        //Если будем использовать свою модель данных
        //размещаем компоненты на окне, используя выбранный менеджер размещения
        this.add(cbox);
        //
        btnSelect = new JButton("Выбрать");
        this.add(btnSelect);
        btnRemove = new JButton("Удалить");
        this.add(btnRemove);
        //добавим кнопки выбора и удаления элементов в список
        btnSelect.addActionListener(this);
        btnRemove.addActionListener(this);
        //
    }

    
}
