package Model;

import java.sql.DriverManager;//управление версиями драйевров
import java.sql.Connection;//механизмы соединения БД
import java.sql.Statement;//для запросов select (update)
import java.sql.CallableStatement;//для работы с ХП
import java.sql.ResultSet;//хранилище результата выборки
//select

import java.util.Date;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;

public class DbHelper {

    public Vector<Employee> getEmployees() {
        Vector<Employee> v = new Vector<Employee>();
        //
        //Шаг 1 Подключить драйвер +
        //Шаг 2 Зарегистировать нужный
        //класс драйвера
        System.out.println("-------- Oracle JDBC Connection Testing ------");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("класс Oracle JDBC не найден в файле ojdbc6.jar");
            return v;
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
            return v;
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
            while (rs.next()) {
                int id = rs.getInt("EMPLOYEE_ID");
                Date d = rs.getDate("HIRE_DATE");
                System.out.println(rs.getString("HIRE_DATE"));
                //
                String fname = rs.getString("FIRST_NAME");
                String lname = rs.getString("LAST_NAME");
                float sal = rs.getFloat("SALARY");
                String depName = rs.getString("DEPARTMENT_NAME");;
                String managerName = rs.getString("MANAGER_FNAME");;
                String jobName = rs.getString("JOB_TITLE");
                //
                Employee emp1 = new Employee(id,
                        d,
                        fname,
                        lname,
                        sal,
                        depName,
                        managerName,
                        jobName);
                //
                v.add(emp1);
            }
        } catch (SQLException ex) {
            System.out.printf("подробнее об ошибке %s", ex.toString());
            return v;
        }
        //
        return v;
    }
    
    
    public Vector<Departments> getDepartments() {
        Vector<Departments> v = new Vector<Departments>();
        //
        //Шаг 1 Подключить драйвер +
        //Шаг 2 Зарегистировать нужный
        //класс драйвера
        System.out.println("-------- Oracle JDBC Connection Testing ------");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("класс Oracle JDBC не найден в файле ojdbc6.jar");
            return v;
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
            return v;
        }
        //
        System.out.println("You made it, take control your database now!");
        String sqlText  = "SELECT "
                + " HR.DEPARTMENTS.DEPARTMENT_ID"
                + ",HR.DEPARTMENTS.DEPARTMENT_NAME"
                + " FROM HR.DEPARTMENTS";
        Statement st;//механизм выполнения команд SQL
        try {
            st = connection.createStatement();//настроился на нужную БД
            ResultSet rs = st.executeQuery(sqlText);
            while (rs.next()) {
                int idDepartment = rs.getInt("DEPARTMENT_ID");
                String dname = rs.getString("DEPARTMENT_NAME");
                System.out.println(idDepartment  +"   " + dname);
                
                Departments dpmt = new Departments(idDepartment,
                        dname);
                //
                System.out.println(dpmt);
                v.add(dpmt);
            }
        } catch (SQLException ex) {
            System.out.printf("подробнее об ошибке %s", ex.toString());
            return v;
        }
        //
        return v;
    }
    
    public Vector<Book> getBooks() {
        Vector<Book> v = new Vector<Book>();

        System.out.println("-------- Oracle JDBC Connection Testing ------");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("класс Oracle JDBC не найден в файле ojdbc6.jar");
            return v;
        }
        System.out.println("Oracle JDBC Driver Registered!");
        Connection connection = null;
        try {
            java.util.Locale locale = java.util.Locale.getDefault();
            java.util.Locale.setDefault(java.util.Locale.ENGLISH);
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system",
                    "123");
            java.util.Locale.setDefault(locale);
        } catch (SQLException ex) {
            System.out.println("Или серевер не доступен, или пользователь не существует, или пароль не подходит");
            System.out.printf("подробнее об ошибке 1 %s", ex.toString());
            return v;
        }
        //
        System.out.println("You made it, take control your database now!");
        String sqlText = "SELECT "
                + "HR.BOOKS.ID"
                + ", HR.BOOKS.TITLE"
                + ", HR.BOOKS.AUTHORS_ID"
                + ", HR.BOOKS.P_YEAR"
                + " FROM HR.BOOKS";
        Statement st;//механизм выполнения команд SQL
        try {
            st = connection.createStatement();//настроился на нужную БД
            ResultSet rs = st.executeQuery(sqlText);
            while (rs.next()) {
                int id = rs.getInt("ID");
                String title = rs.getString("TITLE");
                int autorId = rs.getInt("AUTHORS_ID");
                int year = rs.getInt("P_YEAR");
                System.out.println(id +"   " + title + "  " + autorId + "  " + year);
                
                Book book = new Book(id,title, autorId, year);
                //
                System.out.println(book);
                v.add(book);
            }
        } catch (SQLException ex) {
            System.out.printf("подробнее об ошибке 2 %s", ex.toString());
            return v;
        }
        //
        return v;
    }
}
