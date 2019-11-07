package com.ageev;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;

public class RowRenderer extends JLabel implements TableCellRenderer {
    public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();
    public RowRenderer()
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

        DEFAULT_RENDERER.setHorizontalAlignment(JLabel.CENTER);
        Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(
                jtable, value, isSelected, hasFocus, row, column);
        ((JLabel) renderer).setOpaque(true);

        Color foreground, background;
        Color alternate = new Color(0xC0, 0xC0, 0xF0);
        Color lightBlue = new Color(204, 204, 255);

        if (row % 2 == 0) {
            foreground = Color.black;
            background = Color.white;
        } else {
            foreground = Color.black;
            background = lightBlue;
        }

        renderer.setForeground(foreground);
        renderer.setBackground(background);


        return renderer;
    }

}
