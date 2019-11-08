
package jtabletest;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class MyGradeRenderer extends JLabel implements TableCellRenderer {
    //idRow
    public MyGradeRenderer() 
    {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jtable,
            Object value, 
            boolean isSelected, 
            boolean hasFocus, 
            int row, 
            int column) 
    {
      // boolean partTime = (boolean)value;
       //
        
           if (row%2==0) {
               super.setBackground(Color.GREEN);
           }else super.setBackground(Color.GRAY);
        
        
           super.setHorizontalAlignment(CENTER);
           super.setText(value.toString());
        System.out.println(row + "  "+ value.toString());
//       Student.Grade grade = (Student.Grade)value;
//       if (grade == Student.Grade.A)
//       {
//           super.setBackground(Color.GREEN);
//           super.setHorizontalAlignment(CENTER);
//           super.setText(grade.toString());
//
//        } else if (grade == Student.Grade.B) {
//            super.setBackground(Color.BLUE);
//            super.setHorizontalAlignment(CENTER);
//            super.setText(grade.toString());
//        } else if (grade == Student.Grade.C) {
//            super.setBackground(Color.RED);
//            super.setHorizontalAlignment(CENTER);
//            super.setText(grade.toString());
//        };
       

       
       //
       return this;
    }
    
}
