package jdbcsqlconnectiontest1;

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


/**
 *
 * @author asp
 */
public class JdbcSQLConnectiontest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("-------- Oracle JDBC Connection Testing ------");
        try {
            Class.forName("org.sqllight.JDBC");
        } catch (ClassNotFoundException ex) {
           System.out.println("класс Oracle JDBC не найден в файле ojdbc6.jar");
        }
        catch (SQLException ex) {
           System.out.println("класс Oracle JDBC не найден в файле ojdbc6.jar");
        }
        System.out.println("Oracle JDBC Driver Registered!");
                    //Шаг 3 настроить соединение
        Connection connection = null;
        try {
        
            connection = DriverManager.getConnection(
                    "jdbc:sqlite:D:\\MyData\\test.db");
            Statement stm = connection.createStatement();
            ResultSet rs= stm.executeQuery(
            "SELECT EMPLOYEESID, EMPLOEES_NAME, IDCODE FROM EMPLOYEES");
            int num = 0;
            
            while (it.hasNext()) {
                int EMPLOYEES_NAME = rs.getInt("IMPLOYEESID");
                String EMPLOYEES_NAME = rs.getString("IMPLOYEES_NAME");
                int IDCODE = rs.getInt("IDCODE");
                String result = 
               String.format("id =%s, name=%s, idcode=%s", IMPLOYEESID,IMPLOYEES_NAME)
                 System.out.println();
                
            }
                
            }
                    
    }
    
}
