
package jtabletest;

import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.JTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;

public class JTableTestWindow1 extends JFrame
{
    JTable tblString;
    JTableTestWindow1()
    {
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //опистель заголовков столбцов - то что увидит
        //пользователь
        String[] columns = new String[]
        {
            "Id","Name","Оплата в час","Part Time (t/f)"
        };
        //описатель типов столбцов - чтобы компонент
        //понял как отображать
        Class[] columnsType = new Class[]
        {
            Integer.class,String.class,Double.class, Boolean.class
        };
        //матрица с данными пользователя
        Object[][] data = new Object[][]{
            {1, "Иванов", 40.0, false}
          , {2, "Петров", 70, true}
          , {3, "Сидоров", 60, false}
        };
        //модель данных, которая определяет, какие
        //столбцы можно редактировать и т.п.
        //описание и создание модели данных
        DefaultTableModel model = new DefaultTableModel(data,//данные
                columns)//заголовки столбцов
        {
          @Override
          public boolean  isCellEditable(int row,int column)
          {
              return true;
          }
          @Override
          public Class<?> getColumnClass(int columnIndex)
          {
              return columnsType[columnIndex];
          }
        };
        //
        tblString = new JTable(model);
        setLayout( new BorderLayout() );
        //add(  tblString ,BorderLayout.CENTER);
        add( new JScrollPane( tblString) ,BorderLayout.CENTER);
        //Для всех столбцов, у которых тип Boolean
        tblString.setDefaultRenderer(Boolean.class, new MyRenderer());
        //
        pack();//подобрать размер
        //
    }
}