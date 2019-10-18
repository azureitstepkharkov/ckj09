package jdbc_oracl_oop;

import java.sql.DriverManager;//управление версиями драйевров

import java.sql.Connection;//механизмы соединения БД
import java.sql.Statement;//для запросов select (update)
import java.sql.CallableStatement;//для работы с ХП
import java.sql.ResultSet;//хранилище результата выборки
//select

import java.util.Date;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBC_Oracl_OOP {

    public static void main(String[] args) {
        //Шаг1 Подключить драйвер
        //Шак 2 Зарегистрировать нужный клас драйвера
        System.out.println("-------- Oracle JDBC Connection Testing ------");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("класс Oracle JDBC не найден в файле ojdbc6.jar");
        }
        System.out.println("Oracle JDBC Driver Registered!");

        Connection connection = null;
        //Шаг 3 настроить соединение. Создать объект класса Connetion. Строка соединения для каждой СУБД совоя

        //Шаг 3 настроить соединение
        //       Connection connection = null;
        try {
            //ORA-12750: Cannot access NLS data files or invalid envir...
            java.util.Locale locale = java.util.Locale.getDefault();
            java.util.Locale.setDefault(java.util.Locale.ENGLISH);
            //объект класса Connection
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system",
                    "123");
            //строка соединеня для каждой
            //СУБД своя
        } catch (SQLException ex) {
            Logger.getLogger(JDBC_Oracl_OOP.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sqlText
                = "SELECT "
                + " HR.DEPARTMENTS.DEPARTMENT_NAME"
                + ",HR.DEPARTMENTS.MANAGER_ID"
                + ",HR.DEPARTMENTS.LOCATION_ID"
                + ",HR.DEPARTMENTS.DEPARTMENT_ID"
                + " FROM HR.DEPARTMENTS";

        System.out.println(sqlText);

        try {
            Statement st; //Механизм выполнения команд SQL
            st = connection.createStatement();//настройка на нужную БД
            ResultSet rs = st.executeQuery(sqlText);
            while (rs.next()) {
                int idDepartment = rs.getInt("DEPARTMENT_ID");
                String dname = rs.getString("DEPARTMENT_NAME");
                int idMangr = rs.getInt("MANAGER_ID");
                int idLocation = rs.getInt("LOCATION_ID");

                System.out.println(" id  " + idDepartment + " d  " + "  " + dname + "  " + idMangr + "  " + idLocation);

            }
        } catch (SQLException ex) {
            System.out.println("Подробнее об ошибке" + ex);
        }

        //-----------------------------------------------------------------------OOP       
        sqlText
                = "SELECT "
                + " ID,"
                + " DRIVER_IN_CAR, "
                + "CAR_STARTED, "
                + "ACCUMULATOR_ID "
                + "FROM HR.CAR";

        System.out.println(sqlText);

        try {
            Statement st; //Механизм выполнения команд SQL
            st = connection.createStatement();//настройка на нужную БД
            ResultSet rs = st.executeQuery(sqlText);
            while (rs.next()) {
                int id = rs.getInt("ID");
                String dname = rs.getString("DRIVER_IN_CAR");
                String started = rs.getString("CAR_STARTED");
                int idAccumulator = rs.getInt("ACCUMULATOR_ID");


                System.out.println(" id  " + id + " d  " + "  " + dname + "  " + started + "  " + idAccumulator);

            }
        } catch (SQLException ex) {
            System.out.println("Подробнее об ошибке" + ex);
        }

    }

}
