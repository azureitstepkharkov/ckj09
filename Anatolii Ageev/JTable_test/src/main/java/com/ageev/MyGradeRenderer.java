package com.ageev;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class MyGradeRenderer extends JLabel implements TableCellRenderer {
    Color foreground, background;
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
        Student.Grade grade = (Student.Grade)value;
        if(grade== Student.Grade.A)
        {
            super.setBackground(Color.GREEN);
            super.setText(grade.toString());
        } else if(grade== Student.Grade.B)
        {
            super.setBackground(Color.BLUE);
            super.setText(grade.toString());
        } else if(grade== Student.Grade.C)
        {
            super.setBackground(Color.RED);
            super.setText(grade.toString());
        };

        if (row % 2 == 0) {
            foreground = Color.black;
            background = Color.white;
        } else {
            foreground = Color.black;
            background = Color.blue;
        }


        return this;
    }

}
