package org.itstep.hibernatehroracleconnectiontest;

//импорты
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.Query;
import java.util.List;

public class HibernateHROracleConnectionTest {

    public static void main(String[] args) 
    {
        System.out.println("Hello world for Oracle");
        java.util.Locale locale = java.util.Locale.getDefault();
        java.util.Locale.setDefault(java.util.Locale.ENGLISH);
        testEmployeesEx();
        java.util.Locale.setDefault(locale);
    }
    //
    private static void testEmployeesEx() throws ExceptionInInitializerError, HibernateException {
        SessionFactory mFctory;
        try{
            mFctory = new Configuration().configure().buildSessionFactory();
        }catch (Throwable ex) {
            System.err.println("Couldn't create session factory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        Session session = null;
        Transaction tx = null;
        //
        session = mFctory.openSession();
        System.out.println("--- Find all Employees ---");
        Query query = session.createQuery("SELECT e FROM Employees e");
	List<Employees> employees = query.list();
	for (Employees foundEmployee : employees) 
        {
	System.out.println(String.format("Found: %s\n", foundEmployee));
        
        //for (Departments dep : foundEmployee.getDepartments()) 
        Departments dep = foundEmployee.getDepartments();
        {
	System.out.println(String.format("deps info: %s\n", dep));
        }
        //
        }
        session.close();
        //
    }
    //
}
