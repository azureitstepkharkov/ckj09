package jdbcoracleconnectiontest;
import java.sql.DriverManager;//управление версиями драйевров
import java.sql.Connection;//механизмы соединения БД
import java.sql.Statement;//для запросов select (update)
import java.sql.CallableStatement;//для работы с ХП
import java.sql.ResultSet;//хранилище результата выборки select
import java.util.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JdbcOracleConnectionTest {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //1 Подключить драйыер
       //2 Зарегистрировать нужный класс
               System.out.println("-------- Oracle JDBC Connection Testing ------");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
           System.out.println("класс Oracle JDBC не найден в файле ojdbc6.jar");
        }
        System.out.println("Oracle JDBC Driver Registered!");
        
       // Настроить  соединение
       Connection connection = null;
        try {
            java.util.Locale locale = java.util.Locale.getDefault();//для унификаци если на компьютере не английские настроийки
            java.util.Locale.setDefault((java.util.Locale.ENGLISH));
            //объект класса Connection
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system","123");
            java.util.Locale.setDefault(locale);
            //строка соединеня для каждой
            //СУБД своя
        } catch (SQLException ex) {
            System.out.println("Или серевер не доступен, или пользователь не существует, или пароль не подходит");
            System.out.printf("подробнее об ошибке %s", ex.toString());
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
		Statement st; //механизм віполнения команд sql
        try {
            st = connection.createStatement(); //Настроился на нужноу БД     
            ResultSet rs = st.executeQuery(sqlText);
            while (rs.next()) {                
                int id = rs.getInt("EMPLOYEE_ID");
                Date d = rs.getDate("HIRE_DATE");
                
                String fName = rs.getString("FIRST_NAME");
            //    String lName = rs.getString("LAST_NAME");
            //           String mail = rs.getString("EMAIL");
              //          String fNumber = rs.getString("PHONE_NUMBE");
              //          float salary = rs.getFloat("SALARY");
              //          String jobTitle = rs.getString("JOB_TITLE");
                             System.out.println("id = "+id+" hire_date = "+d+fName);
            }
        } catch (SQLException ex) {
            System.out.printf("подробнее об ошибке %s", ex.toString());
            Logger.getLogger(JdbcOracleConnectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
