package knh.t7.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import knh.t7.model.Book;
import knh.t7.model.Book_InputDate;
import knh.t7.model.InputDate;

@Repository
public class Book_InputDao  extends SimpleCrudDao  {
	
	@Autowired
	public SessionFactory factory;
	
	public void save(Book book, InputDate inputdate, int coverprice, int quantity) {
		Session session = factory.openSession();
		Transaction tx = null;
		Book_InputDate t = new Book_InputDate(book, inputdate, coverprice, quantity);
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
