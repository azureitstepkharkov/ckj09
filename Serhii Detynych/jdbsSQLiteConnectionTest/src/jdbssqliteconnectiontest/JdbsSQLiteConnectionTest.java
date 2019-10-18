package jdbssqliteconnectiontest;

import java.sql.DriverManager;//управление версиями драйевров

import java.sql.Connection;//механизмы соединения БД
import java.sql.Statement;//для запросов select (update)
import java.sql.CallableStatement;//для работы с ХП
import java.sql.ResultSet;//хранилище результата выборки
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
                         //select

public class JdbsSQLiteConnectionTest {

    public static void main(String[] args) {
        //Шаг 1 Подключить драйвер +
        
        System.out.println("-------- Oracle JDBC Connection Testing ------");
        try {
            //Шаг 2 Зарегистировать нужный
            //класс драйвера
            Class.forName("org.sqlite.JDBC");
            //
            Connection connection = null;
            //"jdbc:sqlite:D:\\Путь к БД\\test.db"
            connection = DriverManager.getConnection("jdbc:sqlite:D:\\MyData\\test.db");
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("SELECT EMPLOYEESID, EMPLOYEES_NAME, IDCODE FROM EMPLOYEES");
            int num = 0;
            //5 выполняю текст запроса
                while(rs.next()){
                    int EMPLOYEESID = rs.getInt("EMPLOYEESID");
                    String EMPLOYEES_NAME = rs.getString("EMPLOYEES_NAME");
                    int IDCODE = rs.getInt("IDCODE");
                    //d - decimal; s - string;  f - float;
                    String result = String.format("id = %d, name = %s, idcode = %d ", EMPLOYEESID, EMPLOYEES_NAME, IDCODE);
                    System.out.println(result);
                }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("класс org.sqlite.JDBC не найден в файле sqlite-jdbc-3.8.11.2.jar");
        } catch (SQLException ex) {
            System.out.println("Ошибка в запросе. Подробности: " + ex);
        }
    }
    
}
