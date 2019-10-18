package com.ageev.jdbcSQLLightconnection;
import java.sql.*;


public class SQLLigConnection {

    public static void main(String[] args) {


        System.out.println("-------- Oracle JDBC Connection Testing ------");
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            System.out.println("класс Oracle JDBC не найден в файле ojdbc6.jar");
        }
        System.out.println("Oracle JDBC Driver Registered!");

        //111111111111

        Connection connection = null;
        try {
            //ORA-12705: Cannot access NLS data files or invalid environment specified
            java.util.Locale locale = java.util.Locale.getDefault();
            java.util.Locale.setDefault(java.util.Locale.ENGLISH);
            //объект класса Connection
            connection = DriverManager.getConnection(
                    "jdbc:sqlite:D:\\Clouds\\OneDrive\\00_ШАГ\\Программирование\\Java\\Install\\SQLLite\\test.db");
            java.util.Locale.setDefault(locale);

            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("SELECT EMPLOYEESID, EMPLOYEES_NAME, IDCODE FROM EMPLOYEES");

            while (rs.next()) {
                int EMPLOYEESID = rs.getInt("EMPLOYEESID");
                String EMPLOYEES_NAME = rs.getString("EMPLOYEES_NAME");
                int IDCODE = rs.getInt("IDCODE");
                Object[] args1;
                String result = String.format("id = %d, name = %s, idcod = %d", EMPLOYEESID, EMPLOYEES_NAME, IDCODE);
                System.out.println(result);
            }
            //строка соединеня для каждой
            //СУБД своя
        } catch (SQLException ex) {
            System.out.println("Или серевер не доступен, или пользователь не существует, или пароль не подходит");
            System.out.printf("подробнее об ошибке %s", ex.toString());

        }




    }
}
