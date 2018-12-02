package knh.t7.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import knh.t7.model.Book;
import knh.t7.model.Book_SaleDate;
import knh.t7.model.SaleDate;

@Repository
public class Book_SaleDateDao  extends SimpleCrudDao {
	
	@Autowired
	public SessionFactory factory;
	public void save(Book book, SaleDate saledate, int salepercent, int quantity) {
		Session session = factory.openSession();
		Transaction tx = null;
		Book_SaleDate t = new Book_SaleDate(book, saledate, salepercent, quantity);
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
