package jdbsoracleconnectionfunction;

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

public class JDBSOracleConnectionFunction {

    public static void main(String[] args) {
        //Шаг 1 Подключить драйвер +
        //Шаг 2 Зарегистировать нужный
        //класс драйвера
        System.out.println("-------- Oracle JDBC Connection Testing ------");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("класс Oracle JDBC не найден в файле ojdbc6.jar");
        }
        System.out.println("Oracle JDBC Driver Registered!");
        //Шаг 3 настроить соединение
        Connection connection = null;
        try {
            //ORA-12705: Cannot access NLS data files or invalid environment specified
            java.util.Locale locale = java.util.Locale.getDefault();
            java.util.Locale.setDefault(java.util.Locale.ENGLISH);
            //объект класса Connection
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system",
                    "123");
            java.util.Locale.setDefault(locale);
            //строка соединеня для каждой
            //СУБД своя
        } catch (SQLException ex) {
            System.out.println("Или серевер не доступен, или пользователь не существует, или пароль не подходит");
            System.out.printf("подробнее об ошибке %s", ex.toString());
            return;
        }


        callSumTwoDigitNambers(connection);
        callCompozition(connection);
        callSumEven(connection);
        callInsertAutor(connection);
        try {
            connection.close();
        }  catch (SQLException ex) {
            System.out.printf("подробнее об ошибке %s", ex.toString());
        }
    }//main

    
    private static void callSumTwoDigitNambers(Connection connection) {
        //callProcForTest(connection);
        System.out.println("call HR.TASK1_1_SUM_TWO_DIGIT_NUMBERS");
        //Вызов ХП
        //КОМАНДЫ НА ODBC диалекте
        String sql = "{? = call HR.TASK1_1_SUM_TWO_DIGIT_NUMBERS ()}";

        CallableStatement stmt;
        try {
            stmt = connection.prepareCall(sql);

            stmt.registerOutParameter(1,
                    java.sql.Types.INTEGER);

//Вызов функции внутри базы данных
            stmt.execute();
            String resultValue = stmt.getString(1);
            System.out.println("result value is "
                    + resultValue );
            stmt.close();
 //
        } catch (SQLException ex) {
            System.out.printf("подробнее об ошибке %s", ex.toString());
        }
    }
    
        private static void callCompozition(Connection connection) {
        //callProcForTest(connection);
        System.out.println("call HR.TASK1_2_COMPOSITION");
        //Вызов ХП
        //КОМАНДЫ НА ODBC диалекте
        String sql = "{? = call HR.TASK1_2_COMPOSITION ()}";

        CallableStatement stmt;
        try {
            stmt = connection.prepareCall(sql);

            stmt.registerOutParameter(1,
                    java.sql.Types.INTEGER);

//Вызов функции внутри базы данных
            stmt.execute();
            String resultValue = stmt.getString(1);
            System.out.println("result value is "
                    + resultValue );
            stmt.close();
//
        } catch (SQLException ex) {
            System.out.printf("подробнее об ошибке %s", ex.toString());
        }
    }

    private static void callSumEven(Connection connection) {
        //callProcForTest(connection);
        System.out.println("call HR.TASK1_3_SUM_EVEN");
        //Вызов ХП
        //КОМАНДЫ НА ODBC диалекте
        String sql = "{? = call HR.TASK1_3_SUM_EVEN(?,?)}";

        CallableStatement stmt;
        try {
            stmt = connection.prepareCall(sql);

            stmt.registerOutParameter(1,
                    java.sql.Types.INTEGER);
           stmt.setInt(2, 0);
           stmt.setInt(3, 100);

//Вызов функции внутри базы данных
            stmt.execute();
            String resultValue = stmt.getString(1);
            System.out.println("result value is "
                    + resultValue );
            stmt.close();
//
        } catch (SQLException ex) {
            System.out.printf("подробнее об ошибке %s", ex.toString());
        }
    }
    
        private static void callInsertAutor(Connection connection) {
        //callProcForTest(connection);
        System.out.println("call HR.TASK2_6_INSERT_AUTOR");
        //Вызов ХП
        //КОМАНДЫ НА ODBC диалекте
        String sql = "{? = call HR.TASK2_6_INSERT_AUTOR(?,?,?,?,?)}";

        CallableStatement stmt;
        try {
            stmt = connection.prepareCall(sql);
/*FULL_NAME IN VARCHAR2 
, ALIAS IN VARCHAR2 
, B_YEAR IN NUMBER 
, PHONE IN VARCHAR2 
, EMAIL IN VARCHAR2*/


            stmt.registerOutParameter(1,
                    java.sql.Types.INTEGER);
           stmt.setString(2, "Ivanov");
           stmt.setString(3, "Kazimov");
           stmt.setInt(4, 1977);
           stmt.setString(5, "+3(080)757-80-45");
           stmt.setString(6, "life@gmail.com");


//Вызов функции внутри базы данных
            stmt.execute();
            String resultValue = stmt.getString(1);
            System.out.println("result value is "
                    + resultValue );
            stmt.close();
            connection.close();
//
        } catch (SQLException ex) {
            System.out.printf("подробнее об ошибке %s", ex.toString());
        }
    }
}

