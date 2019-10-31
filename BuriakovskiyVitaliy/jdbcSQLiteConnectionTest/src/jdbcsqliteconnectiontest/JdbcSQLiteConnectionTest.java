
package jdbcsqliteconnectiontest;

import java.sql.DriverManager;//управление версиями драйевров
import java.sql.Connection;//механизмы соединения БД
import java.sql.Statement;//для запросов select (update)
import java.sql.CallableStatement;//для работы с ХП
import java.sql.ResultSet;//хранилище результата выборки
import java.sql.SQLException;
import java.util.Locale;
//select

public class JdbcSQLiteConnectionTest {


    public static void main(String[] args)  {

        //Шаг 1 Подключить драйвер +
        //Шаг 2 Зарегистировать нужный
        //класс драйвера
        System.out.println("-------- Oracle JDBC Connection Testing ------");
        try {
            Class.forName("org.sqlite.JDBC");
           
          //Шаг 3 настроить соединение
        Connection connection = null;
        
            connection = DriverManager.getConnection(
                    "jdbc:sqlite:D:\\MyData\\test.db");
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("SELECT EMPLOYEESID, EMPLOYEES_NAME, IDCODE FROM EMPLOYEES");
            //ResultSet rs = stm.executeQuery("select strftime( '%Y-%W-%w %H:%M:%S.0', PURCHASE_DATE ) as PURCHASE_DATE from ORDERS");
         
            int num = 0;
            while (rs.next()) {
                int EMPLOYEESID = rs.getInt("EMPLOYEESID");
                String EMPLOYEES_NAME = rs.getString("EMPLOYEES_NAME");
                int IDCODE = rs.getInt("IDCODE");
                String result = String.format("Id = %d, name=%s, idcode=%d",EMPLOYEESID, EMPLOYEES_NAME, IDCODE);
                System.out.println(result);
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("класс org.sqlite.JDBC не найден в файле ojdbc611213211.jar");
          //  return v;
        }catch (SQLException ex){
            System.out.println( ex.toString());
        }
      //  System.out.println("Oracle JDBC Driver Registered!");   
    }
    
}
