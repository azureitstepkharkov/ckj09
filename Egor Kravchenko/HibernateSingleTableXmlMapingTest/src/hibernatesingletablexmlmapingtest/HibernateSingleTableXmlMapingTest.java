package hibernatesingletablexmlmapingtest;
import org.hibernate.Session;

public class HibernateSingleTableXmlMapingTest {

    public static void main(String[] args) {
        System.out.println("Nbeans + Hibernate + SQLite3");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Employee employee = new Employee("Тест 14_02_19");
        session.save(employee);
        User user = new User("Ivan","Ivanov");
        session.save(user);
        session.getTransaction().commit();
    }
    
}
