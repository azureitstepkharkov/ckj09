package main.com.ageev.repositories;

import main.com.ageev.domain.Employee;
import java.sql.*;
import java.util.ArrayList;

public class EmployeeRepoImpl {

    public ArrayList<Employee> getAll(){
        ArrayList<Employee> employees = new ArrayList<Employee>();
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
            ResultSet rs = stm.executeQuery("SELECT ID, FIRST_NAME, LAST_NAME, ORGANIZATION_ID, DEPARTMENT_ID FROM EMPLOYEES");

            while (rs.next()) {
                Long ID = rs.getLong("ID");
                String firstName = rs.getString("FIRST_NAME");
                String lasttName = rs.getString("LAST_NAME");
                Long organizationID = rs.getLong("ORGANIZATION_ID");
                Long departmentID = rs.getLong("DEPARTMENT_ID");

                Employee emp = new Employee(ID,firstName,lasttName,organizationID,departmentID);
                employees.add(emp);

            }
        } catch (
                SQLException ex) {
            System.out.println("Или серевер не доступен, или пользователь не существует, или пароль не подходит");
            System.out.printf("подробнее об ошибке %s", ex.toString());
        }
        return employees;
    }
}
