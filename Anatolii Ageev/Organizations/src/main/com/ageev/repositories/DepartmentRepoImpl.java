package main.com.ageev.repositories;

import main.com.ageev.domain.Department;

import java.sql.*;
import java.util.ArrayList;

public class DepartmentRepoImpl {
    public ArrayList<Department> getAll(){

        ArrayList<Department> departments = new ArrayList<Department>();
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            System.out.println("класс sqlite.JDBC не найден в файле sqlite-jdbc-3.8.11.2.jar");
        }

        Connection connection = null;
        try {
            java.util.Locale locale = java.util.Locale.getDefault();
            java.util.Locale.setDefault(java.util.Locale.ENGLISH);
            connection = DriverManager.getConnection(
                    "jdbc:sqlite:D:\\javaGitTest\\ckj09\\Anatolii Ageev\\orcl\\organizations.db");
            java.util.Locale.setDefault(locale);
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("SELECT ID, NAME FROM DEPARTMENTS");

            while (rs.next()) {
                Long ID = rs.getLong("ID");
                String name = rs.getString("NAME");

                Department dep = new Department(ID,name);
                departments.add(dep);

            }
        } catch (SQLException ex) {
            System.out.println("Или серевер не доступен, или пользователь не существует, или пароль не подходит");
            System.out.printf("подробнее об ошибке %s", ex.toString());
        }
        return departments;

    }
}
