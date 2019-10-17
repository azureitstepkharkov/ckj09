
package jdbcoracleconnection;
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

public class JdbcOracleConnection {

   
    public static void main(String[] args) {
        //Шаг 1 - подключить драйвер из папки с драйверами через свойства проекта - библиотеки
        
        //Шаг 2 - зарегестрировать нужный класс
        System.out.println("-------- Oracle JDBC Connection Testing ------");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
           System.out.println("класс Oracle JDBC не найден в файле ojdbc6.jar");
        }
        System.out.println("Oracle JDBC Driver Registered!");
        
        
        
        //Шаг 3 - настроить соединение обьект класса 
        //строка соединения для каждой субд своя
        Connection connection = null;
        try {
            //ORA-12705: Cannot access NLS data files or invalid environment..
            //изменить кодировку для конкретного подключение(оракл не принимает не 1-байтные)
            java.util.Locale locale = java.util.Locale.getDefault();
            java.util.Locale.setDefault(java.util.Locale.ENGLISH);
            //объект класса Connection
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system",
                    "123"); 
            //поставить обратно кодировку на локальную
            java.util.Locale.setDefault(java.util.Locale.ENGLISH);
            //строка соединеня для каждой
            //СУБД своя
        } 
        catch (SQLException ex) {
            System.out.println("Или сервер недоступен, или пользователь  не существует, или пароль не подходит");
            System.out.printf("Подробнее об ошибке %s", ex.toString());
            //Logger.getLogger(JdbcOracleConnection.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
        String sqlText = "SELECT "
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
    
        Statement st ; //механизм выполнения комманд SQL
        try {
            st = connection.createStatement();//настроить на нужную БД
            ResultSet rs = st.executeQuery(sqlText);//по сути  таблица выборки
            while(rs.next()){
                int id = rs.getInt("EMPLOYEE_ID");
                Date d = rs.getDate("HIRE_DATE");
                String fname = rs.getString("FIRST_NAME");
                String lname = rs.getString("LAST_NAME");
                float sal = rs.getFloat("SALARY");
                String depName = rs.getString("DEPARTMENT_NAME");
                String managerName = rs.getString("MANAGER_FNAME");
                String jobName = rs.getString("JOB_TITLE");
                        
            }
            
        } 
        catch (SQLException ex) {
            System.out.printf("Подробнее об ошибке %s", ex.toString());
        }
    }
    
}
