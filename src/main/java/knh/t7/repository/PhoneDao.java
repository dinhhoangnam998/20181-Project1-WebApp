package knh.t7.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import knh.t7.model.Address;
import knh.t7.model.Phone;
import knh.t7.model.User;

@Repository
public class PhoneDao extends SimpleCrudDao  {

	@Autowired
	public SessionFactory factory;
	
	public void save(User user, String phonenumber) {
		Session session = factory.openSession();
		Transaction tx = null;
		Phone t = new Phone(user, phonenumber);
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
