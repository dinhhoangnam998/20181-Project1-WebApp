package knh.t7.repository;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import knh.t7.model.Order;
import knh.t7.model.User;

@Repository
public class OrderDao extends SimpleCrudDao  {

	@Autowired
	public SessionFactory factory;
	
	// for default date = new Date(), state = 0;
	public void save(User user) {
		Session session = factory.openSession();
		Transaction tx = null;
		Order t = new Order(user);
		try {
			tx = session.beginTransaction();
			session.save(t);
			tx.commit();
			System.out.println("    -->create 	" + t.toString() + " 	<--");
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	// for custom date and state
	public void save(User user, Date orderdate, int state) {
		Session session = factory.openSession();
		Transaction tx = null;
		Order t = new Order(user, orderdate, state);
		try {
			tx = session.beginTransaction();
			session.save(t);
			tx.commit();
			System.out.println("    -->create 	" + t.toString() + " 	<--");
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
