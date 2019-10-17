package jdbcoracleconnectiontest;

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

public class JdbcOracleConnectionTest {

    public static void main(String[] args) {
        // Шаг 1 Подключить драйвер + 
        // Шаг 2 Зарегистрировать нужный класс драйвера
        System.out.println("-------- Oracle JDBC Connection Testing ------");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
           System.out.println("класс Oracle JDBC не найден в файле ojdbc6.jar");
        }
        System.out.println("Oracle JDBC Driver Registered!");
        // Шаг 3 Настроить соединение
        Connection connection = null;
        try {
            //ORA-12705: Cannot access NLS data files or invalid enviro
            java.util.Locale locale = java.util.Locale.getDefault();//узнаем локальную кодировку
            java.util.Locale.setDefault(java.util.Locale.ENGLISH);// меняем локальную кодировку
            //объект класса Connection
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system",
                    "123");
            java.util.Locale.setDefault(locale);//меняем обратно локальную кодировку
        } catch (SQLException ex) {
            System.out.println("Или серевер не доступен, или пользователь не существует, или пароль не подходит");
            System.out.printf("подробнее об ошибке %s", ex.toString());
            return;
        }
        //настройка соединения для каждой СУБД своя
         String sqlText
                              = "SELECT "
                              + "EMP.EMPLOYEE_ID "
                              + ",EMP.HIRE_DATE "
                              + ",EMP.FIRST_NAME "
                              + ",EMP.LAST_NAME "
                              + ",EMP.EMAIL "
                              + ",EMP.PHONE_NUMBER "
                              + ",EMP.SALARY "
                              + ",J.JOB_TITLE "
                              + ",DEP.DEPARTMENT_NAME "
                              + ",M.FIRST_NAME AS MANAGER_FNAME "
                              + "FROM HR.EMPLOYEES EMP "
                              + "LEFT JOIN HR.JOBS J ON J.JOB_ID = EMP.JOB_ID "
                              + "LEFT JOIN HR.DEPARTMENTS DEP ON DEP.DEPARTMENT_ID=EMP.DEPARTMENT_ID "
                              + "LEFT JOIN HR.EMPLOYEES M ON M.EMPLOYEE_ID = EMP.MANAGER_ID ";
						  
                            //String sqlText = "SELECT * FROM HR.EMPLOYEES"
        System.out.println("You made it, take control your database now!");
        
        
        Statement st;//мехаизм выполнения команд SQL
        try{
        st = connection.createStatement();//настроился на нужную БД
        ResultSet rs = st.executeQuery(sqlText);
            while (rs.next()) {
                int id = rs.getInt("EMPLOYEE_ID");
                Date d = rs.getDate("HIRE_DATE");
                String fname = rs.getString("FIRST_NAME");
                String lname = rs.getString("LAST_NAME");
                float sal = rs.getFloat("SALARY");
                String depName = rs.getString("DEPARTMENT_NAME");
                String manageName = rs.getString("MANAGER_FNAME");
                String jobName = rs.getString("JOB_TITLE");
                
                System.out.println("id = "+id+" hire_date = "+d+" name = "+fname+" salary = "+sal);
                
            }
        } catch (SQLException ex){
                System.out.println("подробнее об ошибке %s"+ ex.toString());
        }
    }
    
}
