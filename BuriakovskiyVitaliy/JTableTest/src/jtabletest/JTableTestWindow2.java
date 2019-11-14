package jtabletest;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

class JTableTestWindow2 extends JFrame 
{
    JTable tblString;
    public JTableTestWindow2()
    {
        super("JTable test 2");
        setSize(200, 400);
        //матрица значений
        List<Student> students = new ArrayList();
        students.add(new Student(1,"Иванов",Student.Grade.A, "ivanov@gmail.ru","+3856484"));
        students.add(new Student(2,"Петров",Student.Grade.B,"petrov@gmail.ru","+3856484"));
        students.add(new Student(3,"Сидоров",Student.Grade.C,"sidorov@gmail.ru","+3856484"));
        StudentTableModel model = new StudentTableModel(students);
        tblString = new JTable(model);
        setLayout( new BorderLayout() );
        add( new JScrollPane( tblString) ,BorderLayout.CENTER);
        //
       // tblString.setDefaultRenderer(Student.Grade.class, new MyGradeRenderer());

        MyGradeRenderer myGradeRenderer = new MyGradeRenderer();
        for (int i = 0; i < model.columnsType.length; i++) {
            tblString.setDefaultRenderer(model.columnsType[i],
                    myGradeRenderer);
        }
        
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
