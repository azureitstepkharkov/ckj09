package hibernatequerytestsqlitejpa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateQueryTestSQLiteJPA {
//
   private Session session;
	private ServiceRegistry serviceRegistry;
	
	void openSession() {
            System.out.println("openSession()");
		// loads configuration and mappings
		Configuration configuration = new Configuration().configure();
		serviceRegistry	= new StandardServiceRegistryBuilder()
		.applySettings(configuration.getProperties()).build();
		
		// builds a session factory from the service registry
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		// obtains the session
		session = sessionFactory.openSession();
		session.beginTransaction();
		
	}
	
	void closeSession() {
            System.out.println("closeSession()");
		session.getTransaction().commit();
		session.close();
		StandardServiceRegistryBuilder.destroy(serviceRegistry);
	}
	/*
	*/
	public static void main(String[] args) {
		HibernateQueryTestSQLiteJPA tester = new HibernateQueryTestSQLiteJPA();
		try {
			tester.openSession();
			
			tester.testListQuery();
//			tester.testSearchQuery();
//			tester.testQueryWithNamedParameters();
			tester.testCountQuery();
//
//
//                        
//                      tester.testInsertQuery();
//                                                
//			tester.testJoinQuery();
//			tester.testOrderByQuery();
//			tester.testPaginationQuery();
//			tester.testGroupByQuery();
//			tester.testArithmeticExpression();
//			tester.testDateRangeQuery();
//                        
//                      tester.testDeleteQuery();
//			tester.testUpdateQuery();
                        
		
		} catch (ParseException ex) {
			ex.printStackTrace();
		} finally {
			tester.closeSession();
		}
//    
}

    private void testListQuery() {
        System.out.println("TestListQuery()");
        String hgl = "From Category";
        Query query = session.createQuery(hgl);
        List<Category> listCategories = query.list();
        for (Category aCategory : listCategories)
        {
            System.out.println(aCategory.getName());
        }
    }

    private void testCountQuery() 
    {
        System.out.println("TestCountQuery()");
        String hql = "select count(name) from Product";
        Query query =  session.createQuery(hql);
            List listResult = query.list();
            Number number = (Number) listResult.get(0);
            System.out.println(number.intValue());
    }
}
