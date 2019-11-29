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
	
	void testListQuery() {
             System.out.println("testListQuery()");
		String hql = "from Category";
		Query query = session.createQuery(hql);
		List<Category> listCategories = query.list();
		
		for (Category aCategory : listCategories) {
			System.out.println(aCategory.getName());
		}
	}
	void testSearchQuery() {
            System.out.println("testSearchQuery()");
		String hql = "from Product where category.name = 'Computer'";
		Query query = session.createQuery(hql);
		List<Product> listProducts = query.list();
		
		for (Product aProduct : listProducts) {
			System.out.println(aProduct.getName());
		}
		
	}
	void testCountQuery() {
            System.out.println("testCountQuery()");
		String hql = "select count(name) from Product";//sum
		Query query = session.createQuery(hql);
		List listResult = query.list();
		Number number = (Number) listResult.get(0);
		System.out.println(number.intValue());//number.getFloat()
                        
	}
	
	
	void testQueryWithNamedParameters() {
            System.out.println("testQueryWithNamedParameters()");
		String hql = "from Product where description like :keyword";
		
		String keyword = "New";
		Query query = session.createQuery(hql);
		query.setParameter("keyword", "%" + keyword + "%");
		
		List<Product> listProducts = query.list();
		
		for (Product aProduct : listProducts) {
			System.out.println(aProduct.getName());
		}		
	}
	
	void testUpdateQuery() {
             System.out.println("testUpdateQuery()");
		String hql = "update Product set price = :price where id = :id";
		Query query = session.createQuery(hql);
		query.setParameter("price", 488.0f);
		query.setParameter("id", 2l);//тут тип long
		
		int rowsAffected = query.executeUpdate();
		if (rowsAffected > 0) {
			System.out.println("Updated " + rowsAffected + " rows.");
		}
	}
	
	void testDeleteQuery() {
             System.out.println("testDeleteQuery()");
		String hql = "delete from OldCategory where id = :catId";
		
		Query query = session.createQuery(hql);
		query.setParameter("catId", new Long(1));
		
		int rowsAffected = query.executeUpdate();
		if (rowsAffected > 0) {
			System.out.println("Deleted " + rowsAffected + " rows.");
		}
	}
	
        
        void testInsertQuery() {
            System.out.println("testInsertQuery()");
		// HQL doesn't support regular INSERT query
		// it supports INSERT only from another table
		// NOTE: the second table must be mapped as well
		String hql = "insert into Category (id, name)"
				+ " select id, name from OldCategory";
		Query query = session.createQuery(hql);	
		int rowsAffected = query.executeUpdate();
		if (rowsAffected > 0) {
			System.out.println(rowsAffected + "(s) were inserted");
		}
	}
        
	void testJoinQuery() {
            System.out.println("testJoinQuery()");
		String hql = "from Product p inner join p.category with p.price > 500";
		Query query = session.createQuery(hql);
		List<Object[]> listResult = query.list();
		
		for (Object[] aRow : listResult) {
			Product product = (Product) aRow[0];
			Category category = (Category) aRow[1];
			System.out.println(product.getName() + " - " + product.getPrice()
					+ " - " + category.getName());
		}		
	}
	
	void testOrderByQuery() {
            System.out.println("testOrderByQuery()");
		String hql = "from Product order by price ASC";
		Query query = session.createQuery(hql);
		List<Product> listProducts = query.list();
		
		for (Product aProduct : listProducts) {
			System.out.println(aProduct.getName() + "\t - " + aProduct.getPrice());
		}		
	}
	
	void testPaginationQuery() {
                System.out.println("testPaginationQuery()");
		String hql = "from Product";
		
		Query query = session.createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(2);
		
		List<Product> listProducts = query.list();
		
		for (Product aProduct : listProducts) {
			System.out.println(aProduct.getName() + "\t - " + aProduct.getPrice());
		}
	}
	
	void testGroupByQuery() {
            System.out.println("testGroupByQuery()");
		String hql = "select sum(p.price), p.category.name from Product p group by category";
		
		Query query = session.createQuery(hql);
		List<Object[]> listResult = query.list();
		
		for (Object[] aRow : listResult) {
			Double sum = (Double) aRow[0];
			String category = (String) aRow[1];
			System.out.println(category + " - " + sum);
		}
	}
	
	void testDateRangeQuery() throws ParseException {
            System.out.println("testDateRangeQuery()");
		String hql = "from Order where purchaseDate >= :beginDate and purchaseDate <= :endDate";
		Query query = session.createQuery(hql);
		
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		Date beginDate = dateFormatter.parse("2014-11-01");
		
		query.setParameter("beginDate", beginDate);
		
		Date endDate = dateFormatter.parse("2017-11-22");
		query.setParameter("endDate", endDate);
		
		List<Order> listOrders = query.list();
		
		for (Order anOrder : listOrders) {
			System.out.println(anOrder.getProduct().getName() + " - "
					+  anOrder.getAmount() + " - "
					+ anOrder.getPurchaseDate());
		}
	}
	
	void testArithmeticExpression() {
            System.out.println("testArithmeticExpression()");
		String hql = "from Product where price >= 100 and price <= 1000";
		Query query = session.createQuery(hql);
		List<Product> listProducts = query.list();
		
		for (Product aProduct : listProducts) {
			System.out.println(aProduct.getName() + "\t - " + aProduct.getPrice());
		}		
	}
	
	public static void main(String[] args) {
		HibernateQueryTestSQLiteJPA tester = new HibernateQueryTestSQLiteJPA();
		try {
			tester.openSession();
			
			tester.testListQuery();
			tester.testSearchQuery();
			tester.testQueryWithNamedParameters();
			tester.testCountQuery();


                        
                        tester.testInsertQuery();
                                                
			tester.testJoinQuery();
			tester.testOrderByQuery();
			//tester.testPaginationQuery();
			tester.testGroupByQuery();
			tester.testArithmeticExpression();
			tester.testDateRangeQuery();
                        
                        tester.testDeleteQuery();
			tester.testUpdateQuery();
                        
			
		} catch (ParseException ex) {
			ex.printStackTrace();
		} finally {
			tester.closeSession();
		}
//    
}
}
