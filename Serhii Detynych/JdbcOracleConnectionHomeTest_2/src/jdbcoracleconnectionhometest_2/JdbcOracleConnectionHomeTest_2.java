package jdbcoracleconnectionhometest_2;

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

public class JdbcOracleConnectionHomeTest_2 {

    
    public static void main(String[] args) {
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
         String sqlText = "SELECT * FROM HR.FURNITURE";
                              
						  
                            //String sqlText = "SELECT * FROM HR.EMPLOYEES"
        System.out.println("You made it, take control your database now!");
        
        
        Statement st;//мехаизм выполнения команд SQL
        try{
        st = connection.createStatement();//настроился на нужную БД
        ResultSet rs = st.executeQuery(sqlText);
            while (rs.next()) {
                int id = rs.getInt("ID");
                int chairQuantity = rs.getInt("CHAIR");
                String material = rs.getString("MATERIAL");
                
                System.out.println("ID = " + id + "; Material = " + material + "; Chair quantity = " + chairQuantity);
                
            }
        } catch (SQLException ex){
                System.out.println("подробнее об ошибке %s"+ ex.toString());
        }
    } 
}
