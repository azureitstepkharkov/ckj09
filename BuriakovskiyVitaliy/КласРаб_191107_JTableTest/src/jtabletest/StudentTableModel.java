package jtabletest;

import java.util.List;
import javax.swing.table.AbstractTableModel;


public class StudentTableModel extends AbstractTableModel 

{
    //описание отображаемых заголовков столбцов
        String[] columns = new String[]
        {
            "Уровень образования","А","В","C","D"
        };
        //описание типов столбцов
        Class[] columnsType = new Class[]
        {
            Integer.class,
            String.class,
            Student.Grade.class,
            String.class,
            String.class
        };

        List<Student> students;
    public StudentTableModel(List<Student> students)
    {
        this.students = students;
    }

    StudentTableModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Обязательный
    @Override
    public int getRowCount() 
    {
       return students.size();
    }
    //Обязательный
    @Override
    public int getColumnCount()
    {
        return columns.length;
    }
	//Обязательный
    @Override
    public Object getValueAt(int row, int column)
    {
        Student curRow = students.get(row);
        if (0 == column)
        {
            return curRow.getId();
        }else if (1 == column)
        {
            return curRow.getName();
        }else if (2 == column)
        {
            return curRow.getGrade();
        }else if (3 == column)
        {
            return curRow.getEmail();
        }else if (4 == column)
        {
            return curRow.getPhone();
        };
        //
        return null;
    }
    @Override
    public String getColumnName(int column)
    {
        return columns[column];
    }
    @Override
    public Class<?> getColumnClass(int column)
    {
        //влияет на выбор отоюражающего компонента
        return columnsType[column];
    }
}
