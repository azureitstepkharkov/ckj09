
package jtabletest;

import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.JTable;

public class JTableTestWindow1 extends {

    public JTableTestWindow1() {
        
    }

    
   
      //описание отображаемых заголовков столбцов
        String[] columns = new String[]
        {
            "Id","Name","H.Rate","Part Time (t/f)"
        };
        //описание типов столбцов
        Class[] columnsType = new Class[]
        {
            Integer.class,String.class,Double.class, Boolean.class
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
        
        tblString  = new JTable(model);
        JTableTestWindow1 (new BorderLayout());
     //   add( tblString, BorderLayout.CENTER);
        add(new JScrollPane(tblString), BorderLayout.CENTER);
        pack();
        
}
