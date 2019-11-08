/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcomboboxtester;

import View.BooksWindowsJTable;
import View.DepartmentsWindows;
import View.EmployeeWindow;
import View.MyForm;
import View.MyWindow;

/**
 *
 * @author T530
 */
public class JComboboxTester {

 
    public static void main(String[] args) 
    {
       //MyWindow form = new MyWindow();
       //MyForm form = new MyForm();
       EmployeeWindow form = new EmployeeWindow();
       DepartmentsWindows form1 = new DepartmentsWindows();
       BooksWindowsJTable form2 = new BooksWindowsJTable();
       form.setVisible(true);
       form1.setVisible(true);
       form2.setVisible(true);
    }
    
}
