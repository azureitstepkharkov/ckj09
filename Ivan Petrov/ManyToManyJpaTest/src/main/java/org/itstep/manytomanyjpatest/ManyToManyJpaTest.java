package org.itstep.manytomanyjpatest;
//
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//
public class ManyToManyJpaTest {


    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Hello for SQL Many-To-Many");
     testEmployees();     
    //testDepartmentEx();
    }
    //
    private static void testEmployees() throws ExceptionInInitializerError, HibernateException {
        SessionFactory mFctory;
        try {
            mFctory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Couldn't create session factory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        Session session = mFctory.openSession();
        Transaction tx = null;
        Long employeesID = null;
        String name = "test name 1";
        int idCode = 1;
        try {
            tx = session.beginTransaction();
            Employees employee = new Employees(name, idCode);
            employeesID = (Long) session.save(employee);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        //
        session = mFctory.openSession();
        System.out.println("--- Find all Employees ---");
        Query query = session.createQuery("SELECT e FROM Employees e");
        List<Employees> employees = query.list();
        for (Employees foundEmployee : employees) {
            System.out.println(String.format("Found: %s\n", foundEmployee));
        }
        session.close();
        //
    }
    private static void testDepartmentEx() throws ExceptionInInitializerError, HibernateException {
        SessionFactory mFctory;
        try {
            mFctory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Couldn't create session factory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        Session session = null;
        session = mFctory.openSession();
        Transaction tx = null;
        Long departmentID = null;
        String name = "Dep#3";
        try {
            tx = session.beginTransaction();
            Department department = new Department(name);
            //
            List<Employees> empls = new ArrayList<Employees>(2);
            Employees e1 = new Employees("Иванов", -1);
            session.save(e1);
            Employees e2 = new Employees("Иванов 1", -1);
            session.save(e2);
            empls.add(e1);
            empls.add(e2);
            department.setEmployees(empls);
            //
            departmentID = (Long) session.save(department);
            tx.commit();
            System.out.println(String.format("Inserted: %s\n", departmentID));
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        session = mFctory.openSession();
        System.out.println("--- Find all Departments && Employees ---");
        Query query = session.createQuery("SELECT d FROM Department d");
        List<Department> departments = query.list();
        for (Department foundDepartment : departments) {
            System.out.println(String.format("Found: %s\n", foundDepartment));
            //
            for (Employees employee : foundDepartment.getEmployees()) {
                System.out.println(String.format("departments employees: %s", employee));
            }
        }
        //
        session.close();
        //
    }
    private static void testDocsEctity() throws ExceptionInInitializerError, HibernateException {
        SessionFactory mFctory;
        try {
            mFctory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Couldn't create session factory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        Session session = null;
        session = mFctory.openSession();
        
        session = mFctory.openSession();
        System.out.println("--- Find all Departments && Employees ---");
        Query query = session.createQuery("SELECT e FROM Employees e");
        List<Employees> empls = query.list();
        for (Employees em : empls) {
            System.out.println(String.format("Found: %s\n", em));
            //
            for (DocsEntity de : em.getDocs()) {
                System.out.println(String.format("departments employees: %s", de));
            }
        }
        //
        session.close();
        //
    }
    //
}
