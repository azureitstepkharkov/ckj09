package com.ageev;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;

public class JTableTestWindow1 extends JFrame {
    JTable tblString;
    JTableTestWindow1() {
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //описание отображаемых заголовков столбцов
        String[] columns = new String[]
                {
                        "Id", "Name", "H.Rate", "Part Time (t/f)"
                };
        //описание типов столбцов
        final Class[] columnsType = new Class[]
                {
                        Integer.class, String.class, Double.class, Boolean.class
                };
        //матрица значений
        Object[][] data = new Object[][]{
                {1, "Иванов", 40.0, false}
                , {2, "Петров", 70, true}
                , {3, "Сидоров", 60, false}
        };


        //описание и создание модели данных
        DefaultTableModel model = new DefaultTableModel(data,//данные
                columns)//заголовки столбцов
        {
            @Override
            public boolean isCellEditable(int row, int column) {
                return true;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnsType[columnIndex];
            }
        };

        tblString = new JTable();
        setLayout(new BorderLayout());
        add(new JScrollPane(tblString),BorderLayout.CENTER);

        tblString.setDefaultRenderer(Boolean.class,new MyRenderer());

        pack();
    }

}
