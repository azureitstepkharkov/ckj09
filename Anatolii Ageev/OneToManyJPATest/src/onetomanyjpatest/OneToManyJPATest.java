/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onetomanyjpatest;


//
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author User
 */
public class OneToManyJPATest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testDocsEctity();
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
        //Запросм не к БД а запросс к классам Hibernate:
        Query query = session.createQuery("SELECT e FROM Employees e");
        List<Employees> empls = query.list();
        for (Employees em : empls) {
            System.out.println(String.format("Found: %s\n", em));
            //
            for (DocsEntity de : em.getDocs()) {
                System.out.println(String.format("departments employees: %s", de));
            }
        }
        
        query = session.createQuery("SELECT d FROM Departments d");
        List<Departments> dep = query.list();
        for(Departments d:dep){
            System.out.println(d);
        }
        
        //
        session.close();
        //
    }
    
}
