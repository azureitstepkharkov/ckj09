/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatesingletablexmlmapingtest;
import org.hibernate.Session;
/**
 *
 * @author User
 */
public class HibernateSingleTableXmlMapingTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Employee employee = new Employee("Тест11");
        User user = new User("Name1","Name2");
        session.save(employee);
        session.save(user);
        session.getTransaction().commit();
                
    }
    
}
