package knh.t7.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import knh.t7.model.Book;
import knh.t7.model.BookType;
import knh.t7.model.Original;
import knh.t7.model.Publisher;

@Repository
public class BookDao extends SimpleCrudDao  {
	
	@Autowired
	public SessionFactory factory;
	
	public void save(Original original, BookType booktype, Publisher publisher, String describe, String language,
			int pagenumber) {
		Session session = factory.openSession();
		Transaction tx = null;
		Book t = new Book(original, booktype, publisher, describe, language, pagenumber);
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
