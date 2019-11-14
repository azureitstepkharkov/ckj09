package jtabletest;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


class MyRenderer 
        extends JCheckBox 
        implements TableCellRenderer {

    public MyRenderer()
    {
        //setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(
            JTable jtable,
            Object value, 
            boolean isSelected, 
            boolean hasFocus, 
            int row, 
            int column)
    {
        boolean partTime = (boolean)value;
        //
        if (partTime)
        {
            super.setBackground(Color.GREEN);
            super.setHorizontalAlignment(CENTER);
            super.setText("true");
            super.setSelected(partTime);
        }else if (partTime==false)
        {
            super.setBackground(Color.RED);
            super.setHorizontalAlignment(LEFT);
            super.setText("false");
            super.setSelected(partTime);
        }
        //
        return this;//например, JLabel
    }
  
    
}

