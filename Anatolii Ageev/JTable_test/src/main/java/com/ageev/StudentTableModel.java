package com.ageev;
//
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class StudentTableModel extends AbstractTableModel

{
    //описание отображаемых заголовков столбцов
    String[] columns = new String[]
            {
                    "Id","Name","Grade"
            };
    //описание типов столбцов
    Class[] columnsType = new Class[]
            {
                    Integer.class,
                    String.class,
                    Student.Grade.class
            };

    List<Student> students;
    public StudentTableModel(List<Student> students)
    {
        this.students = students;
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
        if(0==column){
            return curRow.getId();
        }
        else if(1==column){
            return curRow.getName();
        }
        else if(2==column){
            return curRow.getGrade();
        }
        //???
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
        //
        return columnsType[column];
    }
}
