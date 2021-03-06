package jtabletest;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class MyGradeRenderer extends JLabel implements TableCellRenderer {

    public MyGradeRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jtable,
            Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        //boolean partTime = (boolean)value;
        //
        if ((row + 1) % 2 == 0) {
            super.setBackground(Color.GRAY);
        } else {
            super.setBackground(Color.YELLOW);
        }
        //
        Student.Grade grade = (Student.Grade) value;
        if (grade == Student.Grade.A) {
            super.setBackground(Color.GREEN);
            super.setText("A");
        } else if (grade == Student.Grade.B) {
            super.setBackground(Color.BLUE);
            super.setText("B");
        } else if (grade == Student.Grade.C) {
            super.setBackground(Color.RED);
            super.setText("C");
        };
        //
        return this;
    }

}
