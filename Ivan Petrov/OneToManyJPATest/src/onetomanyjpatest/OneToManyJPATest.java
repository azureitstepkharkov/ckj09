package onetomanyjpatest;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyJPATest {

  
    public static void main(String[] args) 
    {
        testDocsEctity();
    }
     //
     private static void testDocsEctity() throws ExceptionInInitializerError, HibernateException {
        SessionFactory mFctory;
        try {
            mFctory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) 
        {
            System.err.println("Couldn't create session factory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        Session session = null;
        
        session = mFctory.openSession();
        System.out.println("--- Find all Employees && Docs ---");
        //Здесь не SQL запрос, а запрос к Hibernate. HQL
        Query query = session.createQuery("SELECT e FROM Employees e");
        //Employees - здесь это имя класса
        List<Employees> empls = query.list();
        for (Employees em : empls) {
            System.out.println(String.format("Found: %s\n", em));
            //
            for (DocsEntity de : em.getDocs()) {
                System.out.println(String.format("docs employees: %s", de));
            }
        }
        //
        session.close();
        //
    }
    //
}
