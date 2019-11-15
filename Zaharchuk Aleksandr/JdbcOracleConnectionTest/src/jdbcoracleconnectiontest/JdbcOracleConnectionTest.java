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
                    "jdbc:oracle:thin:@localhost:1521:xe", "hr_copy",
                    "hr");
            java.util.Locale.setDefault(locale);
            //строка соединеня для каждой
            //СУБД своя
        } catch (SQLException ex) {
            System.out.println("Или серевер не доступен, или пользователь не существует, или пароль не подходит");
            System.out.printf("подробнее об ошибке %s", ex.toString());
            return;
        }
        //
        System.out.println("You made it, take control your database now!");
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
        Statement st;//механизм выполнения команд SQL
        try {
            st = connection.createStatement();//настроился на нужную БД
            ResultSet rs = st.executeQuery(sqlText);
            List<Employee> employees = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("EMPLOYEE_ID");
                Date d = rs.getDate("HIRE_DATE");
                //
                String fname = rs.getString("FIRST_NAME");
                String lname = rs.getString("LAST_NAME");
                float sal = rs.getFloat("SALARY");
                String depName = rs.getString("DEPARTMENT_NAME");;
                String managerName = rs.getString("MANAGER_FNAME");;
                String jobName = rs.getString("JOB_TITLE");
                //
                System.out.println("id = " + id + " hire_date = " + d + " name = " + fname + " salary = " + sal);
                Employee eml =  new Employee (id,fname,lname,sal,jobName,depName);
                employees.add(eml);
            }
            for (Employee eml : employees)
            {
                ISalaryCalc calc = new SalaryCalculator(eml);
                double tottalSalary = calc.calcSalary();
                System.out.println(eml.getFname()
                        +" "+eml.getJobName()
                        +" "+eml.getSal()
                        + "Total salary = "+ tottalSalary);
            }
        } catch (SQLException ex) {
            System.out.printf("подробнее об ошибке %s", ex.toString());
        }
        //callFunctForTest(connection);
        callProcForTest(connection);
    }//main

    private static void callFunctForTest(Connection connection) {
        //callProcForTest(connection);
        System.out.println("call HR.FUNCT_FOR_TEST");
        //Вызов ХП
        //КОМАНДЫ НА ODBC диалекте
        String sql = "{? = call HR.FUNCT_FOR_TEST (?,?,?)}";
        //здесь аналог
        /*
        set SERVEROUTPUT ON
        declare
        res integer;
        begin
        res := HR.ADD_AUTHORS('petr Ivanov','+380957293321',1975);
        DBMS_OUTPUT.PUT_line('return = '||TO_CHAR(res));
        end;
        */
        CallableStatement stmt;
        try {
            stmt = connection.prepareCall(sql);
            //результат - парамерт 1 = тип String
            //2-й параметр команды odbc-, это 1-й параметр функции integer
//3-й параметр - это integer
//4-й = это String
stmt.registerOutParameter(1,
        java.sql.Types.VARCHAR);
stmt.setInt(2, 3);
int value = 7;
stmt.setInt(3, value);
stmt.registerOutParameter(4,
        java.sql.Types.VARCHAR);
//Вызов функции внутри базы данных
stmt.execute();
String resultValue = stmt.getString(1);
String outParamValue = stmt.getString(4);
System.out.println("result value is "
        + resultValue + " output param value is " + outParamValue);
stmt.close();
connection.close();
//
        } catch (SQLException ex) {
            System.out.printf("подробнее об ошибке %s", ex.toString());
        }
    }

    private static void callProcForTest(Connection connection) {
        System.out.println("call HR.PROC_FOR_TEST");
        //Вызов ХП
        //КОМАНДЫ НА ODBC диалекте
        String sql = "{call HR.PROC_FOR_TEST (?,?,?)}";
        //здесь аналог
  
        CallableStatement stmt;
        try {
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, 3);
            int value = 7;
            stmt.setInt(2, value);
            stmt.registerOutParameter(3,
                    java.sql.Types.VARCHAR);
//Вызов процедуры внутри базы данных
            stmt.execute();
            String outParamValue = stmt.getString(3);
            System.out.println(" output param value is " + outParamValue);
            stmt.close();
            connection.close();
//
        } catch (SQLException ex) {
            System.out.printf("подробнее об ошибке %s", ex.toString());
        }
    }

}
