package knh.t7.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import knh.t7.model.Book;
import knh.t7.model.Order;
import knh.t7.model.OrderDetail;

@Repository
public class OrderDeatailDao extends SimpleCrudDao  {

	@Autowired
	public SessionFactory factory;
	
	public void save(Order order, Book book, int quantity) {
		Session session = factory.openSession();
		Transaction tx = null;
		OrderDetail t = new OrderDetail(order, book, quantity);
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
